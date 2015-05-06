package schedulingsystem.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.dto.ConferenceRoomDTO;
import schedulingsystem.model.dto.EquipmentDTO;
import schedulingsystem.model.dto.FeaturesDTO;
import schedulingsystem.model.dto.LocationDTO;
import schedulingsystem.model.entity.*;
import schedulingsystem.model.service.ConferenceRoomService;

import javax.inject.Inject;

/**
 * Created by Colezea on 30/04/2015.
 */
@RestController
public class ConferenceRoomController {

    @Inject
    private ConferenceRoomService conferenceRoomService;

    @RequestMapping(value = "/get/newconferenceroom/", method = RequestMethod.GET)
    public ConferenceRoomDTO getNewConferenceRoom(){
        ConferenceRoomDTO conferenceRoom = new ConferenceRoomDTO();
        FeaturesDTO featuresDTO = new FeaturesDTO();
        LocationDTO locationDTO = new LocationDTO();
        EquipmentDTO equipmentDTO = new EquipmentDTO();
        conferenceRoom.setFkFeatures(featuresDTO);
        conferenceRoom.setFkEquipment(equipmentDTO);
        conferenceRoom.setFkLocation(locationDTO);
        return conferenceRoom;
    }

    @RequestMapping(value = "/add/conferenceroom/", method = RequestMethod.POST, produces ="application/json")
    public ConferenceRoom addConferenceRoom(@RequestBody ConferenceRoomDTO body){
        return conferenceRoomService.saveConferenceRoom(body);
    }
}
