package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 13 /*/*/*/");
        System.out.print("  >. Ingrese la nota:");
        int nota = teclado.nextInt();
        System.out.println("\n");
        Proceso(nota);
    }
    
    public static void Proceso(int nota){
        if (nota >=0 && nota<61 ) {
            System.out.println("Chale mi rey, reprobaste!");
        }else if(nota>=61 && nota<=100){
            System.out.println("Aprobaste!");
        }else{
            System.out.println("Error mi pana");
        }
    }

}
