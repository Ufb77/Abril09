package com.softtek.modelo.ej1;

import lombok.Data;
import lombok.ToString;

@Data
public class Globo {
    private static int contador = 0;
    private final int id;

    public Globo() {
        this.id = ++contador;
    }
}
