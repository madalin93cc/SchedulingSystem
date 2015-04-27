package schedulingsystem.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
/**
 * Created by Adi on 27.04.2015.
 */
@Entity
public class ConferenceRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name", nullable = false, length = 30)
    private String name;

    @Column(name = "PlacesNumber", nullable = false)
    private Integer placesNumber;

    @Column(name = "FKLocation", nullable = false)
    private Integer fkLocation;

    @Column(name = "FKFeatures", nullable = false)
    private Integer fkFeatures;

    public ConferenceRoom() {

    }

    public ConferenceRoom(String name,
                          Integer placesNumber,
                          Integer fkLocation,
                          Integer fkFeatures) {

        this.name = name;
        this.placesNumber = placesNumber;
        this.fkLocation = fkLocation;
        this.fkFeatures = fkFeatures;

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

    public Integer getFkLocation() {
        return fkLocation;
    }

    public void setFkLocation(Integer fkLocation) {
        this.fkLocation = fkLocation;
    }

    public Integer getFkFeatures() {
        return fkFeatures;
    }

    public void setFkFeatures(Integer fkFeatures) {
        this.fkFeatures = fkFeatures;
    }
}






