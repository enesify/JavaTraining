package tr.org.bura.training.java.api.city.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.org.bura.training.java.api.city.entity.City;
import tr.org.bura.training.java.api.city.repository.CityRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CityService {
    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }

    public City findByCityName(String name){
        City foundCityWithName = null;
        try {
          foundCityWithName =  cityRepository.findByCityName(name);

        }
        catch (Exception e){
            log.error("An error occurred while try to find a city containing {}, the error is: {} ",name,  e.getMessage());
        }
        return foundCityWithName;
    }

    public City findById(int id){
        Optional<City> foundCity = cityRepository.findById(id);
        return foundCity.orElse(null);
    }

    public List<City> findByContaining(String keyword){
        return cityRepository.findByCityNameContainingIgnoreCase(keyword);
    }

    public void deleteById(int id){
        cityRepository.deleteById(id);
    }

    public City saveCity(City city){
        City savedCity = null;
        try {
            savedCity =  cityRepository.save(city);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return savedCity;
    }
}
