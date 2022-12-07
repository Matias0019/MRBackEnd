package com.portfolio.back.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombre;   
    @NotBlank
    private String linkproyecto; 
    @NotBlank
    private String descripcion;
    @NotBlank
    private String img;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String linkproyecto, String descripcion, String img) {
        this.nombre = nombre;
        this.linkproyecto = linkproyecto;
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLinkproyecto() {
        return linkproyecto;
    }

    public void setLinkproyecto(String linkproyecto) {
        this.linkproyecto = linkproyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
