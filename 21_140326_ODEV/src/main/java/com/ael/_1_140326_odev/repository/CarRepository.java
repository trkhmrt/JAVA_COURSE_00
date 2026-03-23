package com.ael._1_140326_odev.repository;

import com.ael._1_140326_odev.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {

}
