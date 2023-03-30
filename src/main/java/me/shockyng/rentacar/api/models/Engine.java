package me.shockyng.rentacar.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ENGINES")
public class Engine {

    @Id
    @Column(name = "ENGINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ENGINE_NAME")
    private String name;

}
