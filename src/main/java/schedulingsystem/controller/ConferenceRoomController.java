package schedulingsystem.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.dto.*;
import schedulingsystem.model.entity.*;
import schedulingsystem.model.service.ConferenceRoomService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/get/newsearchconferenceroom/", method = RequestMethod.GET)
    public SearchConferenceRoomDTO getSearchConferenceRoomDTO(){
        SearchConferenceRoomDTO searchConferenceRoomDTO = new SearchConferenceRoomDTO();
        FeaturesDTO featuresDTO = new FeaturesDTO();
        EquipmentDTO equipmentDTO = new EquipmentDTO();
        searchConferenceRoomDTO.setEquipmentDTO(equipmentDTO);
        searchConferenceRoomDTO.setFeaturesDTO(featuresDTO);

        return searchConferenceRoomDTO;
    }

    @RequestMapping(value = "/add/conferenceroom/", method = RequestMethod.POST, produces ="application/json")
    public ConferenceRoom addConferenceRoom(@RequestBody ConferenceRoomDTO body){
        return conferenceRoomService.saveConferenceRoom(body);
    }

    @RequestMapping(value = "/rezervasala/cityes", method = RequestMethod.GET)
    public List<String> getCityes(){
        List<String> cityes = new ArrayList<>();
        cityes.add("city1");
        cityes.add("city2");
        return cityes;
    }

    @RequestMapping(value = "/rezervasala/capacityes", method = RequestMethod.GET)
    public List<Integer> getCapacityes(){
        List<Integer> capacityes = new ArrayList<>();
        capacityes.add(1);
        capacityes.add(2);
        return capacityes;
    }
}
