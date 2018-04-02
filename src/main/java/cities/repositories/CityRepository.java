package cities.repositories;

import cities.entity.City;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long>, JpaSpecificationExecutor<City> {
    List<City> findByName(String name);
    List<City> findByNameIgnoreCase(String name);
}
