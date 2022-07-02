package com.upchiapas.evaluacionc2.models;

import java.util.Scanner;

public class Pizza {

    private int id;
    private String especialidad;
    private float precio;
    private String tamaño;

    public Pizza() {
    }

    public Pizza(int id, String especialidad,String tamaño, float precio) {
        this.id = id;
        this.especialidad = especialidad;
        this.precio = precio;
        this.tamaño = tamaño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTamaño(){
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", especialidad='" + especialidad + '\'' +
                tamaño + ", precio=" + precio +
                '}';
    }
}
