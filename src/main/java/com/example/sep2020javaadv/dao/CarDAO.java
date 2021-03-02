package com.example.sep2020javaadv.dao;

import com.example.sep2020javaadv.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car,Integer> {
}
