package schedulingsystem.model.entity;

import schedulingsystem.model.dto.EquipmentDTO;

import javax.persistence.*;

/**
 * Created by Colezea on 30/04/2015.
 */
@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Wireless", nullable = true)
    private Boolean wireless;

    @Column(name = "Videoprojector", nullable = true)
    private Boolean videoprojector;

    @Column(name = "Laserpointer", nullable = true)
    private Boolean laserpointer;

    @Column(name = "ProjectionScreen", nullable = true)
    private Boolean projectionScreen;

    @Column(name = "Flipchart", nullable = true)
    private Boolean flipchart;

    @Column(name = "Whiteboard", nullable = true)
    private Boolean whiteboard;

    @Column(name = "Soundsystem", nullable = true)
    private Boolean soundsystem;

    @Column(name = "Microphones", nullable = true)
    private Boolean microphones;

    @Column(name = "Tv", nullable = true)
    private Boolean tv;

    @Column(name = "Videoconference", nullable = true)
    private Boolean videoconference;

    @Column(name = "RecordAV", nullable = true)
    private Boolean recordAV;

    @Column(name = "Laptop", nullable = true)
    private Boolean laptop;

    @Column(name = "Printer", nullable = true)
    private Boolean printer;

    @Column(name = "Translator", nullable = true)
    private Boolean translator;

    @OneToOne(optional = false, mappedBy = "fkEquipment")
    private ConferenceRoom conferenceRoom;

    public Equipment() {
    }

    public Equipment(EquipmentDTO equipmentDTO){
        this.id = equipmentDTO.getId();
        this.wireless = equipmentDTO.getWireless();
        this.videoprojector = equipmentDTO.getVideoprojector();
        this.laserpointer = equipmentDTO.getLaserpointer();
        this.projectionScreen = equipmentDTO.getProjectionScreen();
        this.flipchart = equipmentDTO.getFlipchart();
        this.whiteboard = equipmentDTO.getWhiteboard();
        this.soundsystem = equipmentDTO.getSoundsystem();
        this.microphones = equipmentDTO.getMicrophones();
        this.tv = equipmentDTO.getTv();
        this.videoconference = equipmentDTO.getVideoconference();
        this.recordAV = equipmentDTO.getRecordAV();
        this.laptop = equipmentDTO.getLaptop();
        this.printer = equipmentDTO.getPrinter();
        this.translator = equipmentDTO.getTranslator();
    }

    public Equipment(Boolean wireless, Boolean videoprojector, Boolean laserpointer, Boolean projectionScreen, Boolean flipchart, Boolean whiteboard, Boolean soundsystem, Boolean microphones, Boolean tv, Boolean videoconference, Boolean recordAV, Boolean laptop, Boolean printer, Boolean translator, ConferenceRoom conferenceRoom) {
        this.wireless = wireless;
        this.videoprojector = videoprojector;
        this.laserpointer = laserpointer;
        this.projectionScreen = projectionScreen;
        this.flipchart = flipchart;
        this.whiteboard = whiteboard;
        this.soundsystem = soundsystem;
        this.microphones = microphones;
        this.tv = tv;
        this.videoconference = videoconference;
        this.recordAV = recordAV;
        this.laptop = laptop;
        this.printer = printer;
        this.translator = translator;
        this.conferenceRoom = conferenceRoom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getWireless() {
        return wireless;
    }

    public void setWireless(Boolean wireless) {
        this.wireless = wireless;
    }

    public Boolean getVideoprojector() {
        return videoprojector;
    }

    public void setVideoprojector(Boolean videoprojector) {
        this.videoprojector = videoprojector;
    }

    public Boolean getLaserpointer() {
        return laserpointer;
    }

    public void setLaserpointer(Boolean laserpointer) {
        this.laserpointer = laserpointer;
    }

    public Boolean getProjectionScreen() {
        return projectionScreen;
    }

    public void setProjectionScreen(Boolean projectionScreen) {
        this.projectionScreen = projectionScreen;
    }

    public Boolean getFlipchart() {
        return flipchart;
    }

    public void setFlipchart(Boolean flipchart) {
        this.flipchart = flipchart;
    }

    public Boolean getWhiteboard() {
        return whiteboard;
    }

    public void setWhiteboard(Boolean whiteboard) {
        this.whiteboard = whiteboard;
    }

    public Boolean getSoundsystem() {
        return soundsystem;
    }

    public void setSoundsystem(Boolean soundsystem) {
        this.soundsystem = soundsystem;
    }

    public Boolean getMicrophones() {
        return microphones;
    }

    public void setMicrophones(Boolean microphones) {
        this.microphones = microphones;
    }

    public Boolean getTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
    }

    public Boolean getVideoconference() {
        return videoconference;
    }

    public void setVideoconference(Boolean videoconference) {
        this.videoconference = videoconference;
    }

    public Boolean getRecordAV() {
        return recordAV;
    }

    public void setRecordAV(Boolean recordAV) {
        this.recordAV = recordAV;
    }

    public Boolean getLaptop() {
        return laptop;
    }

    public void setLaptop(Boolean laptop) {
        this.laptop = laptop;
    }

    public Boolean getPrinter() {
        return printer;
    }

    public void setPrinter(Boolean printer) {
        this.printer = printer;
    }

    public Boolean getTranslator() {
        return translator;
    }

    public void setTranslator(Boolean translator) {
        this.translator = translator;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }
}
