package com.pet.project.cinemacms.Models.AboutCinema;

import javax.persistence.*;

@Entity
@Table(name="news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="news_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "about_c_id")
    private AboutCinema aboutCinemaNews;

    @Column (name="news_name")
    private String newsName;

    @Column (name="news_descriptor")
    private String descriptor;

    @Column (name="news_date")
    private String newsDate;

    public News() {
    }

    public News(AboutCinema aboutCinema, String newsName, String descriptor, String newsDate) {

        this.aboutCinemaNews = aboutCinema;
        this.newsName = newsName;
        this.descriptor = descriptor;
        this.newsDate = newsDate;
    }

    public AboutCinema getAboutCinemaNews() {
        return aboutCinemaNews;
    }

    public void setAboutCinemaNews(AboutCinema aboutCinemaNews) {
        this.aboutCinemaNews = aboutCinemaNews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", aboutCinemaNews=" + aboutCinemaNews +
                ", newsName='" + newsName + '\'' +
                ", descriptor='" + descriptor + '\'' +
                ", newsDate='" + newsDate + '\'' +
                '}';
    }
}




