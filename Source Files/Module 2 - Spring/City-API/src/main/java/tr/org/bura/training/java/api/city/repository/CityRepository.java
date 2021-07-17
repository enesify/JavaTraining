package tr.org.bura.training.java.api.city.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tr.org.bura.training.java.api.city.entity.City;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    City findByCityName(String cityName);
    List<City> findByCountryId(int countryId);
    List<City> findByCityNameContainingIgnoreCase(String containing);
    List<City> findByCityNameAndCountryId(String cityName, int countryId);
}
