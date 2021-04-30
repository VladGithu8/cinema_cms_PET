package com.pet.project.cinemacms.Models.AboutCinema;

import com.pet.project.cinemacms.Models.Cinema;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="about_cinema")
public class AboutCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="about_c_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id_about")
    private Cinema cinema;

    @Column (name="cinema_name")
    private String name;

    @OneToMany(mappedBy = "aboutCinemaHall",
            targetEntity = CinemaHall.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "cinema_hall")
    private List<CinemaHall> cinemaHallList;

    @OneToMany(mappedBy = "aboutCinemaKidsRoom",
            targetEntity = KidsGameRoom.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "kids_room")
    private List<KidsGameRoom> kidsGameRoomList;

    @OneToMany(mappedBy = "aboutCinemaAdvert",
            targetEntity = Advertising.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "advertising")
    private List<Advertising> advertisings;

    @OneToMany(mappedBy = "aboutCinemaNews",
            targetEntity = News.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "news")
    private List<News> news;

    @OneToMany(mappedBy = "aboutCinemaBar",
            targetEntity = CafeBar.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "cafe_bar")
    private List<CafeBar> cafeBars;

    @OneToMany(mappedBy = "aboutCinemaApp",
            targetEntity = MobileApp.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "app")
    private List<MobileApp> mobileApps;

    @OneToMany(mappedBy = "aboutCinemaCont",
            targetEntity = Contact.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "contacts")
    private List<Contact> contacts;


    public AboutCinema() {
    }

    public AboutCinema(Cinema cinema, String name, List<CinemaHall> cinemaHallList,
                       List<KidsGameRoom> kidsGameRoomList, List<Advertising> advertisings,
                       List<News> news, List<CafeBar> cafeBars, List<MobileApp> mobileApps,
                       List<Contact> contacts) {
        this.cinema = cinema;
        this.name = name;
        this.cinemaHallList = cinemaHallList;
        this.kidsGameRoomList = kidsGameRoomList;
        this.advertisings = advertisings;
        this.news = news;
        this.cafeBars = cafeBars;
        this.mobileApps = mobileApps;
        this.contacts = contacts;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public List<Advertising> getAdvertisings() {
        return advertisings;
    }

    public void setAdvertisings(List<Advertising> advertisings) {
        this.advertisings = advertisings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<KidsGameRoom> getKidsGameRoomList() {
        return kidsGameRoomList;
    }

    public void setKidsGameRoomList(List<KidsGameRoom> kidsGameRoomList) {
        this.kidsGameRoomList = kidsGameRoomList;
    }

    public List<CafeBar> getCafeBars() {
        return cafeBars;
    }

    public void setCafeBars(List<CafeBar> cafeBars) {
        this.cafeBars = cafeBars;
    }

    public List<MobileApp> getMobileApps() {
        return mobileApps;
    }

    public void setMobileApps(List<MobileApp> mobileApps) {
        this.mobileApps = mobileApps;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<CinemaHall> getCinemaHallList() {
        return cinemaHallList;
    }

    public void setCinemaHallList(List<CinemaHall> cinemaHallList) {
        this.cinemaHallList = cinemaHallList;
    }

    @Override
    public String toString() {
        return "AboutCinema{" +
                "id=" + id +
                ", cinema=" + cinema +
                ", name='" + name + '\'' +
                ", cinemaHallList=" + cinemaHallList +
                ", kidsGameRoomList=" + kidsGameRoomList +
                ", advertisings=" + advertisings +
                ", news=" + news +
                ", cafeBars=" + cafeBars +
                ", mobileApps=" + mobileApps +
                ", contacts=" + contacts +
                '}';
    }
}



