package schedulingsystem.model.service.implementation;

import org.springframework.stereotype.Service;
import schedulingsystem.config.SchedulingSystemApplication;
import schedulingsystem.model.dto.ConferenceRoomDTO;
import schedulingsystem.model.dto.ReservationCheckDTO;
import schedulingsystem.model.dto.SearchConferenceRoomDTO;
import schedulingsystem.model.dto.SearchResultDTO;
import schedulingsystem.model.entity.*;
import schedulingsystem.model.repository.*;
import schedulingsystem.model.service.ConferenceRoomService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Colezea on 28/04/2015.
 */
@Service
@Transactional
public class ConferenceRoomServiceImpl implements ConferenceRoomService{

    @Inject
    ConferenceRoomRepository conferenceRoomRepository;

    @Inject
    EquipmentRepository equipmentRepository;

    @Inject
    FeaturesRepository featuresRepository;

    @Inject
    LocationRepository locationRepository;

    @Inject
    ReservationRepository reservationRepository;

    @Override
    public ConferenceRoom saveConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        String bigCity = conferenceRoomDTO.getFkLocation().getCity();
        bigCity.trim();
        bigCity = bigCity.substring(0,1).toUpperCase() + bigCity.substring(1).toLowerCase();
        conferenceRoomDTO.getFkLocation().setCity(bigCity);

        List<String> names = conferenceRoomRepository.getAllNames();
        if (names.contains(conferenceRoomDTO.getName()) == true){
            return null;
        }
        Equipment equipment = new Equipment(conferenceRoomDTO.getFkEquipment());
        Features features = new Features(conferenceRoomDTO.getFkFeatures());
        Location location = new Location(conferenceRoomDTO.getFkLocation());

        Equipment equipment1 = equipmentRepository.save(equipment);
        Features features1 = featuresRepository.save(features);
        Location location1 = locationRepository.save(location);

        ConferenceRoom conferenceRoom = new ConferenceRoom(conferenceRoomDTO);
        conferenceRoom.setFkLocation(location1);
        conferenceRoom.setFkFeatures(features1);
        conferenceRoom.setFkEquipment(equipment1);
        conferenceRoom.setFkOwner(SchedulingSystemApplication.userLoged);

        conferenceRoom.setIsDeleted(false);
        return conferenceRoomRepository.save(conferenceRoom);
    }

    @Override
    public ConferenceRoom updateConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        List<String> names = conferenceRoomRepository.getAllNames();
        if (names.contains(conferenceRoomDTO.getName()) == true){
            return null;
        }

        ConferenceRoom conferenceRoom = conferenceRoomRepository.findOne(conferenceRoomDTO.getId());

        List<Reservation> reservations = reservationRepository.findByFkConferenceRoom(conferenceRoom);
        if (reservations.size() != 0){
            return null;
        }

        Location location = locationRepository.save(new Location(conferenceRoomDTO.getFkLocation()));
        Features features = featuresRepository.save(new Features(conferenceRoomDTO.getFkFeatures()));
        Equipment equipment = equipmentRepository.save(new Equipment(conferenceRoomDTO.getFkEquipment()));
        conferenceRoom.setName(conferenceRoomDTO.getName());
        conferenceRoom.setPlacesNumber(conferenceRoomDTO.getPlacesNumber());
        conferenceRoom.setSurface(conferenceRoomDTO.getSurface());

        return conferenceRoomRepository.save(conferenceRoom);
    }

    @Override
    public ConferenceRoom deleteConferenceRoom(Long id) {
        ConferenceRoom conferenceRoom = conferenceRoomRepository.findOne(id);
        List<Reservation> reservations = reservationRepository.findByFkConferenceRoom(conferenceRoom);
        if (reservations.size() != 0){
            return null;
        }
        conferenceRoom.setIsDeleted(true);
        return conferenceRoomRepository.save(conferenceRoom);
    }

    @Override
    public List<String> getAllCapacityes() {
        List<String> capacityes = new ArrayList<>();
        capacityes.add("< 50");
        capacityes.add("50 - 100");
        capacityes.add("101 - 150");
        capacityes.add("151 - 250");
        capacityes.add("251 - 500");
        capacityes.add(("> 500"));
        return capacityes;
    }

    private Integer getNumberPlaces(Integer capacity){
        switch (capacity){
            case 1:{
                return 0;
            }
            case 2:{
                return 50;
            }
            case 3:{
                return 101;
            }
            case 4:{
                return 151;
            }
            case 5:{
                return 251;
            }
            case 6:{
                return 501;
            }
            default:{
                return 0;
            }
        }
    }

    @Override
    public List<SearchResultDTO> getSearchResult(SearchConferenceRoomDTO searchConferenceRoomDTO) {
        List<SearchResultDTO> searchResultDTOs = new ArrayList<>();
        Integer capacity = getNumberPlaces(searchConferenceRoomDTO.getCapacity());
        List<ConferenceRoom> conferenceRooms = conferenceRoomRepository.findAllNotDeleted();

        Stream<ConferenceRoom> conferenceRoomStream = conferenceRooms.stream().filter(c->c.getFkLocation().getCity().compareTo(searchConferenceRoomDTO.getLocation()) == 0)
                .filter(c->c.getPlacesNumber() >= capacity);

        List<ConferenceRoom> conferenceRoomList = conferenceRoomStream.collect(Collectors.toList());
        for (ConferenceRoom conferenceRoom: conferenceRoomList){
            searchResultDTOs.add(new SearchResultDTO(conferenceRoom));
        }
        return searchResultDTOs;
    }

    @Override
    public List<ConferenceRoomDTO> getAllRoomsByOwner() {
        List<ConferenceRoom> conferenceRooms = conferenceRoomRepository.findByFkOwnerAndIsDeleted(SchedulingSystemApplication.userLoged, false);
        List<ConferenceRoomDTO> conferenceRoomDTOs = new ArrayList<>();
        for (ConferenceRoom room: conferenceRooms){
            conferenceRoomDTOs.add(new ConferenceRoomDTO(room));
        }
        return conferenceRoomDTOs;
    }

    @Override
    public Boolean reserveRoom(SearchResultDTO searchResultDTO) {
        Reservation reservation = new Reservation();
        reservation.setDate(searchResultDTO.getDate());
        reservation.setStatus(0);
        reservation.setFkUserCreated(SchedulingSystemApplication.userLoged);
        ConferenceRoom conferenceRoom = conferenceRoomRepository.findOne(searchResultDTO.getId());
        reservation.setFkConferenceRoom(conferenceRoom);
        Reservation reservation1 =  reservationRepository.save(reservation);
        if (reservation1!=null) return true;
        else return false;
    }

    @Override
    public List<ReservationCheckDTO> getAllRequestsByUser() {
        List<Reservation> reservations = reservationRepository.findByFkUserCreated(SchedulingSystemApplication.userLoged);
        List<ReservationCheckDTO> reservationCheckDTOs = new ArrayList<>();

        for (Reservation reservation:reservations){
            reservationCheckDTOs.add(new ReservationCheckDTO(reservation));
        }

        return reservationCheckDTOs;
    }

    @Override
    public List<ReservationCheckDTO> getAllRequestsForConfirmationByUser() {
        List<Reservation> reservations = reservationRepository.findAllForConfirmation(SchedulingSystemApplication.userLoged);
        List<ReservationCheckDTO> reservationCheckDTOs = new ArrayList<>();

        for (Reservation reservation:reservations){
            reservationCheckDTOs.add(new ReservationCheckDTO(reservation));
        }

        return reservationCheckDTOs;
    }

    @Override
    public Boolean confirmRequest(ReservationCheckDTO reservationCheckDTO) {
        Reservation reservation = reservationRepository.findOne(reservationCheckDTO.getId());
        reservation.setStatus(1);
        reservationRepository.save(reservation);
        return true;
    }

    @Override
    public Boolean rejectRequest(ReservationCheckDTO reservationCheckDTO) {
        Reservation reservation = reservationRepository.findOne(reservationCheckDTO.getId());
        reservation.setStatus(2);
        reservationRepository.save(reservation);
        return true;
    }
}
