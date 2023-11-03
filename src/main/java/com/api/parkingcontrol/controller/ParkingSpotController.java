package com.api.parkingcontrol.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.parkingcontrol.services.ParkingSpotService;

@RestController
//essa anotação eu permito acessar de qualquer fonte
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {
    //com essa anotação eu digo pro spring que em
    //determinado momento ele ejeta as depedencia
    //da ParkingSpotService aqui dentro, pode ser assim
    //@Autowired
    //ParkingSpotService ParkingSpotService;

    //ou assim via construtor
    final ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService  parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }

    

}
