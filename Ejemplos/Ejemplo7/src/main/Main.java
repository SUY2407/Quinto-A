package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** PROGRAM BUCLES ***");
        System.out.print("  >. Ingrese un numero: ");
        int numero = teclado.nextInt();
//        bucleFor(numero);
//        bucleWhile(numero);
//        bucleDoWhile(numero);
        bucleWhileTrue(numero);
    }

    public static void bucleFor(int numero) {
        if (numero > 0) {
            for (int i = 0; i <= numero; i++) {
                System.out.println("Soy el numero " + i);
            }
        } else {
            System.out.println("Error con el numero");
        }
    }

    public static void bucleWhile(int numero) {
        int i = 0;
        while (i <= numero) {
            System.out.println("While el numero es: " + i);
            i++;
        }
    }

    public static void bucleDoWhile(int numero) {
        int i = 0;
        do {
            System.out.println("DoWhile el numero es: " + i);
            i++;
        } while (i <= numero);
    }

    public static void bucleWhileTrue(int numero) {
        int i = 0;
        while (true) {
            System.out.println("WhileTrue el numero es: " + i);
            i++;
            if (i > numero) {
                break;
            }
        }
    }
}
