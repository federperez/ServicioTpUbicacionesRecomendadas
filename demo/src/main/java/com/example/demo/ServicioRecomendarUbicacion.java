package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Locations",description = "Obtiene las ubicaciones mas cercanas en base a una lat,long y radio")

public class ServicioRecomendarUbicacion {

    @Autowired
    private UbicacionService ubicacionService;

    @Operation(summary = "Get nearby locations", description = "Returns a list of nearby locations based on latitude, longitude, and radius")
    @GetMapping("/nearby")
    public List<Coordenada> getNearbyLocations(
            @Parameter(description = "Latitude") @RequestParam double lat,
            @Parameter(description = "Longitude") @RequestParam double lon,
            @Parameter(description = "Radius in kilometers") @RequestParam int radius) {
        return ubicacionService.obtenerCercanas(lat, lon, radius);
    }
}