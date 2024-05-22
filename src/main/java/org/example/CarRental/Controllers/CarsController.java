package org.example.CarRental.Controllers;

//import org.example.CarRental.DTO.CarsDTO;
//import org.example.CarRental.Services.CarsService;
import org.example.CarRental.HtmlSchema;
import org.example.CarRental.Models.Cars;
import org.example.CarRental.Repositories.CarsRepository;
import org.hibernate.annotations.processing.HQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarsController{

    @Autowired
    CarsRepository carsRepository;

    @GetMapping("/")
    public String WebLayout(){
        return HtmlSchema.htmlSchema();
    }

    @GetMapping("/rentcars")
    public String rentCar(){
        return HtmlSchema.rentCar();
    }

    @GetMapping("/rentcars/audi")
    public List<Cars> getAudi(){
    return carsRepository.getAudi();
    }

    @GetMapping("/rentcars/bmw")
    public List<Cars> getBMW(){
        return carsRepository.getBMW();
    }

    @GetMapping("/rentcars/fiat")
    public List<Cars> getFiat(){
        return carsRepository.getFiat();
    }

    @GetMapping("/rentcars/opel")
    public List<Cars> getOpel(){
        return carsRepository.getOpel();
    }

    @GetMapping("rentcars/sortByPriceDesc")
    public List<Cars> sortByPriceDesc(){
        return carsRepository.sortByPriceDesc();

    }
    
    @GetMapping("/cars")
    public String layout(){
        return HtmlSchema.layout();
    }

    @GetMapping("/allcars")
    public List<Cars> getAll(){
    return carsRepository.getAll();
    }

    @GetMapping("/login")
    public String login(){
        return HtmlSchema.login();
    }

    @GetMapping("/register")
    public String register(){
        return HtmlSchema.register();
    }
}
