package main;

public class Cliente extends Persona {

    private int nit;
    private String direccion;

    public Cliente() {
        super();
        this.nit = 0;
        this.direccion = "desconicida";
    }

    public Cliente(int nit, String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.nit = nit;
        this.direccion = direccion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", nit=" + nit + ", direccion=" + direccion + '}';
    }

}
