package com.example.communication.entity;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.DoubleStream;

@Entity
@Table(name="contact")
@Data
public class Contact implements Serializable{

    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
   // @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name ="phone_id",nullable = false)

    String phoneNumber;
    String name;
    String lastName;

    public Contact() {
    }

    public Contact(String phoneNumber, String name, String lastName) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    public Contact(String name, String phoneNumber) {
    }






}
