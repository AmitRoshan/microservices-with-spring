package com.learn.organization.dtos;

import javax.persistence.*;

@Entity
@Table(name = "organizations")
public class Organizations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String organizationId;

    @Column(nullable = false)
    private String organizationName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;


}
