package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4]; // Matriz Cuadrada
        int[][] matriz2 = new int[2][3]; // Matriz Rectangular
        LlenarMatriz2(matriz1);
        MostrarMatriz(matriz1);
//        System.out.println(matriz2.length);
//        System.out.println(matriz2[0].length);
    }

    // SE LLENA LA MATRIZ CON UN VALOR PREDTERMINADO
    public static void LlenarMatriz1(int[][] matriz) {
        System.out.println("//// Llenado la matriz predeterminada ////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 5;
            }
        }
    }
    
    // SE LLENA SOLICITANDO DATOS AL USUARIO
    public static void LlenarMatriz2(int[][]matriz){
        System.out.println("//// Llenado la matriz con solicitud ////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("  >. Ingrese valor: ");
                int valor = teclado.nextInt();
                matriz[i][j] = valor;
            }
        }
    }
    
    // MOSTRAR LOS DATOS DE LA MATRIZ   
    public static void MostrarMatriz(int [][] matriz){
        System.out.println("\n//// Mostrando Matriz ////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println(" ");
        }
        
    }
    
   // ACTUALIZAR POR VALOR:
    public static void ActuarMatriz1(int [][] matriz){
        System.out.println("\n//// Actualizando matriz por valor ////");
        System.out.print("  >. Ingrese valor actual: ");
        int actual = teclado.nextInt();
        System.out.print("  >. Ingrese valor nuevo: ");
        int nuevo = teclado.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (actual == matriz[i][j]) {
                    matriz[i][j] = nuevo;
                    System.out.println("El valor se actualizo");
                }
            }
        }
    }
    
    // ACTUALIZAR POR INDICES
    public static void ActualizarMatriz2(int [][] matriz){
        System.out.println("\n//// Actualizando matriz por  indices ////");
        System.out.print("  >. Ingrese indice en filas: ");
        int indiceF = teclado.nextInt();
        System.out.print("  >. Ingrese indice en cols: ");
        int indiceC = teclado.nextInt();
        System.out.print("  >. Ingrese el valor nuevo: ");
        int nuevo = teclado.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (indiceF == i && indiceC == j) {
                    matriz[i][j] = nuevo;
                    System.out.println("El valor se actualizo");
                }
            }
        }
        
    }
   
    // ELIMINAR POR VALOR
    public static void EliminarMatriz1(int[][] matriz){
        System.out.println("\n//// Eliminando dato por valor ////");
        System.out.print("  >. Ingrese valor a eliminar: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (valor == matriz[i][j]) {
                    matriz[i][j] = 0;
                    System.out.println("se elimino correctamente");
                }
            }
        }
        
    }
    
    // ELIMINAR POR INDICES 
    public static void EliminarMatriz2(int [][] matriz){
        System.out.println("\n//// Eliminando valor por  indices ////");
        System.out.print("  >. Ingrese indice en filas: ");
        int indiceF = teclado.nextInt();
        System.out.print("  >. Ingrese indice en cols: ");
        int indiceC = teclado.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (indiceF == i && indiceC == j) {
                    matriz[i][j] = 0;
                    System.out.println("El valor se elimino correcta");
                }
            }
        }
        
    }
}
