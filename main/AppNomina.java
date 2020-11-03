package com.desafio2.main;

import com.desafio2.domain.*;


public class AppNomina {

    public static void main(String[] args) {
        Nomina nominaTiendaCamaras = new Nomina();
        Vendedor vendedor1 = new Vendedor("Julian",2050000,45510000);
        Freenlace freenlace1 = new Freenlace("Johanna",71000,89);
        Vendedor vendedor2 = new Vendedor("Carolina",980000,35989000);
        Promotor promotor1 = new Promotor("Pedro",1200,300,62);
        Freenlace freelance2 = new Freenlace("Gustavo", 42500, 65);
        Directo Directo1 = new Directo("David", 3975000);
        Directo Directo2 = new Directo("Juan", 4840000);

        nominaTiendaCamaras.getEmpleados().add(vendedor1);
        nominaTiendaCamaras.getEmpleados().add(vendedor2);
        nominaTiendaCamaras.getEmpleados().add(freenlace1);
        nominaTiendaCamaras.getEmpleados().add(freelance2);
        nominaTiendaCamaras.getEmpleados().add(promotor1);
        nominaTiendaCamaras.getEmpleados().add(Directo1);
        nominaTiendaCamaras.getEmpleados().add(Directo2);

        System.out.println("Salario de Empleados");
        nominaTiendaCamaras.calcularNomina();
        System.out.println("\n");

        System.out.println("Directos");
        nominaTiendaCamaras.listarDirectos();
        System.out.println('\n');
        System.out.println("Freelancers");
        nominaTiendaCamaras.listarFreelancers();
        System.out.println('\n');
        System.out.println("Promotores");
        nominaTiendaCamaras.listarPromotores();
    }
}
