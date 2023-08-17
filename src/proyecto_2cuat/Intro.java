/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2cuat;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author sebas
 */
public class Intro extends JFrame
{
    private JLabel text; // Creamos nuestro texto para la ventana.
    private Font font;
    private Font new_font;
    
    private ImageIcon logo_img;
    private JLabel logo;
    
    private Image logo_peq; 
    
    private JButton login;
    
    public Intro()
    {
        setLayout(null); //Esto evita que el texto se imprima donde al programa le de la gana.

        text = new JLabel("FincApp"); // Aquí se crea el texto.
        
        text.setBounds(560,200,400,200); //Para acomodar el texto con coordenadas específicas
            
        font = text.getFont();
        new_font = new Font("Georgia",Font.BOLD, 50);
        text.setFont(new_font);
        
        // Logo();
        add(text); // Aqui se "crea" para poder ser usado en el programa.
        Login_boton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /*public void Logo()
    {
        setLayout(new FlowLayout());
        
        logo_img = new ImageIcon(getClass().getResource("cow.png"));
         
        logo = new JLabel(logo_img);
        logo.setBounds(300, 700, 100, 100);
        logo.setIcon(new ImageIcon(logo_img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        
        
        logo.setLayout(null);

        add(logo);
    }*/
    
    private void Login_boton ()
    {
        Empresa empresa = new Empresa(); // aquí pasamos la clase que habíamos creado para el menú de ´Empresa´.
        
        login = new JButton(); 

        login.setText("INGRESAR");
        login.setBounds(620, 350, 100, 40);
        login.addActionListener((e) -> {empresa.Empresa();}); // Cuando toque el boton, se va a abrir el menú.
        login.setVisible(true);
        add(login);
        
    }
    
}
