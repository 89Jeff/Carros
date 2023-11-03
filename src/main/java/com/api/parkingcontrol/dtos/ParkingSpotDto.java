package com.api.parkingcontrol.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ParkingSpotDto {
    
    //aqui verifica se o campo não é null ou se tem String vazia
    @NotBlank
    private String parkingSpotNumber;

    //aqui aonde eu limito o número de caracteres
    @Size(max = 7)
    private String licensePlateCar; 

    //aqui verifica se o campo não é null ou se tem String vazia
    @NotBlank
    private String brandCar;

    //aqui verifica se o campo não é null ou se tem String vazia
    @NotBlank
    private String modelCar;

    //aqui verifica se o campo não é null ou se tem String vazia
    @NotBlank
    private String colorCar;

    //aqui verifica se o campo não é null ou se tem String vazia
    @NotBlank   
    private String responsibleName;
    
    //aqui verifica se o campo não é null ou se tem String vazia
    @NotBlank
    private String apartment;
    
    //aqui verifica se o campo não é null ou se tem String vazia
    @NotBlank
    private String block;

    public String getParkingSpotNumber() {
        return this.parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return this.licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return this.brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return this.modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return this.colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return this.responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return this.apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return this.block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
    


}
