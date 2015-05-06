package schedulingsystem.model.service;

import schedulingsystem.model.dto.ConferenceRoomDTO;
import schedulingsystem.model.entity.ConferenceRoom;

/**
 * Created by Colezea on 28/04/2015.
 */
public interface ConferenceRoomService {

    public ConferenceRoom saveConferenceRoom(ConferenceRoomDTO conferenceRoomDTO);
}
