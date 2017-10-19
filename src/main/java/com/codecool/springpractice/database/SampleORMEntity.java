package com.codecool.springpractice.database;

import javax.persistence.*;

// An ORM entity that represents a table in the DB.
@Entity
@Table(name = "customer")
public class SampleORMEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    // This is needed so Spring can create an instance of it automatically
    protected SampleORMEntity() { }

    public SampleORMEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
}