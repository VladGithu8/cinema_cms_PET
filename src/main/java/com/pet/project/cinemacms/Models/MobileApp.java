package com.pet.project.cinemacms.Models;


import javax.persistence.*;

@Entity
@Table(name="app")
public class MobileApp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="app_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AboutCinema aboutCinemaApp;

    @Column (name="app_name")
    private String appName;

    @Column (name="url_playmarket")
    private String urlPlayMarket;

    @Column (name="url_appstore")
    private String urlAppStore;

    public MobileApp() {
    }

    public MobileApp(AboutCinema aboutCinema, String appName, String urlPlayMarket, String urlAppStore) {
        this.aboutCinemaApp = aboutCinema;
        this.appName = appName;
        this.urlPlayMarket = urlPlayMarket;
        this.urlAppStore = urlAppStore;
    }

    public AboutCinema getAboutCinemaApp() {
        return aboutCinemaApp;
    }

    public void setAboutCinemaApp(AboutCinema aboutCinemaApp) {
        this.aboutCinemaApp = aboutCinemaApp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUrlPlayMarket() {
        return urlPlayMarket;
    }

    public void setUrlPlayMarket(String urlPlayMarket) {
        this.urlPlayMarket = urlPlayMarket;
    }

    public String getUrlAppStore() {
        return urlAppStore;
    }

    public void setUrlAppStore(String urlAppStore) {
        this.urlAppStore = urlAppStore;
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "id=" + id +
                ", aboutCinemaApp=" + aboutCinemaApp +
                ", appName='" + appName + '\'' +
                ", urlPlayMarket='" + urlPlayMarket + '\'' +
                ", urlAppStore='" + urlAppStore + '\'' +
                '}';
    }
}



