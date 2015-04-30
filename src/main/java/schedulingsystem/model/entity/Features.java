package schedulingsystem.model.entity;

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
    private char climateSystem;

    @Column(name = "NaturalLight", nullable = true)
    private char naturalLight;

    @Column(name = "Darkness", nullable = true)
    private char darkness;

    @Column(name = "Scene", nullable = true)
    private char scene;

    @Column(name = "Catering", nullable = true)
    private char catering;

    @Column(name = "Restaurant", nullable = true)
    private char restaurant;

    @Column(name = "Parking", nullable = true)
    private char parking;

    @Column(name = "Elevator", nullable = true)
    private char elevator;

    @OneToOne(optional = false, mappedBy = "fkFeatures")
    private ConferenceRoom conferenceRoom;

    public Features() {
    }

    public Features(char climateSystem, char naturalLight, char darkness, char scene, char catering, char restaurant, char parkings, char elevator) {
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

    public char getClimateSystem() {
        return climateSystem;
    }

    public void setClimateSystem(char climateSystem) {
        this.climateSystem = climateSystem;
    }

    public char getNaturalLight() {
        return naturalLight;
    }

    public void setNaturalLight(char naturalLight) {
        this.naturalLight = naturalLight;
    }

    public char getDarkness() {
        return darkness;
    }

    public void setDarkness(char darkness) {
        this.darkness = darkness;
    }

    public char getScene() {
        return scene;
    }

    public void setScene(char scene) {
        this.scene = scene;
    }

    public char getCatering() {
        return catering;
    }

    public void setCatering(char catering) {
        this.catering = catering;
    }

    public char getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(char restaurant) {
        this.restaurant = restaurant;
    }

    public char getParking() {
        return parking;
    }

    public void setParking(char parking) {
        this.parking = parking;
    }

    public char getElevator() {
        return elevator;
    }

    public void setElevator(char elevator) {
        this.elevator = elevator;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }
}
