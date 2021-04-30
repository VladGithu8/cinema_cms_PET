package com.pet.project.cinemacms.Models;

import com.pet.project.cinemacms.Models.AboutCinema.CinemaHall;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "Seat")
@Table(name="seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="seat_id")
    private Long id;

    @OneToMany(mappedBy = "seatTicketPrice",
            targetEntity = TicketPrice.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "ticket_price")
    private List<TicketPrice> ticketPriceList;

    @OneToMany(mappedBy = "cinemaHallSeat",
            targetEntity = CinemaHall.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "cinema_hall")
    private List<CinemaHall> cinemaHallList;

    @Column(name = "row_seats")
    private int row;

    @Column(name = "seat_number")
    private int seatNumber;

    @Column(name = "its_free")
    private boolean itsFree;

    public Seat() {
    }

    public Seat(List<TicketPrice> ticketPriceList,
                List<CinemaHall> cinemaHallList, Integer row,
                Integer seatNumber, boolean itsFree) {

        this.ticketPriceList = ticketPriceList;
        this.cinemaHallList = cinemaHallList;
        this.row = row;
        this.seatNumber = seatNumber;
        this.itsFree = itsFree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TicketPrice> getTicketPriceList() {
        return ticketPriceList;
    }

    public void setTicketPriceList(List<TicketPrice> ticketPriceList) {
        this.ticketPriceList = ticketPriceList;
    }

    public List<CinemaHall> getCinemaHallList() {
        return cinemaHallList;
    }

    public void setCinemaHallList(List<CinemaHall> cinemaHallList) {
        this.cinemaHallList = cinemaHallList;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isItsFree() {
        return itsFree;
    }

    public void setItsFree(boolean itsFree) {
        this.itsFree = itsFree;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", ticketPriceList=" + ticketPriceList +
                ", cinemaHallList=" + cinemaHallList +
                ", row=" + row +
                ", seatNumber=" + seatNumber +
                ", itsFree=" + itsFree +
                '}';
    }
}




