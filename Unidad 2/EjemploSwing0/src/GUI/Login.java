
package GUI;

import java.awt.Color;
import javax.swing.*;

public class Login extends JFrame {
    // Componentes Globales
    JPanel principal;
    JPanel secundario;
    JLabel etiqueta1;
    JTextField texto1;
    JButton boton1;
    
    // Constructor de la clase
    public Login(){
        this.setSize(500,500);
        this.setTitle("Ejemplo 0 | Quinto A");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.InicializadorComponentes();
        this.InicializadorEventos();
    }
    
    // Inicializador de Componentes
    public void InicializadorComponentes(){
        this.Paneles();
        this.Etiquetas();
        this.Entradas();
        this.Botones();
    }
    
    // Inicializador de Eventos
    public void InicializadorEventos(){
        
    }
    
    // Logica de la estructura
    public void Paneles(){
        principal = new JPanel();
        principal.setBounds(0, 0, 500, 500);
        principal.setBackground(Color.red);
        principal.setLayout(null);
        this.add(principal);
        
        secundario = new JPanel();
        secundario.setBounds(10, 10, 100, 100);
        secundario.setBackground(Color.CYAN);
        principal.add(secundario);
        
    }
    
    public void Etiquetas(){
        // JLabel
        etiqueta1 = new JLabel("Hola Mundo!");
        etiqueta1.setBounds(200, 200, 200, 30);
        etiqueta1.setForeground(Color.white);
        principal.add(etiqueta1);
    }
    
    public void Entradas(){
        // JTextField
        // JPasswordField
        // JTextArea
        texto1 = new JTextField();
        texto1.setBounds(200, 250, 200, 40);
        principal.add(texto1);        
    }
    
    public void Botones(){
        boton1 = new JButton("Obligame perro");
        boton1.setBounds(200,350, 200, 40);
        boton1.setForeground(Color.white);
        boton1.setBackground(Color.BLUE);
        principal.add(boton1);
    }
    
}
