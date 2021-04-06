package com.takeaway.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "review")
@Getter
@Setter
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comment")
    private String comment;

    public Review(String name, int rating, String comment) {
        this.name = name;
        this.rating = rating;
        this.comment = comment;
    }

}
