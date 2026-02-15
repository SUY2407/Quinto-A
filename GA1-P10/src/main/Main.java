package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 10 /*/*/*/");
        System.out.print("  >. Ingrese edad del usuario:");
        int edad = teclado.nextInt();
        System.out.println("\n");
        Edad(edad);
    }

    public static void Edad(int edad) {
        if (edad >= 0 && edad < 18) {
            System.out.println("Es menor de edad");
        } else if (edad >= 18 && edad <= 74) {
            System.out.println("Es mayor de edad");
        } else if (edad >= 75 && edad <= 95) {
            System.out.println("Es de la tercera edad");
        } else if (edad > 95) {
            System.out.println("Un minuto de silencio, ya colgo los tennis");
        } else {
            System.out.println("Error mi rey ingreso una edad erronea.");
        }
    }
}
