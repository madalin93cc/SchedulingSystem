package schedulingsystem.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.entity.User;
import schedulingsystem.model.service.ConferenceRoomService;

import javax.inject.Inject;

/**
 * Created by Colezea on 30/04/2015.
 */
@RestController
public class ConferenceRoomController {

    @Inject
    private ConferenceRoomService conferenceRoomService;

    @RequestMapping(value = "/add/conferenceroom/", method = RequestMethod.POST, produces ="application/json")
    public ConferenceRoom addConferenceRoom(@RequestBody Object obj){
        obj.toString();
        return new ConferenceRoom();
    }
}
