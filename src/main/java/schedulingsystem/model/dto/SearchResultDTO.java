package schedulingsystem.model.dto;

import schedulingsystem.model.entity.ConferenceRoom;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Madalin.Colezea on 5/18/2015.
 */
public class SearchResultDTO implements Serializable {
    private Long id;

    private String name;

    private Integer placesNumber;

    private String location;

    private Date date;

    public SearchResultDTO() {
    }

    public SearchResultDTO(Long id, String name, Integer placesNumber, String location) {
        this.id = id;
        this.name = name;
        this.placesNumber = placesNumber;
        this.location = location;
    }

    public SearchResultDTO(ConferenceRoom conferenceRoom){
        this.id = conferenceRoom.getId();
        this.name = conferenceRoom.getName();
        this.placesNumber = conferenceRoom.getPlacesNumber();
        this.location = conferenceRoom.getFkLocation().getCity();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlacesNumber() {
        return placesNumber;
    }

    public void setPlacesNumber(Integer placesNumber) {
        this.placesNumber = placesNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
