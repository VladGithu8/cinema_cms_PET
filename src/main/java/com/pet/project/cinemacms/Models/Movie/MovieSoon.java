package com.pet.project.cinemacms.Models.Movie;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="movie_soon")
public class MovieSoon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="movie_soon_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "poster_id")
    private Poster posterMovieSoon;

    @Column(name = "release_date")
    private Date releaseDateSQL;

    public MovieSoon() {
    }


    public MovieSoon(Poster poster, Date releaseDateSQL) {
        this.posterMovieSoon = poster;
        this.releaseDateSQL = releaseDateSQL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Poster getPosterMovieSoon() {
        return posterMovieSoon;
    }

    public void setPosterMovieSoon(Poster poster) {
        this.posterMovieSoon = poster;
    }

    public Date getReleaseDateSQL() {
        return releaseDateSQL;
    }

    public void setReleaseDateSQL(Date releaseDateSQL) {
        this.releaseDateSQL = releaseDateSQL;
    }

    @Override
    public String toString() {
        return "MovieSoon{" +
                "id=" + id +
                ", poster=" + posterMovieSoon +
                ", releaseDateSQL=" + releaseDateSQL +
                '}';
    }
}




