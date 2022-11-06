package com.learning.licensing.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "licenses")
@Getter @Setter @ToString
public class Licenses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String licenseId;

    @Column(nullable = false)
    private String organizationId;

    @Column(nullable = false)
    private String licensesType;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer licenseMax;

    @Column(nullable = false)
    private Integer licenseAllocated;

    private String comment;
}
