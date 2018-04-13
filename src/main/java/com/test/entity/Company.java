package com.test.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Company {
    @Id
    @GeneratedValue(generator = "companyGenerator")
    @GenericGenerator(name = "companyGenerator", strategy = "increment")
    private Long id;

    @Column
    private String name;
}
