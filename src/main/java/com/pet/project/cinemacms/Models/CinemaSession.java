package com.pet.project.cinemacms.Models;

import com.pet.project.cinemacms.Models.AboutCinema.CinemaHall;
import com.pet.project.cinemacms.Models.Movie.Movie;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name="cinema_session")
public class CinemaSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="cinema_session_id")
    private Long id;

    @ManyToMany(mappedBy = "cinemaSessionList")
    private List<TicketPrice> ticketPriceList;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ticket_id")
    private Ticket ticketSession;

    @OneToMany(mappedBy = "cinemaSessionMovie",
            targetEntity = Movie.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "session_movie_id")
    private List<Movie> movieList;

    @OneToMany(mappedBy = "cinemaSessionHall",
            targetEntity = CinemaHall.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "session_hall_id")
    private List<CinemaHall> cinemaHallList;

    @OneToMany(mappedBy = "cinemaSession",
            targetEntity = Cinema.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "session_cinema_id")
    private List<Cinema> cinemaList;

    @Column(name = "session_date")
    private Date sessionDateSQL;

    @Column(name = "session_time")
    private Time sessionTimeSQL;

    @Column(name = "session_type")
    private String sessionType;

    public CinemaSession() {
    }

    public CinemaSession(List<TicketPrice> ticketPriceList, Ticket ticketSession,
                         List<Movie> movieList, List<CinemaHall> cinemaHallList,
                         List<Cinema> cinemaList, Date sessionDateSQL, Time sessionTimeSQL,
                         String sessionType) {
        this.ticketPriceList = ticketPriceList;
        this.ticketSession = ticketSession;
        this.movieList = movieList;
        this.cinemaHallList = cinemaHallList;
        this.cinemaList = cinemaList;
        this.sessionDateSQL = sessionDateSQL;
        this.sessionTimeSQL = sessionTimeSQL;
        this.sessionType = sessionType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<CinemaHall> getCinemaHallList() {
        return cinemaHallList;
    }

    public void setCinemaHallList(List<CinemaHall> cinemaHallList) {
        this.cinemaHallList = cinemaHallList;
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public Date getSessionDateSQL() {
        return sessionDateSQL;
    }

    public void setSessionDateSQL(Date sessionDateSQL) {
        this.sessionDateSQL = sessionDateSQL;
    }

    public Time getSessionTimeSQL() {
        return sessionTimeSQL;
    }

    public void setSessionTimeSQL(Time sessionTimeSQL) {
        this.sessionTimeSQL = sessionTimeSQL;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public Ticket getTicketSession() {
        return ticketSession;
    }

    public void setTicketSession(Ticket ticketSession) {
        this.ticketSession = ticketSession;
    }

    public List<TicketPrice> getTicketPriceList() {
        return ticketPriceList;
    }

    public void setTicketPriceList(List<TicketPrice> ticketPriceList) {
        this.ticketPriceList = ticketPriceList;
    }

    @Override
    public String toString() {
        return "CinemaSession{" +
                "id=" + id +
                ", ticketPriceList=" + ticketPriceList +
                ", ticketSession=" + ticketSession +
                ", movieList=" + movieList +
                ", cinemaHallList=" + cinemaHallList +
                ", cinemaList=" + cinemaList +
                ", sessionDateSQL=" + sessionDateSQL +
                ", sessionTimeSQL=" + sessionTimeSQL +
                ", sessionType='" + sessionType + '\'' +
                '}';
    }
}



