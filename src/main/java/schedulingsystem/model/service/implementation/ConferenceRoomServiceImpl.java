package schedulingsystem.model.service.implementation;

import org.springframework.stereotype.Service;
import schedulingsystem.model.dto.ConferenceRoomDTO;
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
        return conferenceRoomRepository.save(conferenceRoom);
    }
}
