package com.takeaway.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="county")
    private String county;

    @Column(name = "country")
    private String country;

    @Column(name="post_code")
    private String postCode;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;

}
