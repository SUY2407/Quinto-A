
package GUI;

import java.awt.Color;
import javax.swing.*;

public class Principal extends JFrame {
    // Componentes
    JPanel panelPrincipal;
    JPanel panelSecundario;
    JLabel etiqueta1;
    JTextField entrada1;
    JButton boton1;
    
    // Constructor
    public Principal(){
        this.setSize(600, 500);
        this.setTitle("Ejemplo Swing | Principal");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciarComponentes();
        this.IniciarEventos();
    }
    
    // Inicializador de Componentes
    public void IniciarComponentes(){
        this.Paneles();
        this.Entradas();
        this.Etiquetas();
        this.Botones();
    }
    
    // Inicializador de Eventos
    public void IniciarEventos(){
        
    }
    
    
    // La Logica de mi ventana
    
    public void Paneles(){
        //Todos los paneles que usaremos
        panelPrincipal= new JPanel();
        panelPrincipal.setBounds(0, 0, 600, 500);
        panelPrincipal.setBackground(Color.CYAN);
        panelPrincipal.setLayout(null);
        this.add(panelPrincipal);
        
        panelSecundario = new JPanel();
        panelSecundario.setBounds(100, 100, 200, 100);
        panelSecundario.setBackground(Color.red);
        panelPrincipal.add(panelSecundario);
    }
    
    public void Etiquetas(){
        etiqueta1 = new JLabel("HOLA BANDA TODOS SE ESTAN DURMIENDO");
        etiqueta1.setBounds(250, 320, 300, 20);
        etiqueta1.setForeground(Color.black);
        panelPrincipal.add(etiqueta1);
        //Todas las etiquetas que usaremos
    }
    
    public void Entradas(){
        // Todas las entradas que usaremos
    }
    
    public void Botones(){
        // Todos los botones que usaremos
    }
    
}
