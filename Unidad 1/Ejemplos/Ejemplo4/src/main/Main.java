package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejemplo 4");
        System.out.print(" Ingrese nombre: ");
        String nombre = teclado.next();
        System.out.print(" Ingrese edad: ");
        int edad = teclado.nextInt();
        System.out.println("\n");
//        MayoriaEdad1(edad);
//        MayoriaEdad2(edad);
//        MayoriaEdad3(edad);
        MayoriaEdad4(edad);

    }

    public static void MayoriaEdad1(int edad) {
        if (edad >= 18) {
            System.out.println("Mayor de Edad");
        }
    }

    public static void MayoriaEdad2(int edad) {
        if (edad >= 18) {
            System.out.println("Mayor de Edad");
        } else {
            System.out.println("Menor de Edad");
        }
    }

    public static void MayoriaEdad3(int edad) {
        if (edad >= 18 && edad < 60) {
            System.out.println("Mayor de Edad");
        } else if (edad >= 60) {
            System.out.println("Adulto Mayor");
        } else {
            System.out.println("Menor de Edad");
        }
    }

    public static void MayoriaEdad4(int edad) {
        if (edad >= 18 && edad < 60) {
            System.out.println("Mayor de Edad");
        } else if (edad >= 60) {
            System.out.println("Adulto Mayor");
        } else if (edad > 0 && edad < 18) {
            if (edad > 0 && edad <= 6) {
                System.out.println("Bebes");
            } else if (edad > 6 && edad <= 11) {
                System.out.println("Niños");
            } else {
                System.out.println("Adolecentes");
            }
        } else {
            System.out.println("Error en la edad ingresada");
        }
    }
}
