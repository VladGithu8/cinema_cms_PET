package com.pet.project.cinemacms.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ticket_price")
public class TicketPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="ticket_price_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "seat_id")
    private Seat seatTicketPrice;

    @Column(name = "price")
    private Double ticketPrice;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "session_ticket_price",
            joinColumns = { @JoinColumn(name = "ticket_price_id") },
            inverseJoinColumns = { @JoinColumn(name = "cinema_session_id")
            })
    List<CinemaSession> cinemaSessionList;

    public TicketPrice() {
    }

    public TicketPrice(Seat seatTicketPrice, Double ticketPrice, List<CinemaSession> cinemaSessionList) {
        this.seatTicketPrice = seatTicketPrice;
        this.ticketPrice = ticketPrice;
        this.cinemaSessionList = cinemaSessionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seat getSeatTicketPrice() {
        return seatTicketPrice;
    }

    public void setSeatTicketPrice(Seat seatTicketPrice) {
        this.seatTicketPrice = seatTicketPrice;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public List<CinemaSession> getCinemaSessionList() {
        return cinemaSessionList;
    }

    public void setCinemaSessionList(List<CinemaSession> cinemaSessionList) {
        this.cinemaSessionList = cinemaSessionList;
    }

    @Override
    public String toString() {
        return "TicketPrice{" +
                "id=" + id +
                ", seatTicketPrice=" + seatTicketPrice +
                ", ticketPrice=" + ticketPrice +
                ", cinemaSessionList=" + cinemaSessionList +
                '}';
    }
}
