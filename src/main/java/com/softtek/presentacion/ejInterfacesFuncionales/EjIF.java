package com.softtek.presentacion.ejInterfacesFuncionales;

import com.softtek.modelo.Producto;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EjIF {
    public static void main(String[] args) {

        esPositivo();


        cadenaVacia();



        esPar();


        mayorQue();


        esPrimo();

        aMayusculas();

        cuadrados();

        detallesProducto();

        mensaje();

        escribirRegistro(new File("miarchivo.txt"));

        numeroAleatorio(1,6);

        lista();

        fechaHora();




    }

    public static void esPositivo(){
        Predicate<Integer> esPositivo = x-> x>=0;
        boolean resultado = esPositivo.test(2);
        System.out.println(resultado);
    }

    public static void cadenaVacia(){
        Predicate<String> cadenaVacia = x -> x.length()>0;
        boolean resultado = cadenaVacia.test("hola");
        System.out.println(resultado);
    }

    public static void esPar(){
        Predicate<Integer> esPar = x-> x%2 == 0;
        boolean resultado = esPar.test(8);
        System.out.println(resultado);
    }

    public static void mayorQue(){
        int numeroEspecifico = 6;
        Predicate<Integer> mayorQue = x-> x>numeroEspecifico;
        boolean resultado = mayorQue.test(8);
        System.out.println(resultado);
    }

    public static void esPrimo(){
        Predicate<Integer> esPrimo = x-> {
            for(int i = 2; i<x; i++){
                if(x%i == 0){
                    return false;
                }
                return true;
            }
            return true;
        };
        boolean resultado = esPrimo.test(4);
        System.out.println(resultado);
    }

    public static void aMayusculas(){
        Consumer<String> aMayusculas = x -> System.out.println(x.toUpperCase());
        aMayusculas.accept("hola");
    }



    public static  void cuadrados(){
        Consumer<Double> cuadrado = x -> System.out.println(Math.pow(x, 2));
        cuadrado.accept(3.0);
    }

    public static void detallesProducto(){
        Consumer<Producto> detallesProducto = x-> System.out.println(x);
        detallesProducto.accept(new Producto());
    }

    public static void mensaje(){
        Consumer<String> mostrarMensaje = x-> JOptionPane.showMessageDialog(null, x);
        mostrarMensaje.accept("prueba");
    }

    public static void escribirRegistro(File ruta){
        Consumer<String> escribirRegistro = x ->{

            try {
                FileWriter escritor = new FileWriter(ruta);
                escritor.write(x);
                escritor.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        };
        escribirRegistro.accept("hola");
    }

    public static void numeroAleatorio(int min, int max){
        Supplier<Integer> aleatorio = ()-> new Random().nextInt((max - min)+1) +min;
        System.out.println(aleatorio.get());
    }

    public static void lista(){

        Supplier<ArrayList>miLista = () ->{
            ArrayList<Integer> lista = new ArrayList<>();
            lista.add(1);
            lista.add(2);
            return lista;

        };

        System.out.println(miLista.get());


    }

    public static void fechaHora(){

        Supplier<LocalDateTime> miHora = () -> {
          return LocalDateTime.now();
        };
        System.out.println(miHora.get());

    }

    public static void miCadenaVacia(){
        Supplier<String> cadenaVacia = ()->"";
        System.out.println("Mi cadena vacía: " + cadenaVacia.get());

    }


    


}
