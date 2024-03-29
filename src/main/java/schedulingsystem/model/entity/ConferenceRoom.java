package schedulingsystem.model.entity;

import schedulingsystem.model.dto.ConferenceRoomDTO;

import javax.persistence.*;

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

    @Column(name = "isDeleted", nullable = true)
    private Boolean isDeleted;

    public ConferenceRoom() {

    }

    public ConferenceRoom(ConferenceRoomDTO conferenceRoomDTO){
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConferenceRoom)) return false;

        ConferenceRoom that = (ConferenceRoom) o;

        if (!fkEquipment.equals(that.fkEquipment)) return false;
        if (!fkFeatures.equals(that.fkFeatures)) return false;
        if (!fkLocation.equals(that.fkLocation)) return false;
        if (!fkOwner.equals(that.fkOwner)) return false;
        if (!id.equals(that.id)) return false;
        if (!isDeleted.equals(that.isDeleted)) return false;
        if (!name.equals(that.name)) return false;
        if (!placesNumber.equals(that.placesNumber)) return false;
        if (surface != null ? !surface.equals(that.surface) : that.surface != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + placesNumber.hashCode();
        result = 31 * result + (surface != null ? surface.hashCode() : 0);
        result = 31 * result + fkLocation.hashCode();
        result = 31 * result + fkFeatures.hashCode();
        result = 31 * result + fkEquipment.hashCode();
        result = 31 * result + fkOwner.hashCode();
        result = 31 * result + isDeleted.hashCode();
        return result;
    }
}