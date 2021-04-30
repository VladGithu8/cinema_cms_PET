package com.pet.project.cinemacms.Models.AboutCinema;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cafe_bar")
public class CafeBar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="cafe_bar_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "about_c_id")
    private AboutCinema aboutCinemaBar;

    @Column (name="cafe_bar_name")
    private String name;

    @Column (name="cafe_bar_descriptor")
    private String descriptor;

    @OneToMany(mappedBy = "cafeBar",
            targetEntity = MenuCafeBar.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column (name="cafe_bar_menu")
    private List<MenuCafeBar> menuCafeBarList;

    public CafeBar() {
    }

    public CafeBar(AboutCinema aboutCinema, String name, String descriptor, List<MenuCafeBar> menuCafeBarList) {
        this.aboutCinemaBar = aboutCinema;
        this.name = name;
        this.descriptor = descriptor;
        this.menuCafeBarList = menuCafeBarList;
    }

    public AboutCinema getAboutCinemaBar() {
        return aboutCinemaBar;
    }

    public void setAboutCinemaBar(AboutCinema aboutCinemaBar) {
        this.aboutCinemaBar = aboutCinemaBar;
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

    public List<MenuCafeBar> getMenuCafeBarList() {
        return menuCafeBarList;
    }

    public void setMenuCafeBarList(List<MenuCafeBar> menuCafeBarList) {
        this.menuCafeBarList = menuCafeBarList;
    }

    @Override
    public String toString() {
        return "CafeBar{" +
                "id=" + id +
                ", aboutCinemaBar=" + aboutCinemaBar +
                ", name='" + name + '\'' +
                ", descriptor='" + descriptor + '\'' +
                ", menuCafeBarList=" + menuCafeBarList +
                '}';
    }
}



