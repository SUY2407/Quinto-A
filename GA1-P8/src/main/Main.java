package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 8 /*/*/*/");
        System.out.print("  >. Ingrese numero 1:");
        int n1 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 2:");
        int n2 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 3:");
        int n3 = teclado.nextInt();
        System.out.print("  >. Ingrese numero 4:");
        int n4 = teclado.nextInt();
        System.out.println("\n");
        Mensaje(n1,n2,n3,n4);
    }
    
    public static void Mensaje(int n1, int n2, int n3, int n4){
        if (n1>n2) {
            System.out.println("El primer numero es mayor!!");
            if (n3< n4) {
                System.out.println("Llegaste con la combinacion correcta");
            }
        }else{
            System.out.println("Hasta la vista baby");
        }
    }

}
