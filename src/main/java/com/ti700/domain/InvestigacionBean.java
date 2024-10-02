/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ti700.domain;

/**
 *
 * @author samsu
 */
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;

@Named
@ViewScoped
public class InvestigacionBean implements Serializable {
    private Investigacion investigacion;

    // Constructor
    public InvestigacionBean() {
        // Crear un objeto de investigación de ejemplo
        investigacion = new Investigacion(
            "Investigación sobre IA", 
            "Esta investigación explora los avances en Inteligencia Artificial.", 
            "https://www.ejemplo.com/referencia",
            "resources/images/ia.jpg" // Supongamos que la imagen está en la carpeta resources/images
        );
    }

    // Getters y Setters
    public Investigacion getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(Investigacion investigacion) {
        this.investigacion = investigacion;
    }
}

