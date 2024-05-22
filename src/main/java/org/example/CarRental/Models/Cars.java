package org.example.CarRental.Models;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
@Data
@Entity
@Builder
@Table(name = "Cars")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CarID")
    private Long CarID;

    @Column(name = "BodyType")
    private String bodyType;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "CostPerDay")
    private float costPerDay;

    @Column(name = "Engine")
    private float engine;

    @Column(name = "FuelType")
    private String fuelType;

    @Column(name = "LocationID")
    private int locationID;

    @Column(name = "Model")
    private String model;

    public Long getCarID() {
        return CarID;
    }

    public void setCarID(Long carID) {
        CarID = carID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public float getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Cars(Long carID, String bodyType, String brand, float costPerDay, float engine, String fuelType, int locationID, String model) {
        CarID = carID;
        this.bodyType = bodyType;
        this.brand = brand;
        this.costPerDay = costPerDay;
        this.engine = engine;
        this.fuelType = fuelType;
        this.locationID = locationID;
        this.model = model;
    }

    public Cars() {
    }

    @Override
    public String toString() {
        return "Cars{" +
                "CarID=" + CarID +
                ", locationID=" + locationID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", fuelType='" + fuelType + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", costPerDay=" + costPerDay +
                '}';
    }
}
