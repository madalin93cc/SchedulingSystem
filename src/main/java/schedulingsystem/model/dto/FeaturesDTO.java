package schedulingsystem.model.dto;

import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.entity.Features;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Madalin.Colezea on 5/5/2015.
 */
public class FeaturesDTO implements Serializable {

    private Long id;

    private Boolean climateSystem;

    private Boolean naturalLight;

    private Boolean darkness;

    private Boolean scene;

    private Boolean catering;

    private Boolean restaurant;

    private Boolean parking;

    private Boolean elevator;

    public FeaturesDTO() {
    }

    public FeaturesDTO(Long id, Boolean climateSystem, Boolean naturalLight, Boolean darkness, Boolean scene, Boolean catering, Boolean restaurant, Boolean parking, Boolean elevator) {
        this.id = id;
        this.climateSystem = climateSystem;
        this.naturalLight = naturalLight;
        this.darkness = darkness;
        this.scene = scene;
        this.catering = catering;
        this.restaurant = restaurant;
        this.parking = parking;
        this.elevator = elevator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getClimateSystem() {
        return climateSystem;
    }

    public void setClimateSystem(Boolean climateSystem) {
        this.climateSystem = climateSystem;
    }

    public Boolean getNaturalLight() {
        return naturalLight;
    }

    public void setNaturalLight(Boolean naturalLight) {
        this.naturalLight = naturalLight;
    }

    public Boolean getDarkness() {
        return darkness;
    }

    public void setDarkness(Boolean darkness) {
        this.darkness = darkness;
    }

    public Boolean getScene() {
        return scene;
    }

    public void setScene(Boolean scene) {
        this.scene = scene;
    }

    public Boolean getCatering() {
        return catering;
    }

    public void setCatering(Boolean catering) {
        this.catering = catering;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getElevator() {
        return elevator;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }

}
