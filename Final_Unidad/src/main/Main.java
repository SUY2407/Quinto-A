package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);
    static String[][] Sala1 = new String[25][25];
    static String[][] Sala2 = new String[15][15];
    static String[] cliente = new String[50];
    static String[] dulceria = {"Comestible 01", "Comestible 02", "Comestible 03", "Comestible 04", "Comestible 05", "Comestible 06", "Comestible 07", "Comestible 08", "Comestible 09", "Comestible 10"};
    static double ganancia = 0;

    public static void main(String[] args) {
        LlenadoMatriz(Sala1);
        LlenadoMatriz(Sala2);
        Menu();
    }

    public static void Menu() {
        System.out.println("\n***** FINAL ****");
        System.out.println("1. Compra de Tickets ");
        System.out.println("2. Ver Salas");
        System.out.println("3. Ver Clientes");
        System.out.println("4. Dulceria");
        System.out.println("5. Ganancias");
        System.out.println("6. Salir");
        System.out.print("  >. Ingrese su opcion: ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                ComprarTicket();
                Menu();
                break;
            case 2:
                MostrarSala(Sala1, "Pelicula Cars");
                System.out.println(" ");
                MostrarSala(Sala2, "Pelicula Toy Story");
                System.out.println(" ");
                Menu();
                break;
            case 3:
                MostrarCliente(cliente);
                Menu();
                break;
            case 4:
                Dulceria(dulceria);
                Menu();
                break;
            case 5:
                Ganancia();
                Menu();
                break;
            case 6:
                Salir();
                break;
            default:
                System.out.println(" La opcion no existe");
                Menu();
                break;
        }
    }

    public static void ComprarTicket() {
        System.out.println("\n*** Compra de Tickets ***");
        System.out.print(" >. Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.print(" >. Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.println("\nPELICULAS DISPONIBLES");
        System.out.println("1. Cars ");
        System.out.println("2. Toy Story");
        System.out.print(" >. Ingrese la opcion de pelicula: ");
        int pelicula = teclado.nextInt();
        if (pelicula == 1) {
            System.out.print(" >. Ingrese cuantos boletos quiere comprar: ");
            int tickets = teclado.nextInt();
            if (tickets > 0 && tickets <= 10) {
                int cantidad = 0;
                MostrarSala(Sala1, "Pelicula Cars");
                System.out.println(" ");
                for (int i = 0; i < tickets; i++) {
                    System.out.print("  >. Ingrese fila: ");
                    int fila = teclado.nextInt();
                    System.out.print("  >. Ingrese columna: ");
                    int columna = teclado.nextInt();
                    if (fila >= 0 && fila < Sala1.length && columna >= 0 && columna < Sala1[0].length) {
                        if (Sala1[fila][columna].equals("X")) {
                            System.out.println("Posicion Llena");
                        } else {
                            Sala1[fila][columna] = "X";
                            cantidad++;
                        }
                    } else {
                        System.out.println("Los parametros no cumplen");
                    }
                }
                MostrarSala(Sala1, "Pelicula Cars");
                System.out.println(" ");
                if (cantidad != 0) {
                    System.out.println("La cantidad de boletos comprados: " + cantidad);
                    if (edad <= 50) {
                        System.out.println("El precio del boleto es: " + 32);
                        System.out.println("Cantidad a pagar: " + (32 * cantidad));
                        ganancia += (32 * cantidad);
                    } else {
                        double descuento = 32 * 0.30;
                        double pago = 32 - descuento;
                        System.out.println("Descuento Aplicado");
                        System.out.println("El precio del boleto es: " + pago);
                        System.out.println("Cantidad a pagar: " + (pago * cantidad));
                        ganancia += (pago * cantidad);
                    }
                    for (int i = 0; i < cliente.length; i++) {
                        if (cliente[i] == null) {
                            cliente[i] = nombre;
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Error supera la cantidad de boletos");
                ComprarTicket();
            }
        } else if (pelicula == 2) {
            System.out.print(" >. Ingrese cuantos boletos quiere comprar: ");
            int tickets = teclado.nextInt();
            if (tickets > 0 && tickets <= 10) {
                int cantidad = 0;
                MostrarSala(Sala2, "Pelicula Toy Story");
                System.out.println(" ");
                for (int i = 0; i < tickets; i++) {
                    System.out.print("  >. Ingrese fila: ");
                    int fila = teclado.nextInt();
                    System.out.print("  >. Ingrese columna: ");
                    int columna = teclado.nextInt();
                    if (fila >= 0 && fila < Sala2.length && columna >= 0 && columna < Sala2[0].length) {
                        if (Sala2[fila][columna].equals("X")) {
                            System.out.println("Posicion Llena");
                        } else {
                            Sala2[fila][columna] = "X";
                            cantidad++;
                        }
                    } else {
                        System.out.println("Los parametros no cumplen");
                    }
                }
                MostrarSala(Sala2, "Pelicula Toy Story");
                System.out.println(" ");
                if (cantidad != 0) {
                    System.out.println("La cantidad de boletos comprados: " + cantidad);
                    if (edad <= 50) {
                        System.out.println("El precio del boleto es: " + 32);
                        System.out.println("Cantidad a pagar: " + (32 * cantidad));
                        ganancia += (32 * cantidad);
                    } else {
                        double descuento = 32 * 0.30;
                        double pago = 32 - descuento;
                        System.out.println("Descuento Aplicado");
                        System.out.println("El precio del boleto es: " + pago);
                        System.out.println("Cantidad a pagar: " + (pago * cantidad));
                        ganancia += (pago * cantidad);
                    }
                    for (int i = 0; i < cliente.length; i++) {
                        if (cliente[i] == null) {
                            cliente[i] = nombre;
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Error supera la cantidad de boletos");
                ComprarTicket();
            }
        } else {
            System.out.println("Error no existe opcion de pelicula.");
            ComprarTicket();
        }
    }

    public static void LlenadoMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = "O";
            }
        }
    }

    public static void MostrarSala(String[][] matriz, String titulo) {
        System.out.println("\n*** Sala de" + titulo + " ***");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void MostrarCliente(String[] vector) {
        System.out.println("\n*** Listado de Clientes ***");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                System.out.println(i + " " + vector[i]);
            }
        }
    }

    public static void Dulceria(String[] vector) {
        System.out.println("\n*** Dulceria ***");
        for (int i = 0; i < vector.length; i++) {
            System.out.println((i + 1) + " " + vector[i] + "  -  " + ((i + 1) * 10));
        }
        System.out.print(" >. Ingrese el numero de su comestible: ");
        int comestible = teclado.nextInt();
        ganancia += (comestible * 10);
        System.out.println(" Compro " + vector[comestible - 1] + " gasto: " + (comestible * 10));
    }

    public static void Ganancia() {
        double empleado = ganancia - (ganancia * 0.15);
        double varios = ganancia - (ganancia * 0.25);
        double monto = ganancia - empleado - varios;
        System.out.println("Monto de ganancia: " + ganancia);
        System.out.println("Monto de pago empleado: " + empleado);
        System.out.println("Monto de gasto varios: " + varios);
        System.out.println("Monto de ganancia bruta: " + monto);
    }

    public static void Salir() {
        System.out.println("Hasta pronto!");
        System.out.println(":)");
        System.exit(0);
    }

}
