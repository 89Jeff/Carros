package com.api.parkingcontrol.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSpotService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @PostMapping
    //aqui eu usei ResponseEntity para montar umas resposta tanto com status e também o corpo dessa
    //resposta, e eu coloquei aqui object porque depois vamos ter diferentes tipo de retorno dependendo
    //de algumas verificações que a gente vai fazer inicialmente então responseEntity Object, eu vou 
    //receber o nosso Parkingspotdto que eu criei, aqui iremos receber como json, se eu não colocar @valid
    //todas as validações que eu coloquei ParkingSpotDto não vão ser realizadas, assim se alguma validação
    //estiver incorreta ele nem entra no método.
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto) {
        //posso fazer assim 
        //ParkingSpotModel parkingSpotModel = new ParkingSpotModel();

        //ou assim
        var parkingSpotModel = new ParkingSpotModel();

        //aqui eu vou converter o parkingSpotDto em parkingSpotModel
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);

        //aqui eu estou setando a data de registro porque no parkingSpotDto não coloquei
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

        //
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    }
    

}
