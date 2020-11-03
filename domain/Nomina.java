package com.desafio2.domain;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados;

    public Nomina() {
        this.empleados= new ArrayList<Empleado>();
    }

    public boolean contratarEmpleado(Empleado empleado) {
        boolean pudoAgregar = true;

        for (Empleado emp : empleados) {
            if (emp.getNombre().equals(empleado.getNombre())) {
                pudoAgregar = false;
                break;
            }
        }

        if(pudoAgregar) {
            pudoAgregar = this.empleados.add(empleado);
        } else {
            System.out.println("El empleado " + empleado.getNombre() + " ya está trabajando con nosotros.");
        }

        return pudoAgregar;
    }

    public boolean despedirEmpleado(Empleado empleado) {
        boolean pudoDespedir = false;

        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i).getNombre().equals(empleado.getNombre())) {
                this.empleados.remove(i);
                pudoDespedir = true;
                break;
            }
        }

        if(!pudoDespedir) {
            System.out.println("El empleado ni siquiera existe en nuestra nómina.");
        }

        return pudoDespedir;
    }

    public void calcularNomina() {
        for (Empleado empleado : empleados) {
            System.out.println(" El Salario De " + empleado.getNombre() + " es de " + empleado.calcularSalario());
        }
    }

    public void listarDirectos() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof Directo) {
                System.out.println(empleado.getNombre());
            }
        }
    }

    public void listarFreelancers() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof Freenlace) {
                System.out.println(empleado.getNombre());
            }
        }
    }

    public void listarPromotores() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof Promotor) {
                System.out.println(empleado.getNombre());
            }
        }
    }

    public double consultarDeduccion(String tipoDeduccion) {
        double totalDeduccion = 0;

        switch (tipoDeduccion) {
            case "SALUD":
                for (Empleado empleado : empleados) {
                    if(empleado instanceof Directo) {
                        totalDeduccion += ((Directo) empleado).calcularSalud();
                    }
                }

                break;
            case "PENSION":
                for (Empleado empleado : empleados) {
                    if(empleado instanceof Directo) {
                        totalDeduccion += ((Directo) empleado).calcularPension();
                    }
                }

                break;
            default:
                System.out.println("No se ingresó una deducción válida");
                break;
        }

        return totalDeduccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}
