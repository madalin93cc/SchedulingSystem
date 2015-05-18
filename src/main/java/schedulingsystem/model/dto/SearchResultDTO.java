package schedulingsystem.model.dto;

import java.io.Serializable;

/**
 * Created by Madalin.Colezea on 5/18/2015.
 */
public class SearchResultDTO implements Serializable {
    private String name;

    private Integer placesNumber;

    private String location;

    public SearchResultDTO() {
    }

    public SearchResultDTO(String name, Integer placesNumber, String location) {
        this.name = name;
        this.placesNumber = placesNumber;
        this.location = location;
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
}
