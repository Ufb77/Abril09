package com.softtek.modelo.ej3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;


    @Override
    public String toString() {
        return "Nombre: " + nombre +"\n" +
                "Edad: " + edad +"\n" +
                "Estado Civil: " + estadoCivil;
    }

    @Override
    public boolean equals(Object o) {
        boolean resultado;

        if (o != null && o instanceof Persona){
            Persona persona = (Persona) o;

            if(this.nombre.equalsIgnoreCase(persona.getNombre()) || this.edad == persona.getEdad()
            ||this.estadoCivil == persona.getEstadoCivil()){
                resultado = true;
            }else{
                resultado = false;
            }
        }else{
            resultado = false;
        }

        return resultado;
    }


}
