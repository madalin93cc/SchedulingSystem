package schedulingsystem.model.dto;

import schedulingsystem.model.entity.Reservation;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Colezea on 24/05/2015.
 */
public class ReservationCheckDTO implements Serializable{

    private Long id;

    private String name;

    private Date date;

    private String status;

    public ReservationCheckDTO() {
    }

    public ReservationCheckDTO(Long id, String name, Date date, String status) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public ReservationCheckDTO(Reservation reservation){
        this.id = reservation.getId();
        this.name = reservation.getFkConferenceRoom().getName();
        this.date = reservation.getDate();
        this.status = (reservation.getStatus() == 0)?"Neprocesata":(reservation.getStatus() == 1)?"Aprobata":"Respinsa";
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
