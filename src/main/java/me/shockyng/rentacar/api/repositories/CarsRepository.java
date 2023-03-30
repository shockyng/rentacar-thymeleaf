package me.shockyng.rentacar.api.repositories;

import me.shockyng.rentacar.api.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarsRepository extends JpaRepository<Car, Long> {

    @Query("from Car c join fetch c.engine")
    List<Car> findAllCarsWithEngine();
}
