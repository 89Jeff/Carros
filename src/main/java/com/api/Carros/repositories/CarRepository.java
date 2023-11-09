package com.api.Carros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.Carros.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
