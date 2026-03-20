package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
       Menu();
    }
    
    public static void Menu(){
        System.out.println("\n**-**-**  EJERCICIOS PC2  **-**-**");
        System.out.println("1. Programa sumatoria");
        System.out.println("2. Tabla multiplicar");
        System.out.println("3. Numeros pares");
        System.out.println("4. Cuenta regresiva");
        System.out.println("5. Numeros enteros");
        System.out.println("6. Boveda");
        System.out.println("7. Numero negativo");
        System.out.println("8. Cantidad digitos");
        System.out.println("9. Impares");
        System.out.println("10. Resta ");
        System.out.println("11. Salir ");
        System.out.print("\n  >. Ingrese su opcion: ");
        int opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                p1();
                Menu();
                break;
            case 2:
                p2();
                Menu();
                break;
            case 3:
                Menu();
                break;
            case 4:
                Menu();
                break;
            case 5:
                Menu();
                break;
            case 6:
                Menu();
                break;
            case 7:
                Menu();
                break;
            case 8:
                Menu();
                break;
            case 9:
                Menu();
                break;
            case 10:
                Menu();
                break;
            case 11:
                System.exit(0);
                break;
            default: 
                System.out.println("Opcion no existente.");
                Menu();
                break;
        }
    }
    
    
    public static void p1 (){
        System.out.print("  >. Ingrese un numero: ");
        int numero = teclado.nextInt();
        int suma = 0;
        String respuesta = "";
        for (int i = 0; i <= numero; i++) {
            if (i< numero) {
                respuesta += i+" + ";
            }else{
                respuesta += i+" = ";
            }
            suma += i;
        }
        System.out.println(respuesta+suma);
    }
    
    public static void p2(){
        System.out.print("  >.Ingresa un numero: ");
        int numero = teclado.nextInt();
        for (int i = 1; i < 16; i++) {
            int mul = (numero * i);
            System.out.println(numero+" X "+i+" = "+mul);
        }
    }
}
