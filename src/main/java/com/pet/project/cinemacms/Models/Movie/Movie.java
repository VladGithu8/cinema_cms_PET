package com.pet.project.cinemacms.Models.Movie;

import com.pet.project.cinemacms.Models.CinemaSession;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="movie_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_session_id")
    private CinemaSession cinemaSession;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_session_id", insertable = false, updatable = false)
    private CinemaSession cinemaSessionMovie;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "poster_id")
    private Poster posterMovie;

    @Column(name = "start_date")
    private Date startDateSQL;

    @Column(name = "ends_date")
    private Date endsDateSQL;

    public Movie() {
    }

    public Movie(CinemaSession cinemaSession, CinemaSession cinemaSessionMovie,
                 Poster posterMovie, Date startDateSQL, Date endsDateSQL) {
        this.cinemaSession = cinemaSession;
        this.cinemaSessionMovie = cinemaSessionMovie;
        this.posterMovie = posterMovie;
        this.startDateSQL = startDateSQL;
        this.endsDateSQL = endsDateSQL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Poster getPosterMovie() {
        return posterMovie;
    }

    public void setPosterMovie(Poster poster) {
        this.posterMovie = poster;
    }

    public Date getStartDateSQL() {
        return startDateSQL;
    }

    public void setStartDateSQL(Date startDateSQL) {
        this.startDateSQL = startDateSQL;
    }

    public Date getEndsDateSQL() {
        return endsDateSQL;
    }

    public void setEndsDateSQL(Date endsDateSQL) {
        this.endsDateSQL = endsDateSQL;
    }

    public CinemaSession getCinemaSession() {
        return cinemaSession;
    }

    public void setCinemaSession(CinemaSession cinemaSession) {
        this.cinemaSession = cinemaSession;
    }

    public CinemaSession getCinemaSessionMovie() {
        return cinemaSessionMovie;
    }

    public void setCinemaSessionMovie(CinemaSession cinemaSessionMovie) {
        this.cinemaSessionMovie = cinemaSessionMovie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", cinemaSession=" + cinemaSession +
                ", cinemaSessionMovie=" + cinemaSessionMovie +
                ", posterMovie=" + posterMovie +
                ", startDateSQL=" + startDateSQL +
                ", endsDateSQL=" + endsDateSQL +
                '}';
    }
}




