package schedulingsystem.model.dto;

import schedulingsystem.model.entity.Location;

import java.io.Serializable;

/**
 * Created by Madalin.Colezea on 5/5/2015.
 */
public class LocationDTO implements Serializable{

    private Long id;

    private String name;

    private String city;

    private String sector;

    private String street;

    private String floor;
    private String streetNumber;

    private String indication;

    public LocationDTO() {
    }

    public LocationDTO(Long id, String name, String city, String sector, String street, String floor, String streetNumber, String indication) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.sector = sector;
        this.street = street;
        this.floor = floor;
        this.streetNumber = streetNumber;
        this.indication = indication;
    }

    public LocationDTO(Location location){
        this.id = location.getId();
        this.name = location.getName();
        this.city = location.getCity();
        this.sector = location.getSector();
        this.street = location.getStreet();
        this.floor = location.getFloor();
        this.streetNumber = location.getStreetNumber();
        this.indication = location.getIndication();
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }
}
