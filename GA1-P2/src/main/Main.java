package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 2 /*/*/*/");
        System.out.print("  >. Ingrese su nombre:");
        String nombre = teclado.next();
        System.out.print("  >. Ingrese su apellido:");
        String apellido = teclado.next();
        System.out.println("\n");
        Saludo(nombre, apellido);
        
    }
    
    public static void Saludo(String nombre, String apellido){
        System.out.println("Hola bombonazo, tu nombre es: "+nombre+" "+apellido);
    }
}
