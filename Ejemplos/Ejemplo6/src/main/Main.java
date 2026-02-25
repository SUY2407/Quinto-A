package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- PROGRAMA TABLA MULTIPLICAR ---");
        System.out.print(">. Ingrese su numero: ");
        int numero = teclado.nextInt();
//        UsoFor(numero);
//        UsoWhile(numero);
//        UsoDoWhile(numero);
        UsoWhileTrue(numero);
    }

    public static void UsoFor(int numero) {
        System.out.println("Tabla del numero "+numero);
        System.out.println("\n");
        // 5 X 1 = 5
        // 5 X 2 = 10
        for (int i = 1; i <= 10; i++) {
            int multi = numero * i;
            System.out.println(numero+" X "+ i+" = "+multi);
        }
    }
    
    public static void UsoWhile(int numero){
        System.out.println("Tabla del numero "+numero);
        int i = 1;
        while(i<=10){
            int multi = numero * i;
            System.out.println(numero+" X "+i+" = "+multi);
            i++;
        }
    }
    
    public static void UsoDoWhile(int numero){
        System.out.println("Tabla del numero "+numero);
        int i = 1;
        do{
            int multi = numero * i;
            System.out.println(numero+" X "+i+" = "+multi);
            i++;
        }while(i<=10);
    }
    
    public static void UsoWhileTrue(int numero){
        System.out.println("Tabla del numero "+numero);
        int i = 1;
        while(true){
            int multi = numero * i;
            System.out.println(numero+" X "+i+" = "+multi);
            if (i ==10){
                break;
            }
            i++;
        }
        
    }

}
