package com.softtek.presentacion.ejInterfacesFuncionales;

import com.softtek.modelo.ClasesEjInterfaceFunction.Stats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class EjInterfaceFunction {

    public static void main(String[] args) {

        listaDevuelvePares();
        calculoEstadisticas();

    }


//Filtrado de elementos de una lista: Define una función que tome una lista de
//números como entrada y devuelva una lista que solo contenga los números
//pares. Utiliza la interfaz funcional Function para filtrar los elementos de la
//lista.
    public static void listaDevuelvePares(){
        int[] arrayNumeros = {0,1,2,3,4};
        Function<int[], ArrayList> lista = x->{

            ArrayList<Integer> miArrayList = new ArrayList<>();
            for(int i = 0; i < x.length; i++){
                if(x[i]%2 == 0){
                    miArrayList.add(x[i]);
                }
            }
            return miArrayList;
        };

        for (Integer numero: (ArrayList<Integer>)lista.apply(arrayNumeros)
             ) {
            System.out.println(numero);
        }
    }

    /**
     * Filtrado de elementos de una lista: Define una función que tome una lista de
     * números como entrada y devuelva una lista que solo contenga los números
     * pares. Utiliza la interfaz funcional Function para filtrar los elementos de la
     * lista.
     */
    public static void calculoEstadisticas(){
        Double[] arrayNumeros = {0.0,3.0,2.0,4.0,1.0};
        Function<Double[], Stats> estadisticas = x -> {

            double min = 0;
            double max = 0;
            double total = 0;
            double media = 0;
            Arrays.sort(x);

            for (Double numero: x
                 ) {
                total += numero;
            }

            media = total / x.length;

            min = x[0];
            max = x[x.length-1];


            return new Stats(min, max, media);
        };

        System.out.println(estadisticas.apply(arrayNumeros));
    }


    /**
     * Validación de contraseñas:Crea una función que tome una cadena que
     * representa una contraseña y devuelva true si la contraseña cumple con ciertos
     * criterios de validación, como tener al menos ocho caracteres, incluir al menos
     * una letra mayúscula, una letra minúscula, un número y un carácter especial.
     * Utiliza la interfaz funcional Function para representar cada criterio de
     * validación como una función independiente y combina estas funciones para
     * verificar la contraseña completa.
     */
    public static void validacionPass(){
        String cadena;

        boolean passValida = false;
        Function<String, Boolean> numCaracteres = x-> x.length()>= 8;
        Function<String, Boolean> restoComprobacion = x ->x.matches("");



    }
}
