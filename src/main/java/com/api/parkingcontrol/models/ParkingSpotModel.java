package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 

@Entity
@Table(name = "TB_PARKING_SPOT_MODEL")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    //a linha abaixo eu gero o id automatico
    @GeneratedValue(strategy = GenerationType.AUTO)
    // uuid ele gera números de id aleatorios
    private UUID id;

    //aqui não pode ser null , ela vai ser unica, e o tamnho 10
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    //aqui não pode ser null , ela vai ser unico, e o tamnho 7
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar; 

    //aqui não pode ser null ,  e o tamnho 70
    @Column(nullable = false,  length = 70)
    private String brandCar;

    //aqui não pode ser null , e o tamnho 70
    @Column(nullable = false,  length = 70)
    private String modelCar;

    //aqui não pode ser null ,  e o tamnho 10
    @Column(nullable = false,  length = 70)
    private String colorCar;

    //aqui não pode ser null 
    @Column(nullable = false)
    private LocalDateTime registrationDate;
   
    //aqui não pode ser null , e o tamnho 130
    @Column(nullable = false,  length = 130)   
    private String responsibleName;
    
    //aqui não pode ser null , e o tamnho 30
    @Column(nullable = false,  length = 30)
    private String apartment;
    
    //aqui não pode ser null , e o tamnho 30
    @Column(nullable = false,  length = 30)
    private String block;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
