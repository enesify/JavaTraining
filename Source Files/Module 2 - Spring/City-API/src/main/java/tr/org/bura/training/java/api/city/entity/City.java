package tr.org.bura.training.java.api.city.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name="City", schema = "sakila")
@Entity
@Data
public class City {

    @Column(name="city_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    @Column(name="city")
    private String cityName;

    @Column(name="country_id")
    private int countryId;

    @Column(name="last_update")
    private LocalDateTime lastUpdate;
}
