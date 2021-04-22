package com.pet.project.cinemacms.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="cinema_id")
    private int id;

    @OneToMany(mappedBy = "cinema",
            targetEntity = AboutCinema.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "cinema_id")
    private List<AboutCinema> aboutCinemas;

    @Column(name = "it_works")
    private boolean works;

    public Cinema(){

    }

    public Cinema(List<AboutCinema> aboutCinemas, boolean works) {
        this.aboutCinemas = aboutCinemas;
        this.works = works;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
                ", works=" + works +
                '}';
    }
}



