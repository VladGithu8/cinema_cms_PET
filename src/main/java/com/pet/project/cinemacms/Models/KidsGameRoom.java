package com.pet.project.cinemacms.Models;


import javax.persistence.*;

@Entity
@Table(name="kids_room")
public class KidsGameRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="kids_room_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AboutCinema aboutCinemaId;

    @Column (name="kids_room_description")
    private String descriptor;

    public KidsGameRoom() {
    }

    public KidsGameRoom(AboutCinema aboutCinema, String descriptor) {
        this.aboutCinemaId = aboutCinema;
        this.descriptor = descriptor;
    }

    public AboutCinema getAboutCinemaId() {
        return aboutCinemaId;
    }

    public void setAboutCinemaId(AboutCinema aboutCinemaId) {
        this.aboutCinemaId = aboutCinemaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public String toString() {
        return "KidsGameRoom{" +
                "id=" + id +
                ", aboutCinemaId=" + aboutCinemaId +
                ", descriptor='" + descriptor + '\'' +
                '}';
    }
}


