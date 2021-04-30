package com.pet.project.cinemacms.Models.AboutCinema;


import javax.persistence.*;

@Entity
@Table(name="kids_room")
public class KidsGameRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="kids_room_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "about_c_id")
    private AboutCinema aboutCinemaKidsRoom;

    @Column (name="kids_room_description")
    private String descriptor;

    public KidsGameRoom() {
    }

    public KidsGameRoom(AboutCinema aboutCinema, String descriptor) {
        this.aboutCinemaKidsRoom = aboutCinema;
        this.descriptor = descriptor;
    }

    public AboutCinema getAboutCinemaKidsRoom() {
        return aboutCinemaKidsRoom;
    }

    public void setAboutCinemaKidsRoom(AboutCinema aboutCinemaId) {
        this.aboutCinemaKidsRoom = aboutCinemaId;
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
                ", aboutCinemaId=" + aboutCinemaKidsRoom +
                ", descriptor='" + descriptor + '\'' +
                '}';
    }
}


