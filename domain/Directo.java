package com.desafio2.domain;

public class Directo extends Empleado {
    private long salario;

    public Directo(String nombre ,long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        return this.salario - (calcularSalud() +  calcularPension());
    }

    public long calcularSalud () {
        return (long) (this.salario * 0.05);
    }

    public long calcularPension() {
        return (long) (this.salario * 0.065);
    }

    public long getSalario() {
        return salario;
    }
}
