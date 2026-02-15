
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 1 /*/*/*/");
        System.out.print("  >. Ingrese numero 1:");
        int num1 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 2:");
        int num2 = teclado.nextInt();
        System.out.println("\n");
        Operaciones(num1, num2);
    }
    
    public static void Operaciones(int num1, int num2){
        System.out.println("La suma es: "+(num1+num2));
        System.out.println("La resta es: "+(num1-num2));
        System.out.println("La multiplicacion es: "+(num1*num2));
        System.out.println("La division es: "+(num1/num2));
        System.out.println("El modulo es: "+(num1%num2));
        
    }
    
}
