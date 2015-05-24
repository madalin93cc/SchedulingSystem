package schedulingsystem.model.dto;

import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.entity.Equipment;

import java.io.Serializable;

/**
 * Created by Madalin.Colezea on 5/5/2015.
 */
public class EquipmentDTO implements Serializable{

    private Long id;

    private Boolean wireless;

    private Boolean videoprojector;

    private Boolean laserpointer;

    private Boolean projectionScreen;

    private Boolean flipchart;

    private Boolean whiteboard;

    private Boolean soundsystem;

    private Boolean microphones;

    private Boolean tv;

    private Boolean videoconference;

    private Boolean recordAV;

    private Boolean laptop;

    private Boolean printer;

    private Boolean translator;

    public EquipmentDTO() {
    }

    public EquipmentDTO(Long id, Boolean wireless, Boolean videoprojector, Boolean laserpointer, Boolean projectionScreen, Boolean flipchart, Boolean whiteboard, Boolean soundsystem, Boolean microphones, Boolean tv, Boolean videoconference, Boolean recordAV, Boolean laptop, Boolean printer, Boolean translator, ConferenceRoom conferenceRoom) {
        this.id = id;
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

    public EquipmentDTO(Equipment equipment){
        this.id = equipment.getId();
        this.wireless = equipment.getWireless();
        this.videoprojector = equipment.getVideoprojector();
        this.laserpointer = equipment.getLaserpointer();
        this.projectionScreen = equipment.getProjectionScreen();
        this.flipchart = equipment.getFlipchart();
        this.whiteboard = equipment.getWhiteboard();
        this.soundsystem = equipment.getSoundsystem();
        this.microphones = equipment.getMicrophones();
        this.tv = equipment.getTv();
        this.videoconference = equipment.getVideoconference();
        this.recordAV = equipment.getRecordAV();
        this.laptop = equipment.getLaptop();
        this.printer = equipment.getPrinter();
        this.translator = equipment.getTranslator();
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

}
