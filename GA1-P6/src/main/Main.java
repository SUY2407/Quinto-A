package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 6 /*/*/*/");
        System.out.print("  >. Ingrese el diametro:");
        int diametro = teclado.nextInt();
        System.out.print("  >. Ingrese la altura:");
        int altura = teclado.nextInt();
        System.out.println("\n");
        Cilindro(diametro, altura);

    }

    public static void Cilindro(int diametro, int altura) {
        final double pi = 3.1416;
        double radio = diametro / 2;
        double volumen = pi * (radio * radio) * altura;
        double area = pi * radio * radio;
        double perimetro = pi * radio * 2;

        System.out.println("El volumen del cilindro: " + volumen);
        System.out.println("El area del circulo: " + area);
        System.out.println("El perimetro del circulo: " + perimetro);
    }
}
