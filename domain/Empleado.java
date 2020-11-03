package com.desafio2.domain;

public abstract class Empleado {
    private String nombre;

    public abstract long calcularSalario();

    public Empleado (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
