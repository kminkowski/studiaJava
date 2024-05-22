package org.example.CarRental.Repositories;
import org.example.CarRental.HtmlSchema;
import org.example.CarRental.Models.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarsRepository{

    @Autowired
    JdbcTemplate jdbcTemplate = null;

    public List<Cars> getAll(){
     return jdbcTemplate.query("SELECT * from Cars", BeanPropertyRowMapper.newInstance(Cars.class));
    }

    public List<Cars> getAudi(){
        return jdbcTemplate.query("SELECT * from Cars where Brand = 'Audi'",
                BeanPropertyRowMapper.newInstance(Cars.class));
    }

    public List<Cars> getBMW(){
        return jdbcTemplate.query("SELECT * from Cars where Brand = 'BMW'",
                BeanPropertyRowMapper.newInstance(Cars.class));
    }

    public List<Cars> getFiat(){
        return jdbcTemplate.query("SELECT * from Cars where Brand = 'Fiat'",
                BeanPropertyRowMapper.newInstance(Cars.class));
    }

    public List<Cars> getOpel(){
        return jdbcTemplate.query("SELECT * from Cars where Brand = 'Opel'",
                BeanPropertyRowMapper.newInstance(Cars.class));
    }

    public List<Cars> sortByPriceDesc(){
        return jdbcTemplate.query("SELECT * from Cars order by CostPerDay desc",
                BeanPropertyRowMapper.newInstance(Cars.class));
    }

}
