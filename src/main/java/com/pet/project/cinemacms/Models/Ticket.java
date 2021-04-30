package com.pet.project.cinemacms.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="ticket_id")
    private Long id;

    @OneToMany(mappedBy = "ticketCustomer",
            targetEntity = Customer.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "customer_id")
    private List<Customer> customerList;

    @OneToMany(mappedBy = "ticketSession",
            targetEntity = CinemaSession.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "cinema_session_id")
    private List<CinemaSession> sessionList;

    @OneToMany(mappedBy = "ticketPrice",
            targetEntity = TicketPrice.class,
            fetch = FetchType.LAZY,
            cascade = javax.persistence.CascadeType.ALL)
    @Column(name = "ticket-price_id")
    private List<TicketPrice> ticketPriceList;

    public Ticket() {
    }

    public Ticket(List<Customer> customerList, List<CinemaSession> sessionList,
                  List<TicketPrice> ticketPriceList) {
        this.customerList = customerList;
        this.sessionList = sessionList;
        this.ticketPriceList = ticketPriceList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<CinemaSession> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<CinemaSession> sessionList) {
        this.sessionList = sessionList;
    }

    public List<TicketPrice> getTicketPriceList() {
        return ticketPriceList;
    }

    public void setTicketPriceList(List<TicketPrice> ticketPriceList) {
        this.ticketPriceList = ticketPriceList;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", customerList=" + customerList +
                ", sessionList=" + sessionList +
                ", ticketPriceList=" + ticketPriceList +
                '}';
    }
}





