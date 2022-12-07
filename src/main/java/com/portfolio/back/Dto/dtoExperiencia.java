package com.portfolio.back.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechainicio;
    @NotBlank
    private String fechafin;
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String fechainicio, String fechafin) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    
    //Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }
    
}
