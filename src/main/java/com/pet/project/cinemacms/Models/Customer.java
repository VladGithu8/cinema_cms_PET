package com.pet.project.cinemacms.Models;

import javax.persistence.*;

@Entity(name = "Customer")
@Table(
        name = "customer",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "customer_email_unique",
                        columnNames = "email"
                )
        })
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "poster_id")
    private Ticket ticketCustomer;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(
            name = "nick_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String nickName;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String email;

    @Column(
            name = "phone",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String phone;

    @Column(
            name = "gender",
            columnDefinition = "TEXT")
    private String gender;

    @Column(
            name = "credit_card",
            columnDefinition = "TEXT",
            unique = true
    )
    private String creditCard;

    @Column(name = "age")
    private Integer age;

    public Customer() {
    }

    public Customer(Ticket ticketCustomer, String firstName,
                    String lastName, String nickName,
                    String email, String phone,
                    String gender, String creditCard,
                    Integer age) {
        this.ticketCustomer = ticketCustomer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.creditCard = creditCard;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Ticket getTicketCustomer() {
        return ticketCustomer;
    }

    public void setTicketCustomer(Ticket ticketCustomer) {
        this.ticketCustomer = ticketCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", ticketCustomer=" + ticketCustomer +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", age=" + age +
                '}';
    }
}


