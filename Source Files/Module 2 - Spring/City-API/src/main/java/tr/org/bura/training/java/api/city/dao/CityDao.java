package tr.org.bura.training.java.api.city.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tr.org.bura.training.java.api.city.entity.City;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
@Slf4j
public class CityDao {
    @PersistenceContext
    EntityManager entityManager;

    public City saveCity(City city){
        entityManager.persist(city);
        return city;
    }

    public City getCity(int cityId){
        return entityManager.find(City.class, cityId);
    }


    public List<City> getCities(){
        List<City> cities;
        cities = entityManager.createQuery("SELECT c FROM City c WHERE c.cityId BETWEEN :startIndex AND :endIndex", City.class)
                .setParameter("startIndex", 500)
                .setParameter("endIndex", 600).getResultList();
        return cities;
    }

    public City updateCity(City city){
        entityManager.merge(city);
        return city;
    }

    public boolean deleteCity(int cityId){
        //log.info(city.toString());
        City removedCity = entityManager.find(City.class, cityId);
        if(removedCity!= null){
            entityManager.remove(removedCity);
           //entityManager.remove(city);
            return true;
        }
        return false;
    }
}
