/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2cuat;



import javax.swing.*;

/**
 *
 * @author sebas
 */
public class Formulario extends JFrame{
    

    public static void main(String[] args) 
    {
    Intro intro = new Intro();
        
        intro.setBounds(0, 0, 2000, 1000);
        intro.setVisible(true);
        intro.setLocationRelativeTo(null);
        
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tabla_Finca();
            }
        });*/
       
    }
    
}
