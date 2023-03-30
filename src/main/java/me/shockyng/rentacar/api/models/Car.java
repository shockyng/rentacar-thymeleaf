package me.shockyng.rentacar.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CARS")
public class Car {

    @Id
    @Column(name = "CAR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CAR_NAME")
    private String name;

    @Column(name = "CAR_YEAR")
    private Integer year;

    @ManyToOne
    @JoinColumn(name = "ENGINE_FK")
    private Engine engine;
}
