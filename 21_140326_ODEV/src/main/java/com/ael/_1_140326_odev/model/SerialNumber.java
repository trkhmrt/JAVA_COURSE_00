package com.ael._1_140326_odev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="serial_numbers")
public class SerialNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serialNumberId;

    private String carModel;

}
