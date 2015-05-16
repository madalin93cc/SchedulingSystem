package schedulingsystem.model.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Madalin.Colezea on 5/15/2015.
 */
public class SearchConferenceRoomDTO implements Serializable{


    private String location;
    private Integer capacity;
    private Date date;

    private FeaturesDTO featuresDTO;
    private EquipmentDTO equipmentDTO;

    public SearchConferenceRoomDTO() {
    }

    public SearchConferenceRoomDTO(String location, Integer capacity, Date date, FeaturesDTO featuresDTO, EquipmentDTO equipmentDTO) {
        this.location = location;
        this.capacity = capacity;
        this.date = date;
        this.featuresDTO = featuresDTO;
        this.equipmentDTO = equipmentDTO;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public FeaturesDTO getFeaturesDTO() {
        return featuresDTO;
    }

    public void setFeaturesDTO(FeaturesDTO featuresDTO) {
        this.featuresDTO = featuresDTO;
    }

    public EquipmentDTO getEquipmentDTO() {
        return equipmentDTO;
    }

    public void setEquipmentDTO(EquipmentDTO equipmentDTO) {
        this.equipmentDTO = equipmentDTO;
    }
}
