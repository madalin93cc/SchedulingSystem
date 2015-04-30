package schedulingsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.service.ConferenceRoomService;

import javax.inject.Inject;

/**
 * Created by Colezea on 30/04/2015.
 */
@RestController
public class ConferenceRoomController {

    @Inject
    private ConferenceRoomService conferenceRoomService;

    @RequestMapping(value = "/add/conferenceroom/")
    public ConferenceRoom addConferenceRoom(){

        return new ConferenceRoom();
    }
}
