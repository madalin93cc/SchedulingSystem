package schedulingsystem.model.service.implementation;

import org.springframework.stereotype.Service;
import schedulingsystem.config.SchedulingSystemApplication;
import schedulingsystem.model.dto.ConferenceRoomDTO;
import schedulingsystem.model.dto.SearchConferenceRoomDTO;
import schedulingsystem.model.dto.SearchResultDTO;
import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.entity.Equipment;
import schedulingsystem.model.entity.Features;
import schedulingsystem.model.entity.Location;
import schedulingsystem.model.repository.ConferenceRoomRepository;
import schedulingsystem.model.repository.EquipmentRepository;
import schedulingsystem.model.repository.FeaturesRepository;
import schedulingsystem.model.repository.LocationRepository;
import schedulingsystem.model.service.ConferenceRoomService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public ConferenceRoom saveConferenceRoom(ConferenceRoomDTO conferenceRoomDTO) {
        String bigCity = conferenceRoomDTO.getFkLocation().getCity();
        bigCity.trim();
        bigCity = bigCity.substring(0,1).toUpperCase() + bigCity.substring(1).toLowerCase();
        conferenceRoomDTO.getFkLocation().setCity(bigCity);
        Equipment equipment = new Equipment(conferenceRoomDTO.getFkEquipment());
        Features features = new Features(conferenceRoomDTO.getFkFeatures());
        Location location = new Location(conferenceRoomDTO.getFkLocation());

        Equipment equipment1 = equipmentRepository.save(equipment);
        Features features1 = featuresRepository.save(features);
        Location location1 = locationRepository.save(location);

        ConferenceRoom conferenceRoom = new ConferenceRoom(conferenceRoomDTO, equipment1.getId(), features1.getId(), location1.getId());
        conferenceRoom.setFkLocation(location1);
        conferenceRoom.setFkFeatures(features1);
        conferenceRoom.setFkEquipment(equipment1);
        conferenceRoom.setFkOwner(SchedulingSystemApplication.userLoged);
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

    @Override
    public List<SearchResultDTO> getSearchResult(SearchConferenceRoomDTO searchConferenceRoomDTO) {
        return null;
    }

    @Override
    public List<ConferenceRoomDTO> getAllRoomsByOwner() {
        List<ConferenceRoom> conferenceRooms = conferenceRoomRepository.findByFkOwner(SchedulingSystemApplication.userLoged);
        List<ConferenceRoomDTO> conferenceRoomDTOs = new ArrayList<>();
        for (ConferenceRoom room: conferenceRooms){
            conferenceRoomDTOs.add(new ConferenceRoomDTO(room));
        }
        return conferenceRoomDTOs;
    }
}
