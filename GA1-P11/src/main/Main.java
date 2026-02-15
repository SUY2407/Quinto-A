package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/ PROGRAMA 11 /*/*/*/");
        System.out.println("Elige tu pokemon:");
        System.out.println("1. Tipo Fuego");
        System.out.println("2. Tipo Agua");
        System.out.println("3. Tipo Electrico");
        System.out.println("4. Tipo Planta");
        System.out.println("5. Tipo Dragon");
        System.out.print("  >. Ingrese su opcion:");
        int opcion = teclado.nextInt();
        System.out.println("\n");
        Pokemon(opcion);
    }

    public static void Pokemon(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Tu Pokémon es Charmander");
                break;
            case 2:
                System.out.println("Tu Pokémon es Squirtle");
                break;
            case 3:
                System.out.println("Tu Pokémon es Pikachu");
                break;
            case 4:
                System.out.println("Tu Pokémon es Bulbasaur");
                break;
            case 5:
                System.out.println("Tu Pokémon es Dragonite");
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }
    }
}
