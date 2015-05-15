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
}
