
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("*** PROGRAMA SALUDO ***");
        System.out.print("  >. Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.print("  >. Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.println("\n Hola "+nombre+" Tienes "+edad+" anios, Bienvenido");
    }
    
}
