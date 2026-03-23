package com.ael._1_140326_odev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    private String driverName;

    //ÇOKA ÇOK İLİŞKİ
    //Bir sürücü birden fazla arabayı sürebilir.
    //Bir arabanında birden fazla sürücüsü olabilir.

    @ManyToMany(mappedBy = "drivers")
    private Set<Car> cars;

}
