
package main;

public class Main {

    public static void main(String[] args) {
        Ejercicio1(5);
    }
    
    public static void Ejercicio1(int numero){
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma = suma + i;
        }
        System.out.println(suma);
    }
    
}
