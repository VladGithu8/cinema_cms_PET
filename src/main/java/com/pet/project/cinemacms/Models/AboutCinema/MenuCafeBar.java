package com.pet.project.cinemacms.Models.AboutCinema;


import javax.persistence.*;

@Entity
@Table(name="menu_cafe_bar")
public class MenuCafeBar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="menu_cafe_bar_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cafe_bar_id")
    private CafeBar cafeBar;

    @Column (name="drinks")
    private String drinks;

    @Column (name="snacks")
    private String snacks;

    public MenuCafeBar() {
    }

    public MenuCafeBar(CafeBar cafeBar, String drinks, String snacks) {
        this.cafeBar = cafeBar;
        this.drinks = drinks;
        this.snacks = snacks;
    }

    public CafeBar getCafeBar() {
        return cafeBar;
    }

    public void setCafeBar(CafeBar cafeBar) {
        this.cafeBar = cafeBar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    @Override
    public String toString() {
        return "MenuCafeBar{" +
                "id=" + id +
                ", cafeBar=" + cafeBar +
                ", drinks='" + drinks + '\'' +
                ", snacks='" + snacks + '\'' +
                '}';
    }
}


