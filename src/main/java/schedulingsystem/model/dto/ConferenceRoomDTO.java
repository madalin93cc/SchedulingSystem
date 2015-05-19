package schedulingsystem.model.dto;

import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.entity.Equipment;
import schedulingsystem.model.entity.Features;
import schedulingsystem.model.entity.Location;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Madalin.Colezea on 5/5/2015.
 */
public class ConferenceRoomDTO implements Serializable{
    private Long id;

    private String name;

    private Integer placesNumber;

    private Integer surface;

    private LocationDTO fkLocation;

    private FeaturesDTO fkFeatures;

    private EquipmentDTO fkEquipment;

    public ConferenceRoomDTO() {
    }

    public ConferenceRoomDTO(Long id, String name, Integer placesNumber, Integer surface, LocationDTO fkLocation, FeaturesDTO fkFeatures, EquipmentDTO fkEquipment) {
        this.id = id;
        this.name = name;
        this.placesNumber = placesNumber;
        this.surface = surface;
        this.fkLocation = fkLocation;
        this.fkFeatures = fkFeatures;
        this.fkEquipment = fkEquipment;
    }

    public ConferenceRoomDTO(ConferenceRoom conferenceRoom){
        this.id = conferenceRoom.getId();
        this.name = conferenceRoom.getName();
        this.placesNumber = conferenceRoom.getPlacesNumber();
        this.surface = conferenceRoom.getSurface();
        this.fkEquipment = new EquipmentDTO(conferenceRoom.getFkEquipment());
        this.fkFeatures = new FeaturesDTO(conferenceRoom.getFkFeatures());
        this.fkLocation = new LocationDTO(conferenceRoom.getFkLocation());
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

    public Integer getSurface() {
        return surface;
    }

    public void setSurface(Integer surface) {
        this.surface = surface;
    }

    public LocationDTO getFkLocation() {
        return fkLocation;
    }

    public void setFkLocation(LocationDTO fkLocation) {
        this.fkLocation = fkLocation;
    }

    public FeaturesDTO getFkFeatures() {
        return fkFeatures;
    }

    public void setFkFeatures(FeaturesDTO fkFeatures) {
        this.fkFeatures = fkFeatures;
    }

    public EquipmentDTO getFkEquipment() {
        return fkEquipment;
    }

    public void setFkEquipment(EquipmentDTO fkEquipment) {
        this.fkEquipment = fkEquipment;
    }
}
