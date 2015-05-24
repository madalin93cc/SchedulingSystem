package schedulingsystem.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.dto.*;
import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.service.ConferenceRoomService;
import schedulingsystem.model.service.LocationService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Colezea on 30/04/2015.
 */
@RestController
public class ConferenceRoomController {

    @Inject
    private ConferenceRoomService conferenceRoomService;

    @Inject
    private LocationService locationService;

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

    @RequestMapping(value = "/delete/conferenceroom/", method = RequestMethod.POST, produces ="application/json")
    public Boolean deleteConferenceRoom(@RequestBody Long id){
        conferenceRoomService.deleteConferenceRoom(id);
        return true;
    }

    @RequestMapping(value = "/update/conferenceroom/", method = RequestMethod.POST, produces ="application/json")
    public ConferenceRoom updateConferenceRoom(@RequestBody ConferenceRoomDTO body){
        return conferenceRoomService.updateConferenceRoom(body);
    }

    @RequestMapping(value = "/add/searchconferenceroom", method = RequestMethod.POST, produces ="application/json")
    public List<SearchResultDTO> searchConferenceRoom (@RequestBody SearchConferenceRoomDTO body){
        return conferenceRoomService.getSearchResult(body);
    }

    @RequestMapping(value = "/rezervasala/cityes", method = RequestMethod.GET)
    public List<String> getCityes(){
        return locationService.getAllCityes();
    }

    @RequestMapping(value = "/rezervasala/capacityes", method = RequestMethod.GET)
    public List<String> getCapacityes(){
        return conferenceRoomService.getAllCapacityes();
    }

    @RequestMapping(value = "/editaresala/rooms", method = RequestMethod.GET)
    public List<ConferenceRoomDTO> getAllRoomsByOwner(){
        return conferenceRoomService.getAllRoomsByOwner();
    }

    @RequestMapping(value = "/reserveroom", method = RequestMethod.POST)
    public Boolean reserveRoom(@RequestBody SearchResultDTO searchResultDTO){
        return conferenceRoomService.reserveRoom(searchResultDTO);
    }

    @RequestMapping(value = "getallrequests", method = RequestMethod.GET)
    public List<ReservationCheckDTO> getAllRequestsByUser(){
        return conferenceRoomService.getAllRequestsByUser();
    }

    @RequestMapping(value = "getrequestforconfirmation", method = RequestMethod.GET)
    public List<ReservationCheckDTO> getAllRequestsForConfirmationByUser(){
        return conferenceRoomService.getAllRequestsForConfirmationByUser();
    }

    @RequestMapping(value = "confirmrequest", method = RequestMethod.POST, produces = "application/json")
    public Boolean confirmRequest(@RequestBody ReservationCheckDTO reservationCheckDTO){
        return conferenceRoomService.confirmRequest(reservationCheckDTO);
    }

    @RequestMapping(value = "rejectrequest", method = RequestMethod.POST, produces = "application/json")
    public Boolean rejectRequest(@RequestBody ReservationCheckDTO reservationCheckDTO){
        return conferenceRoomService.rejectRequest(reservationCheckDTO);
    }
}
