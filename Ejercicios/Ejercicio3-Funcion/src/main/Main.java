package main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** PROGRAMA PROMEDIO FUNCION ***");
        System.out.print("  >. Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.print("  >. Ingrese la nota 1: ");
        int n1 = teclado.nextInt();
        System.out.print("  >. Ingrese la nota 2: ");
        int n2 = teclado.nextInt();
        System.out.print("  >. Ingrese la nota 3: ");
        int n3 = teclado.nextInt();
        System.out.print("  >. Ingrese la nota 4: ");
        int n4 = teclado.nextInt();
        System.out.println("\n");
        System.out.println("  El nombre del alumno es: "+nombre);
        System.out.println("  El  promedio obtenido es: " + calcularPromedio(n1,n2,n3,n4));
    }
    
    public static double calcularPromedio(int n1, int n2, int n3, int n4){
        double promedio = (n1+n2+n3+n4)/4;
        return promedio;
    }
}
