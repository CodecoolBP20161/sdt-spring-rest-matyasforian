package com.codecool.spring;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column
    public String name;

    @Column(name = "class")
    public String studentClass;
}
