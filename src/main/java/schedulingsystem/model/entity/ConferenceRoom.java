package schedulingsystem.model.entity;

import schedulingsystem.model.dto.ConferenceRoomDTO;

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

    @Column(name = "Surface", nullable = true)
    private Integer surface;

    @OneToOne(optional = false)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_conferenceroom_location"), name = "location_id", unique = true, nullable = false, updatable = true)
    private Location fkLocation;

    @OneToOne(optional = false)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_conferenceroom_features"), name = "features_id", unique = true, nullable = false, updatable = true)
    private Features fkFeatures;

    @OneToOne(optional = false)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_conferenceroom_equipment"), name = "equipment_id", unique = true, nullable = false, updatable = true)
    private Equipment fkEquipment;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", unique = false, nullable = false, updatable = true)
    private User fkOwner;

    public ConferenceRoom() {

    }

    public ConferenceRoom(ConferenceRoomDTO conferenceRoomDTO, Long equipmentId, Long featuresId, Long locationId){
        this.name = conferenceRoomDTO.getName();
        this.placesNumber = conferenceRoomDTO.getPlacesNumber();
        this.surface = conferenceRoomDTO.getSurface();
    }

    public ConferenceRoom(String name, Integer placesNumber, Integer surface, Location fkLocation, Features fkFeatures, Equipment fkEquipment, User fkOwner) {
        this.name = name;
        this.placesNumber = placesNumber;
        this.surface = surface;
        this.fkLocation = fkLocation;
        this.fkFeatures = fkFeatures;
        this.fkEquipment = fkEquipment;
        this.fkOwner = fkOwner;
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

    public Location getFkLocation() {
        return fkLocation;
    }

    public void setFkLocation(Location fkLocation) {
        this.fkLocation = fkLocation;
    }

    public Features getFkFeatures() {
        return fkFeatures;
    }

    public void setFkFeatures(Features fkFeatures) {
        this.fkFeatures = fkFeatures;
    }

    public Equipment getFkEquipment() {
        return fkEquipment;
    }

    public void setFkEquipment(Equipment fkEquipment) {
        this.fkEquipment = fkEquipment;
    }

    public User getFkOwner() {
        return fkOwner;
    }

    public void setFkOwner(User fkOwner) {
        this.fkOwner = fkOwner;
    }
}