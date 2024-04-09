package com.softtek.presentacion;

import java.util.Arrays;
import java.util.HashSet;

public class PruebaHashSet {

    public static void main(String[] args) {
        //Se ordena por hashcode
        //No admite repetidos
        HashSet<String> lista = new HashSet<>();



        lista.add("Jose"); //Añade al hashset
        lista.add("Angel");
        lista.add("Samuel");
        lista.add("Samuel"); //repetido


        System.out.println("Imprime el hashset: " + lista.toString()); //Imprime el hashset

        System.out.println("¿La lista contiene Samuel?" + lista.contains("Samuel")); //Comprueba si contiene un objeto especifico

        lista.remove("Samuel"); //Elimina un elemento en concreto

        System.out.println("Tamaño del hashset: " + lista.size()); //Tamaño de la estructura
        System.out.println("Imprime el hashset: " + lista.toString());
        lista.clear(); //Vacia el hashset

        System.out.println("¿La lista está vacía?: " + lista.isEmpty()); //Comprueba si está vacío el hashset


         lista.addAll(Arrays.asList("Pera", "Kiwi", "Melocotón")); //Añade otra colección al hashset
         System.out.println(lista.toString());


    }
}
