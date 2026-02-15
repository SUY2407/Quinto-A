package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 7 /*/*/*/");
        System.out.print("  >. Ingrese la cantidad de agua:");
        int litros = teclado.nextInt();
        System.out.println("\n");
        Tanque(litros);
    }

    public static void Tanque(int litros) {
        if (litros == 0) {
            System.out.println("El tanque estara vacio");
        } else if (litros > 0 && litros <= 30) {
            System.out.println("Tanque con nivel bajo");
        } else if (litros > 30 && litros < 60) {
            System.out.println("Tanque con nivel medio");
        } else if (litros >= 60 && litros <= 90) {
            System.out.println("Tanque con nivel alto");
        } else if (litros > 90) {
            System.out.println("Tanque rebalsado, el agua se esta desperdiciando");
        } else {
            System.out.println("Error en la cantidad de agua");
        }
    }
}
