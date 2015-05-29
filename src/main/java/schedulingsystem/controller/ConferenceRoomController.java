package schedulingsystem.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.dto.*;
import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.service.ConferenceRoomService;
import schedulingsystem.model.service.LocationService;
import schedulingsystem.utils.RequestMappings;

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

    @RequestMapping(value = RequestMappings.GET_NEW_CONFERENCEROOM, method = RequestMethod.GET)
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

    @RequestMapping(value = RequestMappings.GET_NEW_SEARCH_CONFERENCEROOM, method = RequestMethod.GET)
    public SearchConferenceRoomDTO getSearchConferenceRoomDTO(){
        SearchConferenceRoomDTO searchConferenceRoomDTO = new SearchConferenceRoomDTO();
        FeaturesDTO featuresDTO = new FeaturesDTO();
        EquipmentDTO equipmentDTO = new EquipmentDTO();
        searchConferenceRoomDTO.setEquipmentDTO(equipmentDTO);
        searchConferenceRoomDTO.setFeaturesDTO(featuresDTO);

        return searchConferenceRoomDTO;
    }

    @RequestMapping(value = RequestMappings.ADD_CONFERENCEROOM, method = RequestMethod.POST, produces ="application/json")
    public ConferenceRoom addConferenceRoom(@RequestBody ConferenceRoomDTO body){
        return conferenceRoomService.saveConferenceRoom(body);
    }

    @RequestMapping(value = RequestMappings.DELETE_CONFERENCEROOM, method = RequestMethod.POST, produces ="application/json")
    public ConferenceRoom deleteConferenceRoom(@RequestBody Long id){
        return conferenceRoomService.deleteConferenceRoom(id);
    }

    @RequestMapping(value = RequestMappings.UPDATE_CONFERENCEROOM, method = RequestMethod.POST, produces ="application/json")
    public ConferenceRoom updateConferenceRoom(@RequestBody ConferenceRoomDTO body){
        return conferenceRoomService.updateConferenceRoom(body);
    }

    @RequestMapping(value = RequestMappings.ADD_SEARCH_CONFERENCEROOM, method = RequestMethod.POST, produces ="application/json")
    public List<SearchResultDTO> searchConferenceRoom (@RequestBody SearchConferenceRoomDTO body){
        return conferenceRoomService.getSearchResult(body);
    }

    @RequestMapping(value = RequestMappings.RESERVEROOM_CITYES, method = RequestMethod.GET)
    public List<String> getCityes(){
        return locationService.getAllCityes();
    }

    @RequestMapping(value = RequestMappings.RESERVEROOM_CAPACITYES, method = RequestMethod.GET)
    public List<String> getCapacityes(){
        return conferenceRoomService.getAllCapacityes();
    }

    @RequestMapping(value = RequestMappings.EDIT_CONFERENCEROOM_ROOMS, method = RequestMethod.GET)
    public List<ConferenceRoomDTO> getAllRoomsByOwner(){
        return conferenceRoomService.getAllRoomsByOwner();
    }

    @RequestMapping(value = RequestMappings.RESERVE_ROOM, method = RequestMethod.POST)
    public Boolean reserveRoom(@RequestBody SearchResultDTO searchResultDTO){
        return conferenceRoomService.reserveRoom(searchResultDTO);
    }

    @RequestMapping(value = RequestMappings.GET_ALL_REQUESTS, method = RequestMethod.GET)
    public List<ReservationCheckDTO> getAllRequestsByUser(){
        return conferenceRoomService.getAllRequestsByUser();
    }

    @RequestMapping(value = RequestMappings.GET_REQUESTS_FOR_CONFIRMATION, method = RequestMethod.GET)
    public List<ReservationCheckDTO> getAllRequestsForConfirmationByUser(){
        return conferenceRoomService.getAllRequestsForConfirmationByUser();
    }

    @RequestMapping(value = RequestMappings.CONFIRM_REQUEST, method = RequestMethod.POST, produces = "application/json")
    public Boolean confirmRequest(@RequestBody ReservationCheckDTO reservationCheckDTO){
        return conferenceRoomService.confirmRequest(reservationCheckDTO);
    }

    @RequestMapping(value = RequestMappings.REJECT_REQUEST, method = RequestMethod.POST, produces = "application/json")
    public Boolean rejectRequest(@RequestBody ReservationCheckDTO reservationCheckDTO){
        return conferenceRoomService.rejectRequest(reservationCheckDTO);
    }
}
