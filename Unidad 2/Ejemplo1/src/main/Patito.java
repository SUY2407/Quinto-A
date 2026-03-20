package main;

public class Patito {
    
    // Atributos
    private String tamanio;
    private String color;
    private String tipo;
    
    // Constructores
        // Vacio
    public Patito(){
        this.tamanio = "pequeño";
        this.color = "cafe";
        this.tipo = "desconocido";
    }
    
        // Parcial
    public Patito(String tamanio, String color){
        this.tamanio = tamanio;
        this.color = color;
        this.tipo = "desconocido";
    }
    
    public Patito(String color){
        this.tamanio = "pequeño";
        this.color = color;
        this.tipo = "desconocido";
    }
    
        // Completo
    public Patito(String tamanio, String color, String tipo){
        this.tamanio = tamanio;
        this.color = color;
        this.tipo = tipo;
    }
    
    
    // Funciones y/o Metodos
    public void Sonido(){
        System.out.println("Cuak Cuak!");
    }
    
    // Metodos de Acceso
    public String getTamanio(){
        return this.tamanio;
    }
    
    public void setTamanio(String tamanio){
        this.tamanio = tamanio;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    // toString
    @Override
    public String toString(){
        return "Patito{\n"
                + " Tamanio : "+this.tamanio+"\n"
                + " Color : "+this.color+"\n"
                + " Tipo : "+this.tipo+"\n"
                + "}";
        
    }
}
