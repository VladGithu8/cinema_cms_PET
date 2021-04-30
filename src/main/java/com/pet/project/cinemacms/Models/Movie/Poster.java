package com.pet.project.cinemacms.Models.Movie;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="poster")
public class Poster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="poster_id")
    private int id;

    @OneToMany(mappedBy = "posterMovie",
            targetEntity = Movie.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "movie")
    private List<Movie> movieList;

    @OneToMany(mappedBy = "posterMovieSoon",
            targetEntity = MovieSoon.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "movie_soon")
    private List<MovieSoon> movieSoonList;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_descriptor")
    private String movieDescriptor;

    @Column(name = "movie_budget")
    private Double movieBudget;

    @Column(name = "movie_rating")
    private Double movieRating;

    @Column(name = "movie_genre")
    private String movieGenre;

    @Column(name = "movie_are_rating")
    private Integer movieAgeRating;

    @Column(name = "movie_trailer_url")
    private String movieTrailerUrl;

    public Poster() {
    }

    public Poster(List<Movie> movieList, List<MovieSoon> movieSoonList,
                  String movieName, String movieDescriptor,
                  Double movieBudget, Double movieRating,
                  String movieGenre, Integer movieAgeRating,
                  String movieTrailerUrl) {
        this.movieList = movieList;
        this.movieSoonList = movieSoonList;
        this.movieName = movieName;
        this.movieDescriptor = movieDescriptor;
        this.movieBudget = movieBudget;
        this.movieRating = movieRating;
        this.movieGenre = movieGenre;
        this.movieAgeRating = movieAgeRating;
        this.movieTrailerUrl = movieTrailerUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescriptor() {
        return movieDescriptor;
    }

    public void setMovieDescriptor(String movieDescriptor) {
        this.movieDescriptor = movieDescriptor;
    }

    public Double getMovieBudget() {
        return movieBudget;
    }

    public void setMovieBudget(Double movieBudget) {
        this.movieBudget = movieBudget;
    }

    public Double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public Integer getMovieAgeRating() {
        return movieAgeRating;
    }

    public void setMovieAgeRating(Integer movieAgeRating) {
        this.movieAgeRating = movieAgeRating;
    }

    public String getMovieTrailerUrl() {
        return movieTrailerUrl;
    }

    public void setMovieTrailerUrl(String movieTrailerUrl) {
        this.movieTrailerUrl = movieTrailerUrl;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<MovieSoon> getMovieSoonList() {
        return movieSoonList;
    }

    public void setMovieSoonList(List<MovieSoon> movieSoonList) {
        this.movieSoonList = movieSoonList;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieDescriptor='" + movieDescriptor + '\'' +
                ", movieBudget=" + movieBudget +
                ", movieRating=" + movieRating +
                ", movieGenre='" + movieGenre + '\'' +
                ", movieAgeRating=" + movieAgeRating +
                ", movieTrailerUrl='" + movieTrailerUrl + '\'' +
                '}';
    }
}



