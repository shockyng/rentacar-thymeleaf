package me.shockyng.rentacar.api.repositories;

import me.shockyng.rentacar.api.models.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnginesRepository extends JpaRepository<Engine, Long> {
}
