package schedulingsystem.model.entity;

import schedulingsystem.model.dto.LocationDTO;

import javax.persistence.*;

/**
 * Created by Adi on 29.04.2015.
 */
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name", nullable = false, length = 30)
    private String name;

    @Column(name = "City", nullable = false, length = 30)
    private String city;

    @Column(name = "Sector", nullable = true, length = 30)
    private String sector;

    @Column(name = "Street", nullable = false, length = 200)
    private String street;

    @Column(name = "Floor", nullable = true, length = 5)
    private String floor;

    @Column(name = "StreetNumber", nullable = false)
    private String streetNumber;

    @Column(name = "Indications", nullable = true, length = 200)
    private String indication;

    @OneToOne(optional = false, mappedBy = "fkLocation")
    private ConferenceRoom conferenceRoom;

    public Location() {
    }

    public Location(LocationDTO locationDTO){
        this.id = locationDTO.getId();
        this.name = locationDTO.getName();
        this.city = locationDTO.getCity();
        this.sector = locationDTO.getSector();
        this.street = locationDTO.getStreet();
        this.floor = locationDTO.getFloor();
        this.streetNumber = locationDTO.getStreetNumber();
        this.indication = locationDTO.getIndication();
    }

    public Location(String name, String city, String sector, String street, String floor, String streetNumber, String indication) {
        this.name = name;
        this.city = city;
        this.sector = sector;
        this.street = street;
        this.floor = floor;
        this.streetNumber = streetNumber;
        this.indication = indication;
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

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        if (!city.equals(location.city)) return false;
        if (!conferenceRoom.equals(location.conferenceRoom)) return false;
        if (floor != null ? !floor.equals(location.floor) : location.floor != null) return false;
        if (!id.equals(location.id)) return false;
        if (indication != null ? !indication.equals(location.indication) : location.indication != null) return false;
        if (!name.equals(location.name)) return false;
        if (sector != null ? !sector.equals(location.sector) : location.sector != null) return false;
        if (!street.equals(location.street)) return false;
        if (!streetNumber.equals(location.streetNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + (sector != null ? sector.hashCode() : 0);
        result = 31 * result + street.hashCode();
        result = 31 * result + (floor != null ? floor.hashCode() : 0);
        result = 31 * result + streetNumber.hashCode();
        result = 31 * result + (indication != null ? indication.hashCode() : 0);
        result = 31 * result + conferenceRoom.hashCode();
        return result;
    }
}
