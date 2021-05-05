package com.pet.project.cinemacms.Models.AboutCinema;


import javax.persistence.*;

@Entity
@Table(name="advertising")
public class Advertising {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="advertising_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "about_c_id")
    private AboutCinema aboutCinemaAdvert;

    @Column (name="advertising_name")
    private String name;

    @Column (name="advertising_descriptor")
    private String descriptor;

    public Advertising() {
    }

    public Advertising(AboutCinema aboutCinema, String name, String descriptor) {
        this.aboutCinemaAdvert = aboutCinema;
        this.name = name;
        this.descriptor = descriptor;
    }

    public AboutCinema getAboutCinemaAdvert() {
        return aboutCinemaAdvert;
    }

    public void setAboutCinemaAdvert(AboutCinema aboutCinemaAdvert) {
        this.aboutCinemaAdvert = aboutCinemaAdvert;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "id=" + id +
                ", aboutCinemaAdvert=" + aboutCinemaAdvert +
                ", name='" + name + '\'' +
                ", descriptor='" + descriptor + '\'' +
                '}';
    }
}


