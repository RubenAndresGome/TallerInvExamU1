/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ti700.domain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author samsu
 */

@Named
@RequestScoped

public class HabilidadesAlumno {
    
    private String nombre;
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public HabilidadesAlumno() {
        this.nombre="Ruben";
        this.carrera="TICS";
    }
    
    
    
    
    
    
}
