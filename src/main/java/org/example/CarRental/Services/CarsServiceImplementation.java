//package org.example.CarRental.Services;
//
//import org.example.CarRental.DTO.CarsDTO;
//import org.example.CarRental.Models.Car;
//import org.example.CarRental.Repositories.CarsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class CarsServiceImplementation implements CarsService{
//
//    private CarsRepository carsRepository;
//
//    @Autowired
//    public CarsServiceImplementation(CarsRepository carsRepository){
//        this.carsRepository = carsRepository;
//    }
//
//    @Override
//    public List<CarsDTO> findAllCars(){
//        List<Car> cars = carsRepository.findAll();
//        return cars.stream().map((car) ->mapToCarsDTO(car)).collect(Collectors.toList());
//    }
//
//    private CarsDTO mapToCarsDTO(Car car){
//        CarsDTO carsDTO = CarsDTO.builder()
//                .CarID(car.getCarID())
//                .bodyType(car.getBodyType())
//                .brand(car.getBrand())
//                .costPerDay(car.getCostPerDay())
//                .engine(car.getEngine())
//                .fuelType(car.getFuelType())
//                .locationID(car.getLocationID())
//                .model(car.getModel())
//                .build();
//        return carsDTO;
//    }
//}
