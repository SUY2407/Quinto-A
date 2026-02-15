package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 9 /*/*/*/");
        System.out.print("  >. Ingrese la distancia en km/h:");
        int distancia = teclado.nextInt();
        System.out.print("  >. Ingrese el tiempo en H:");
        int tiempo = teclado.nextInt();
        System.out.println("\n");
       MRU(distancia, tiempo);
    }
    
    public static void MRU(int distancia, int tiempo){
        double velocidad = (distancia / tiempo)*(1000/3600);
        System.out.println("La velocidad es: "+velocidad);
    }
}
