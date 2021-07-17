package tr.org.bura.training.java.api.city.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.org.bura.training.java.api.city.dao.CityDao;
import tr.org.bura.training.java.api.city.entity.City;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class CityController {

    private CityDao cityDao;

    @Autowired
    public CityController(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @GetMapping("/cities/{id}")
    public ResponseEntity<City> findById(@PathVariable int id) {
        City city = new City();
        try {
            city = cityDao.getCity(id);
            return new ResponseEntity<>(city, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(city, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cities")
    public ResponseEntity<List<City>> findAll(){
        List<City> cities;
        try{
            cities = cityDao.getCities();
            return new ResponseEntity<>(cities, HttpStatus.OK);
        }
        catch (Exception e){
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/cities")
    public ResponseEntity<City> saveCity(@RequestBody City city) {
        try {
            return new ResponseEntity<>(cityDao.saveCity(city), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(city, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping("/cities")
    public ResponseEntity<City> updateCity(@RequestBody City city) {
        try {
            return new ResponseEntity<>(cityDao.updateCity(city), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(city, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/cities/{id}")
    public ResponseEntity<Boolean> deleteCity(@PathVariable int id) {
        try {
            return new ResponseEntity<>(cityDao.deleteCity(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
