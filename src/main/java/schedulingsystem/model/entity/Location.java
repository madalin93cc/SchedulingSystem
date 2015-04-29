package schedulingsystem.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Adi on 29.04.2015.
 */
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "City", nullable = false, length = 30)
    private String city;

    @Column(name = "Address", nullable = false, length = 200)
    private String address;

    @Column(name = "Building", nullable = false, length = 30)
    private String building;

    @Column(name = "Floor", nullable = true, length = 5)
    private String floor;

    @Column(name = "Indications", nullable = true, length = 200)
    private String indication;

    public Location(String city,
                    String address,
                    String building,
                    String floor,
                    String indication) {
        this.city = city;
        this.address = address;
        this.building = building;
        this.floor = floor;
        this.indication = indication;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }
}
