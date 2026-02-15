package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 4 /*/*/*/");
        System.out.print("  >. Ingrese la velocidad en KM/H:");
        int velocidad = teclado.nextInt();
        System.out.println("\n");
        Reporte(velocidad);
    }

    public static void Reporte(int velocidad) {
        int ms = (velocidad * 1000) / 3600;
        System.out.println("Reporte del vehiculo");
        System.out.println(">. Velocidad en m/s: " + ms);
    }

}
