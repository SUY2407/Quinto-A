package main;

public class Gatito {
    
    // Atributos
    private String tamanio;
    private String color;
    private String tipo;
    
    //Constructores

    public Gatito() {
        this.color = "Gris";
        this.tamanio = "pequeño";
        this.tipo = "Cruza";
    }

    public Gatito(String tamanio, String color, String tipo) {
        this.tamanio = tamanio;
        this.color = color;
        this.tipo = tipo;
    }
    
    //Funciones y/o Metodos
    public void Maullar(){
        System.out.println("Miau Miau !");
    }
    
    //Metodos de Acceso

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //toString
    @Override
    public String toString() {
        return "Gatito{" + "tamanio=" + tamanio + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    

}
