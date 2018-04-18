package com.test.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(generator = "companyGenerator")
    @GenericGenerator(name = "companyGenerator", strategy = "increment")
    private Long id;

    @Column
    private String name;
}
