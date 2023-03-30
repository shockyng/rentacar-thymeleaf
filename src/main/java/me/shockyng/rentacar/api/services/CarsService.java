package me.shockyng.rentacar.api.services;

import me.shockyng.rentacar.api.models.Car;
import me.shockyng.rentacar.api.repositories.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {

    private final CarsRepository repository;

    public CarsService(CarsRepository repository) {
        this.repository = repository;
    }

    public List<Car> getAllCars() {
        return repository.findAllCarsWithEngine();
    }
}
