package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public final class Producto {

    public static int contador = 0;
    private final int ID;
    private String nombre;
    private double precio;


    public Producto() {
        this.ID = ++contador;
    }

    public  double importe(int cantidad){
        return cantidad * precio;
    }
}
