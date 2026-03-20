package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vector1 = new int[10];
//        LlenarVector(vector1);
        MostrarVector(vector1);
//        ActualizandoVector1(vector1);
//        ActualizandoVector2(vector1);
//        BuscandoVector1(vector1);
//        BuscandoVector2(vector1);
    }

    public static void LlenarVector(int[] vector1) {
        System.out.println("\n/*/*/* LLENANDO VECTOR */*/*/");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Ingresa tu numero Vector[" + i + "]: ");
            int valor = teclado.nextInt();
            vector1[i] = valor;
        }
    }

    public static void MostrarVector(int[] vector1) {
        System.out.println("\n/*/*/* MOSTRANDO VECTOR */*/*/");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("vector [" + i + "] = " + vector1[i]);
        }
    }

    public static void BuscandoVector1(int[] vector1) {
        System.out.println("\n/*/*/* BUSCANDO EN VECTOR */*/*/");
        System.out.println("Busqueda por valor");
        System.out.print("  >. Ingrese el valor a buscar: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < vector1.length; i++) {
            if (valor == vector1[i]) {
                System.out.println("Valor encontrado!!");
                System.out.println("En la posicion " + i);
                break;
            } else {
                System.out.println("Valor no encontrado");
            }
        }
    }

    public static void BuscandoVector2(int[] vector1) {
        System.out.println("\n/*/*/* BUSCANDO EN VECTOR */*/*/");
        System.out.println("Busqueda por indice");
        System.out.print("  >. Ingrese el indice a buscar: ");
        int indice = teclado.nextInt();
        for (int i = 0; i < vector1.length; i++) {
            if (indice == i) {
                System.out.println("Indice encontrado!!");
                System.out.println("El valor en el indice " + i + " es igual a: " + vector1[i]);
            }
        }

    }

    public static void ActualizandoVector1(int[] vector1) {
        System.out.println("\n/*/*/* ACTUALIZANDO EN VECTOR */*/*/");
        System.out.println("Actualizar por valor");
        System.out.print("  >. Ingrese valor a actualizar: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < vector1.length; i++) {
            if (valor == vector1[i]) {
                System.out.println("Valor encontrado!");
                System.out.print(" >.Ingrese valor nuevo: ");
                int nuevo = teclado.nextInt();
                vector1[i] = nuevo;
            }
        }
        MostrarVector(vector1);
    }

    public static void ActualizandoVector2(int[] vector1) {
        System.out.println("\n/*/*/* ACTUALIZANDO EN VECTOR */*/*/");
        System.out.println("Actualizar por indice");
        System.out.print("  >. Ingrese indice a actualizar: ");
        int indice = teclado.nextInt();
        for (int i = 0; i < vector1.length; i++) {
            if (indice == i) {
                System.out.println("Indice Encontrado!!");
                System.out.print("  >. Ingrese valor nuevo para el indice "+i+": ");
                int valor = teclado.nextInt();
                vector1[i] = valor;
            }
        }
        
        MostrarVector(vector1);

    }

    
}
