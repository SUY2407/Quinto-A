package main;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        String [] emails = new String [5];
        String [] nombres = new String [6];
        Llenar(emails);
        Mostrar(emails);
        Actualizar2(emails);
        Mostrar(emails);
    }
    
    public static void Mostrar(String [] vector){
        System.out.println("\n/////  Mostrando vector  /////");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void Llenar(String [] vector){
        System.out.println("\n/////  Llenar vector  /////");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("  >. Ingrese el email ["+i+"] = ");
            String email = teclado.next();
            vector[i] = email;
        }
    }
    
    public static void Actualizar1(String[] vector){
        System.out.println("\n/////  Actualizar vector por valor /////");
        System.out.print("  >. Ingrese valor para actualizar: ");
        String actual = teclado.next();
        System.out.print("  >. Ingrese valor nuevo: ");
        String nuevo = teclado.next();
        for (int i = 0; i < vector.length; i++) {
            if (actual.equals(vector[i])) {
                //(actual.equals(vector[i])) = (actual == vector[i])
                vector[i] = nuevo;
                System.out.println("  El valor fue actualizado con exito.");
            }
        }
    }

    public static void Actualizar2(String[] vector){
        System.out.println("\n/////  Actualizar vector por indice /////");
        System.out.print("  >. Ingrese indice a actualizar: ");
        int indice = teclado.nextInt();
        System.out.print("  >. Ingrese valor nuevo: ");
        String nuevo = teclado.next();
        for (int i = 0; i < vector.length; i++) {
            if (indice == i) {
                vector[i] = nuevo;
                System.out.println("  El valor fue actualizado con exito.");
            }
        }
    }
}
