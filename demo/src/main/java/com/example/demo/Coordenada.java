package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Coordenada", schema = "servicio")
public class Coordenada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Coordenada;

    @Column(name = "latitud")
    private double latitud;
    @Column(name = "longitud")
    private double longitud;

    public Coordenada() {}

    public Coordenada(double latitud, double longitud) {

        this.latitud = latitud;
        this.longitud = longitud;
    }

    // Getters y setters
}
