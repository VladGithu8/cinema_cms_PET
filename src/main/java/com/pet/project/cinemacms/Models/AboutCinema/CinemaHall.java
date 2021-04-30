package com.pet.project.cinemacms.Models.AboutCinema;


import com.pet.project.cinemacms.Models.CinemaSession;
import com.pet.project.cinemacms.Models.Seat;

import javax.persistence.*;

@Entity
@Table( name = "cinema_hall")
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cinema_hall_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "seat_id")
    private Seat cinemaHallSeat;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "about_c_id")
    private AboutCinema aboutCinemaHall;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_session_id")
    private CinemaSession cinemaSessionHall;

    @Column(name = "hall_name")
    private String name;

    @Column(name = "hall_descriptor")
    private String hallDescriptor;

    @Column(name = "hall_capacity")
    private int hallCapacity;

    public CinemaHall() {
    }

    public CinemaHall(Seat cinemaHallSeat, AboutCinema aboutCinemaHall,
                      CinemaSession cinemaSessionHall, String name,
                      String hallDescriptor, int hallCapacity) {
        this.cinemaHallSeat = cinemaHallSeat;
        this.aboutCinemaHall = aboutCinemaHall;
        this.cinemaSessionHall = cinemaSessionHall;
        this.name = name;
        this.hallDescriptor = hallDescriptor;
        this.hallCapacity = hallCapacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AboutCinema getAboutCinemaHall() {
        return aboutCinemaHall;
    }

    public void setAboutCinemaHall(AboutCinema aboutCinemaHall) {
        this.aboutCinemaHall = aboutCinemaHall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHallDescriptor() {
        return hallDescriptor;
    }

    public void setHallDescriptor(String hallDescriptor) {
        this.hallDescriptor = hallDescriptor;
    }

    public int getHallCapacity() {
        return hallCapacity;
    }

    public void setHallCapacity(int hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    public CinemaSession getCinemaSessionHall() {
        return cinemaSessionHall;
    }

    public void setCinemaSessionHall(CinemaSession cinemaSessionHall) {
        this.cinemaSessionHall = cinemaSessionHall;
    }

    public Seat getCinemaHallSeat() {
        return cinemaHallSeat;
    }

    public void setCinemaHallSeat(Seat cinemaHallSeat) {
        this.cinemaHallSeat = cinemaHallSeat;
    }

    @Override
    public String toString() {
        return "CinemaHall{" +
                "id=" + id +
                ", cinemaHallSeat=" + cinemaHallSeat +
                ", aboutCinemaHall=" + aboutCinemaHall +
                ", cinemaSessionHall=" + cinemaSessionHall +
                ", name='" + name + '\'' +
                ", hallDescriptor='" + hallDescriptor + '\'' +
                ", hallCapacity=" + hallCapacity +
                '}';
    }
}




