package schedulingsystem.model.service;

import schedulingsystem.model.dto.ConferenceRoomDTO;
import schedulingsystem.model.dto.SearchConferenceRoomDTO;
import schedulingsystem.model.dto.SearchResultDTO;
import schedulingsystem.model.entity.ConferenceRoom;

import java.util.List;

/**
 * Created by Colezea on 28/04/2015.
 */
public interface ConferenceRoomService {

    public ConferenceRoom saveConferenceRoom(ConferenceRoomDTO conferenceRoomDTO);

    public ConferenceRoom updateConferenceRoom(ConferenceRoomDTO conferenceRoomDTO);

    public void deleteConferenceRoom(Long id);

    public List<String> getAllCapacityes();

    public List<SearchResultDTO> getSearchResult(SearchConferenceRoomDTO searchConferenceRoomDTO);

    public List<ConferenceRoomDTO> getAllRoomsByOwner();

    public Boolean reserveRoom(SearchResultDTO searchResultDTO);
}
