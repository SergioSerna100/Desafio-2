package com.desafio2.domain;

public class Vendedor extends Directo {
    private long ventasDelMes;

    public Vendedor(String nombre, long salario , long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes=ventasDelMes;
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + this.CalcularComision();
    }

    public long CalcularComision() {
        double comision;
        if(this.getSalario()<999999) {
            comision = this.ventasDelMes * 0.04;
        }
        else {
            comision=this.ventasDelMes * 0.035;
        }
        return (long) comision;
    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }
}
