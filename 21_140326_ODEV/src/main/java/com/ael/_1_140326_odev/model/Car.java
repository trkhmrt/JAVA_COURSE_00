package com.ael._1_140326_odev.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serial;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="cars")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    private String mark;

    @Column(length = 60)
    private String color;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "serial_number_id")
    private SerialNumber serialNumber;


    @OneToMany(mappedBy = "car" ,cascade = CascadeType.ALL)
    private List<ServiceRecord> serviceRecords;

    @ManyToMany
    @JoinTable(
            name="car_driver_tables",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "driver_id")
    )
    private Set<Driver> drivers;


}
