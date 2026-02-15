package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 12 /*/*/*/");
        System.out.print("  >. Ingrese su nivel de ki:");
        int ki = teclado.nextInt();
        System.out.println("\n");
        NivelKi(ki);
    }

    public static void NivelKi(int ki) {
        if (ki < 0) {
            System.out.println("Valio cheetito el Goku");
        }else if(ki>=0 && ki<100){
            System.out.println("Goku dice: gracias por nadaaa");
        }else if(ki>=100 && ki<500){
            System.out.println("Goku dice: ya casi ganamos mi pana");
        }else if(ki>=500 && ki<1024){
            System.out.println("Goku dice: ya ganamos pana!");
        }else{
            System.out.println("Opcion incorrecta, goku te necesitaa");
        }
    }
}