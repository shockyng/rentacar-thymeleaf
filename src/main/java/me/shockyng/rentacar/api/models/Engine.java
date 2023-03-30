package me.shockyng.rentacar.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
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

    public Engine(long id) {
        this.id = id;
    }
}
