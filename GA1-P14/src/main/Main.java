package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 14 /*/*/*/");
        System.out.print("  >. Ingrese tu edad:");
        int edad = teclado.nextInt();
        System.out.println("\n");
        Edad(edad);
    }

    public static void Edad(int edad) {
        int anio = 2026 - edad;
        System.out.println("Naciste en el anio: " + anio);
    }
}
