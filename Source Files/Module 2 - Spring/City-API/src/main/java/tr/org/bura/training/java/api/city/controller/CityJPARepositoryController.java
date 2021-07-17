package tr.org.bura.training.java.api.city.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.org.bura.training.java.api.city.entity.City;
import tr.org.bura.training.java.api.city.service.CityService;

import javax.swing.text.html.HTML;
import java.util.List;

@RequestMapping("api/v2")
@RestController
public class CityJPARepositoryController {
    private CityService cityService;

    @Autowired
    public CityJPARepositoryController(CityService cityService){
        this.cityService = cityService;
    }

    @GetMapping("/cities/{id}")
    public ResponseEntity<City> findById(@PathVariable int id) {
        City city = new City();
        try {
            city = cityService.findById(id);
            return new ResponseEntity<>(city, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(city, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cities/city")
    public ResponseEntity<City> findByCityName(@RequestParam(name = "city-name") String city){
        try {
            City foundCity = cityService.findByCityName(city);
            return new ResponseEntity<>(foundCity, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cities")
    public ResponseEntity<List<City>> findByContaining(@RequestParam(name = "contains-keyword") String keyword){
        try {
            List<City> containingCities = cityService.findByContaining(keyword);
            return new ResponseEntity<>(containingCities, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/cities")
    public ResponseEntity<City> saveCity(@RequestBody City city) {
        try {
            return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(city, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping("/cities")
    public ResponseEntity<City> updateCity(@RequestBody City city) {
        try {
            return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(city, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/cities/{id}")
    public ResponseEntity<Boolean> deleteCity(@PathVariable int id) {
        try {
            cityService.deleteById(id);
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
