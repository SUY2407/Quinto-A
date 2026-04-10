
package main;

public class Animal {
    private String color;
    private String sonido;
    
    public Animal(){
        this.color = "desconocido";
        this.sonido = "desconocido";
    }
    
    public Animal(String color){
        this.color = color;
        this.sonido = "desconocido";
    }
    
    public Animal(String color, String sonido){
        this.color = color;
        this.sonido = sonido;
    }
    
    public void Comer(){
        System.out.println("Soy un animal y estoy comiendo");
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Animal{" + "color=" + color + ", sonido=" + sonido + '}';
    }
    
    
    
}
