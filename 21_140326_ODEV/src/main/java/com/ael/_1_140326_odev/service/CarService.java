package com.ael._1_140326_odev.service;

import com.ael._1_140326_odev.model.Car;
import com.ael._1_140326_odev.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public void createCar(Car car){
        carRepository.save(car);
    }



}
