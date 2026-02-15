package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 3 /*/*/*/");
        System.out.print("  >. Ingrese numero 1:");
        int num1 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 2:");
        int num2 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 3:");
        int num3 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 4:");
        int num4 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 5:");
        int num5 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 6:");
        int num6 = teclado.nextInt();
        System.out.println("\n");
        SumaResta(num1,num2);
        MultiDivision(num3,num4);
        Modulo(num5,num6);
               
    }
    
    public static void SumaResta(int num1, int num2){
        System.out.println("La suma es: "+(num1+num2));
        System.out.println("La resta es: "+(num1-num2));
    }
    
    public static void MultiDivision(int num3, int num4){
        System.out.println("La multiplicacion es: "+(num3*num4));
        System.out.println("La division es: "+(num3/num4));
    }
    
    public static void Modulo(int num5, int num6){
        System.out.println("El modulo es: "+(num5%num6));
    }
}
