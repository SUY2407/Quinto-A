package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        Scanner teclado = new Scanner(System.in);
        textoMenu();
        System.out.print(" >. Ingrese su opcion: ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                Opcion1();
                Menu();
                break;
            case 2:
                Opcion2();
                Menu();
                break;
            case 3:
                Opcion3();
                Menu();
                break;
            case 4:
                Opcion4();
                Menu();
                break;
            default:
                System.out.println("Su opcion es erronea");
                Menu();
                break;
        }

    }

    public static void textoMenu() {
        System.out.println("\nMENU");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 1");
        System.out.println("3. Opcion 1");
        System.out.println("4. Salir");
    }

    public static void Opcion1() {
        System.out.println("Hola guapo soy la opcion 1");
    }

    public static void Opcion2() {
        System.out.println("Hola guapo soy la opcion 2");
    }

    public static void Opcion3() {
        System.out.println("Hola guapo soy la opcion 3");
    }

    public static void Opcion4() {
        System.exit(0);
    }

}
