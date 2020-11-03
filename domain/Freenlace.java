package com.desafio2.domain;

public class Freenlace extends Empleado {

    private long valorHora;
    private int horasTrabajadas;

    public Freenlace(String nombre, long valorHora , int horasTrabajadas){
        super(nombre);
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return valorHora * this.horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public long getValorHora() {
        return valorHora;
    }
}
