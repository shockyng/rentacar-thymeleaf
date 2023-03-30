package me.shockyng.rentacar.api.services;

import me.shockyng.rentacar.api.models.Engine;
import me.shockyng.rentacar.api.repositories.EnginesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnginesService {

    private final EnginesRepository repository;

    public EnginesService(EnginesRepository repository) {
        this.repository = repository;
    }

    public List<Engine> getAllEngines() {
        return repository.findAll();
    }
}
