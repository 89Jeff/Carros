package com.api.Carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.Carros.models.Car;
import com.api.Carros.services.CarService;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/novo-carro")
    public String novoCarroForm() {
        return "novo-carro";
    }

    @PostMapping("/api/carros")
    @ResponseBody
    public String cadastrarCarro(@RequestBody Car car) {
        if (car.getModelo().trim().isEmpty() || car.getFabricante().trim().isEmpty() || car.getAnoLancamento() <= 0) {
            return "Erro: Campos inválidos";
        }

        carService.createCar(car);
        return "Carro cadastrado com sucesso";
    }
}
