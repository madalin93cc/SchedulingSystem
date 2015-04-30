package schedulingsystem.model.entity;

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
    private char wireless;

    @Column(name = "Videoprojector", nullable = true)
    private char videoprojector;

    @Column(name = "Laserpointer", nullable = true)
    private char laserpointer;

    @Column(name = "ProjectionScreen", nullable = true)
    private char projectionScreen;

    @Column(name = "Flipchart", nullable = true)
    private char flipchart;

    @Column(name = "Whiteboard", nullable = true)
    private char whiteboard;

    @Column(name = "Soundsystem", nullable = true)
    private char soundsystem;

    @Column(name = "Microphones", nullable = true)
    private char microphones;

    @Column(name = "Tv", nullable = true)
    private char tv;

    @Column(name = "Videoconference", nullable = true)
    private char videoconference;

    @Column(name = "RecordAV", nullable = true)
    private char recordAV;

    @Column(name = "Laptop", nullable = true)
    private char laptop;

    @Column(name = "Printer", nullable = true)
    private char printer;

    @Column(name = "Translator", nullable = true)
    private char translator;

    @OneToOne(optional = false, mappedBy = "fkEquipment")
    private ConferenceRoom conferenceRoom;

    public Equipment() {
    }

    public Equipment(char wireless, char videoprojector, char laserpointer, char projectionScreen, char flipchart, char whiteboard, char soundsystem, char microphones, char tv, char videoconference, char recordAV, char laptop, char printer, char translator) {
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
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getWireless() {
        return wireless;
    }

    public void setWireless(char wireless) {
        this.wireless = wireless;
    }

    public char getVideoprojector() {
        return videoprojector;
    }

    public void setVideoprojector(char videoprojector) {
        this.videoprojector = videoprojector;
    }

    public char getLaserpointer() {
        return laserpointer;
    }

    public void setLaserpointer(char laserpointer) {
        this.laserpointer = laserpointer;
    }

    public char getProjectionScreen() {
        return projectionScreen;
    }

    public void setProjectionScreen(char projectionScreen) {
        this.projectionScreen = projectionScreen;
    }

    public char getFlipchart() {
        return flipchart;
    }

    public void setFlipchart(char flipchart) {
        this.flipchart = flipchart;
    }

    public char getWhiteboard() {
        return whiteboard;
    }

    public void setWhiteboard(char whiteboard) {
        this.whiteboard = whiteboard;
    }

    public char getSoundsystem() {
        return soundsystem;
    }

    public void setSoundsystem(char soundsystem) {
        this.soundsystem = soundsystem;
    }

    public char getMicrophones() {
        return microphones;
    }

    public void setMicrophones(char microphones) {
        this.microphones = microphones;
    }

    public char getTv() {
        return tv;
    }

    public void setTv(char tv) {
        this.tv = tv;
    }

    public char getVideoconference() {
        return videoconference;
    }

    public void setVideoconference(char videoconference) {
        this.videoconference = videoconference;
    }

    public char getRecordAV() {
        return recordAV;
    }

    public void setRecordAV(char recordAV) {
        this.recordAV = recordAV;
    }

    public char getLaptop() {
        return laptop;
    }

    public void setLaptop(char laptop) {
        this.laptop = laptop;
    }

    public char getPrinter() {
        return printer;
    }

    public void setPrinter(char printer) {
        this.printer = printer;
    }

    public char getTranslator() {
        return translator;
    }

    public void setTranslator(char translator) {
        this.translator = translator;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }
}
