package com.example.sep2020javaadv.controllers;

import com.example.sep2020javaadv.dao.CarDAO;
import com.example.sep2020javaadv.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {
    private CarDAO carDAO;

    @GetMapping("/saveCar")
    public void saveCar(@RequestParam String model) {
        Car car = new Car(model);
        carDAO.save(car);

    }


    @GetMapping("/getCars")
    public List<Car> getCars() {
        return carDAO.findAll();
    }


}
