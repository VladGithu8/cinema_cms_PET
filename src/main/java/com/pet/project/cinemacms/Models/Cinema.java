package com.pet.project.cinemacms.Models;

import com.pet.project.cinemacms.Models.AboutCinema.AboutCinema;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="cinema_id")
    private Long id;

    @OneToMany(mappedBy = "cinema",
            targetEntity = AboutCinema.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "cinema_id")
    private List<AboutCinema> aboutCinemas;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_session_id")
    private CinemaSession cinemaSession;

    @Column(name = "it_works")
    private boolean works;

    public Cinema(){

    }

    public Cinema(List<AboutCinema> aboutCinemas, CinemaSession cinemaSession, boolean works) {
        this.aboutCinemas = aboutCinemas;
        this.cinemaSession = cinemaSession;
        this.works = works;
    }

    public CinemaSession getCinemaSession() {
        return cinemaSession;
    }

    public void setCinemaSession(CinemaSession cinemaSession) {
        this.cinemaSession = cinemaSession;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AboutCinema> getAboutCinemas() {
        return aboutCinemas;
    }

    public void setAboutCinemas(List<AboutCinema> aboutCinemas) {
        this.aboutCinemas = aboutCinemas;
    }

    public boolean isWorks() {
        return works;
    }

    public void setWorks(boolean works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", aboutCinemas=" + aboutCinemas +
                ", cinemaSession=" + cinemaSession +
                ", works=" + works +
                '}';
    }
}



