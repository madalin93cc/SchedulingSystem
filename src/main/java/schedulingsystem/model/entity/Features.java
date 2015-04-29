package schedulingsystem.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Adi on 29.04.2015.
 */

@Entity
public class Features {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "VideoProjector", nullable = true)
    private char videoProjector;

    @Column(name = "ProjectionScreen", nullable = true)
    private char projectionScreen;

    @Column(name = "FlipChart", nullable = true)
    private char flipChart;

    @Column(name = "WhiteBoard", nullable = true)
    private char whiteBoard;

    @Column(name = "VideoPlayer", nullable = true)
    private char videoPlayer;

    @Column(name = "Printer", nullable = true)
    private char printer;

    @Column(name = "Laptop", nullable = true)
    private char laptop;

    @Column(name = "SoundSystem", nullable = true)
    private char soundSystem;

    @Column(name = "Microphone", nullable = true)
    private char microphone;

    @Column(name = "WiFi", nullable = true)
    private char wifi;

    @Column(name = "FotoVideoSystem", nullable = true)
    private char fotoVideoSystem;

    @Column(name = "ClimateSystem", nullable = true)
    private char climateSystem;

    @Column(name = "Translator", nullable = true)
    private char translator;

    public Features() {

    }

    public Features(char videoProjector,
                    char projectionScreen,
                    char flipChart,
                    char whiteBoard,
                    char videoPlayer,
                    char printer,
                    char laptop,
                    char soundSystem,
                    char wifi,
                    char fotoVideoSystem,
                    char climateSystem,
                    char translator
                    ) {
        this.videoProjector = videoProjector;
        this.projectionScreen = projectionScreen;
        this.flipChart = flipChart;
        this.whiteBoard = whiteBoard;
        this.videoPlayer = videoPlayer;
        this.printer = printer;
        this.laptop = laptop;
        this.soundSystem = soundSystem;
        this.wifi = wifi;
        this.fotoVideoSystem = fotoVideoSystem;
        this.climateSystem = climateSystem;
        this.translator = translator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getVideoProjector() {
        return videoProjector;
    }

    public void setVideoProjector(char videoProjector) {
        this.videoProjector = videoProjector;
    }

    public char getProjectionScreen() {
        return projectionScreen;
    }

    public void setProjectionScreen(char projectionScreen) {
        this.projectionScreen = projectionScreen;
    }

    public char getFlipChart() {
        return flipChart;
    }

    public void setFlipChart(char flipChart) {
        this.flipChart = flipChart;
    }

    public char getWhiteBoard() {
        return whiteBoard;
    }

    public void setWhiteBoard(char whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    public char getVideoPlayer() {
        return videoPlayer;
    }

    public void setVideoPlayer(char videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    public char getPrinter() {
        return printer;
    }

    public void setPrinter(char printer) {
        this.printer = printer;
    }

    public char getLaptop() {
        return laptop;
    }

    public void setLaptop(char laptop) {
        this.laptop = laptop;
    }

    public char getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(char soundSystem) {
        this.soundSystem = soundSystem;
    }

    public char getMicrophone() {
        return microphone;
    }

    public void setMicrophone(char microphone) {
        this.microphone = microphone;
    }

    public char getWiFi() {
        return wifi;
    }

    public void setWiFi(char wiFi) {
        this.wifi = wiFi;
    }

    public char getFotoVideoSystem() {
        return fotoVideoSystem;
    }

    public void setFotoVideoSystem(char fotoVideoSystem) {
        this.fotoVideoSystem = fotoVideoSystem;
    }

    public char getClimateSystem() {
        return climateSystem;
    }

    public void setClimateSystem(char climateSystem) {
        this.climateSystem = climateSystem;
    }

    public char getTranslator() {
        return translator;
    }

    public void setTranslator(char translator) {
        this.translator = translator;
    }


}
