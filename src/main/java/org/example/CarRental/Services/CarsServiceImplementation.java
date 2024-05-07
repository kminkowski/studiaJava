package org.example.CarRental.Services;

import org.example.CarRental.DTO.CarsDTO;
import org.example.CarRental.Models.Cars;
import org.example.CarRental.Repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServiceImplementation implements CarsService{

    private CarsRepository carsRepository;

    @Autowired
    public CarsServiceImplementation(CarsRepository carsRepository){
        this.carsRepository = carsRepository;
    }

    @Override
    public List<CarsDTO> findAllCars(){
        List<Cars> carsList = carsRepository.findAll();
        return carsList.stream().map((cars) ->mapToCarDTO(cars)).collect(Collectors.toList());
    }

    private CarsDTO mapToCarDTO(Cars cars){
        CarsDTO carsDTO = CarsDTO.builder()
                .CarID(cars.getCarID())
                .bodyType(cars.getBodyType())
                .brand(cars.getBrand())
                .costPerDay(cars.getCostPerDay())
                .engine(cars.getEngine())
                .fuelType(cars.getFuelType())
                .locationID(cars.getLocationID())
                .model(cars.getModel())
                .build();
        return carsDTO;
    }
}
