package schedulingsystem.model.entity;

import schedulingsystem.model.dto.FeaturesDTO;

import javax.persistence.*;

/**
 * Created by Adi on 29.04.2015.
 */

@Entity
public class Features {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ClimateSystem", nullable = true)
    private Boolean climateSystem;

    @Column(name = "NaturalLight", nullable = true)
    private Boolean naturalLight;

    @Column(name = "Darkness", nullable = true)
    private Boolean darkness;

    @Column(name = "Scene", nullable = true)
    private Boolean scene;

    @Column(name = "Catering", nullable = true)
    private Boolean catering;

    @Column(name = "Restaurant", nullable = true)
    private Boolean restaurant;

    @Column(name = "Parking", nullable = true)
    private Boolean parking;

    @Column(name = "Elevator", nullable = true)
    private Boolean elevator;

    @OneToOne(optional = false, mappedBy = "fkFeatures")
    private ConferenceRoom conferenceRoom;

    public Features() {
    }


    public Features(FeaturesDTO featuresDTO){
        this.id = featuresDTO.getId();
        this.climateSystem = featuresDTO.getClimateSystem();
        this.naturalLight = featuresDTO.getNaturalLight();
        this.darkness = featuresDTO.getDarkness();
        this.scene = featuresDTO.getScene();
        this.catering = featuresDTO.getCatering();
        this.restaurant = featuresDTO.getRestaurant();
        this.parking = featuresDTO.getParking();
        this.elevator = featuresDTO.getElevator();
    }

    public Features(Boolean climateSystem, Boolean naturalLight, Boolean darkness, Boolean scene, Boolean catering, Boolean restaurant, Boolean parkings, Boolean elevator) {
        this.climateSystem = climateSystem;
        this.naturalLight = naturalLight;
        this.darkness = darkness;
        this.scene = scene;
        this.catering = catering;
        this.restaurant = restaurant;
        this.parking = parkings;
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

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }
}
