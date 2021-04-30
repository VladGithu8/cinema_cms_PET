package com.pet.project.cinemacms.Models.AboutCinema;

import javax.persistence.*;

@Entity
@Table(name="cinema_contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="cinema_contacts_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "about_c_id")
    private AboutCinema aboutCinemaCont;


    @Column(name = "cinema_phones")
    private String cinemaPhones;

    @Column(name = "cinema_address")
    private String cinemaAddress;

    @Column(name = "email")
    private String email;


    public Contact() {

    }

    public Contact(AboutCinema aboutCinema, String cinemaAddress, String cinemaPhones, String email) {

        this.aboutCinemaCont = aboutCinema;
        this.cinemaPhones = cinemaPhones;
        this.cinemaAddress = cinemaAddress;
        this.email = email;
    }

    public AboutCinema getAboutCinemaCont() {
        return aboutCinemaCont;
    }

    public void setAboutCinemaCont(AboutCinema aboutCinemaCont) {
        this.aboutCinemaCont = aboutCinemaCont;
    }

    public String getCinemaPhones() {
        return cinemaPhones;
    }

    public void setCinemaPhones(String cinemaPhones) {
        this.cinemaPhones = cinemaPhones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", aboutCinemaCont=" + aboutCinemaCont +
                ", cinemaPhones='" + cinemaPhones + '\'' +
                ", cinemaAddress='" + cinemaAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


