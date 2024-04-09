package com.softtek.presentacion.ej3;

import com.softtek.modelo.ej3.EstadoCivil;
import com.softtek.modelo.ej3.Persona;

public class TestPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Samuel", 21, EstadoCivil.CASADO);
        Persona p2 = new Persona("Samuel", 21, EstadoCivil.DIVORCIADO);
        Persona p3 = new Persona("Samuel", 21, EstadoCivil.CASADO);
        Persona p4 = new Persona("Ana", 21, EstadoCivil.CASADO);
        Persona p5 = new Persona("Ana", 22, EstadoCivil.CASADO);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p4.equals(p1));
        System.out.println(p2.equals(p4));
    }
}
