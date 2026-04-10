
package main;

public class Perro extends Animal {
    private  String raza;
    private String tamanio;
    
    public Perro(){
        super(); // ---> Animal();
        this.raza = "desconocida";
        this.tamanio = "desconocido";
    }
    
    public Perro (String raza, String tamanio, String color){
        super(color);
        this.raza = raza;
        this.tamanio = tamanio;
    }
    
    public Perro(String raza, String tamanio, String color, String sonido){
        super(color, sonido);
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public void Dormir(){
        System.out.println("Soy un perrito y estoy durmiendo");
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{"+"color="+super.getColor()+", sonido="+super.getSonido() + ", raza=" + raza + ", tamanio=" + tamanio + '}';
    }
   
}
