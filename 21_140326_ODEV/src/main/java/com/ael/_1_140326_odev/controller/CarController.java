package com.ael._1_140326_odev.controller;


import com.ael._1_140326_odev.model.Car;
import com.ael._1_140326_odev.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping("/create")
    public ResponseEntity createCar(@RequestBody Car car){
      carService.createCar(car);
      //return ResponseEntity.ok("Kayıt işlemi başarıyla gerçekleştirildi.");
      //return ResponseEntity.status(403).body("Yetkiniz yok");
      return ResponseEntity.status(401).body("Giriş yapınız");
    }

}
