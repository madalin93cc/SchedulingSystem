package schedulingsystem.utils;

/**
 * Created by Colezea on 26/04/2015.
 */
public interface RequestMappings {

    public static final String GET_NEW_CONFERENCEROOM = "/get/newconferenceroom/";
    public static final String GET_NEW_SEARCH_CONFERENCEROOM = "/get/newsearchconferenceroom/";
    public static final String ADD_CONFERENCEROOM = "/add/conferenceroom/";
    public static final String DELETE_CONFERENCEROOM = "/delete/conferenceroom/";
    public static final String UPDATE_CONFERENCEROOM = "/update/conferenceroom/";
    public static final String ADD_SEARCH_CONFERENCEROOM = "/add/searchconferenceroom";
    public static final String RESERVEROOM_CITYES = "/rezervasala/cityes";
    public static final String RESERVEROOM_CAPACITYES = "/rezervasala/capacityes";
    public static final String EDIT_CONFERENCEROOM_ROOMS = "/editaresala/rooms";
    public static final String RESERVE_ROOM = "/reserveroom";
    public static final String GET_ALL_REQUESTS = "getallrequests";
    public static final String GET_REQUESTS_FOR_CONFIRMATION = "getrequestforconfirmation";
    public static final String CONFIRM_REQUEST = "confirmrequest";
    public static final String REJECT_REQUEST = "rejectrequest";
}