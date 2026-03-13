package com.dealership.dealership.entity;

import com.dealership.dealership.enums.VehicleUsageStatus;
import jakarta.persistence.*;

import java.util.UUID;
    @Entity
    @Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private UUID id;
    @Column (name = "brand")
    private String brand;
    @Column (name = "model")
    private String model;
    @Column (name = "year")
    private Integer year;
    @Column (name = "color")
    private String color;
    @Column (name = "status")
    @Enumerated
    private VehicleUsageStatus status;
    @Column (name = "price")
    private Double price;
}
