package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 5 /*/*/*/");
        System.out.print("  >. Ingrese las toneladas que recibio el chino:");
        int toneladas = teclado.nextInt();
        System.out.println("\n");
        Conversiones(toneladas);

    }

    public static void Conversiones(int toneladas) {
        double libras = toneladas *  2204.62;
        double arrobas = libras / 25;
        double onzas = libras * 16;
        System.out.println("Cantidad de libras : "+libras);
        System.out.println("Cantidad de arrobas : "+arrobas);
        System.out.println("Cantidad de onzas : "+ onzas);
    }

}
