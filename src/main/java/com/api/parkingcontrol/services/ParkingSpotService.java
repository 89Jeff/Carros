package com.api.parkingcontrol.services;


import org.springframework.stereotype.Service;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

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

    //quando é método construtivo ou destrutivo é interessante da gente anotar
    //eles com @transactional principalmente quando a gente tem relacionamento
    //né que vai ter deleção em Cascata o salvamento em Cascata é interessante
    //a gente utilizar do @transitional por que se há algo de errado  durante
    //essa translação ele garante que tudo volte ao normal certo e a gente não
    //tenha dados quebrados vão dizer assim.
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
