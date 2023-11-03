package com.api.parkingcontrol.services;


import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
    
    //com essa anotação eu digo pro spring que em
    //determinado momento ele ejeta as depedencia
    //da ParkingSpotRpository aqui dentro, pode ser assim
    //@Autowired
    //ParkingSpotRpository parkingSpotRepository;

    //ou assim via construtor
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
