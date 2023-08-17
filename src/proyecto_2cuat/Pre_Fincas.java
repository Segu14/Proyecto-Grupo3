/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2cuat;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Pre_Fincas 
{
    Tabla_Finca tabla_Finca = new Tabla_Finca();
    Fincas fincas = new Fincas();
    
    static String Codigo[] = {"0001","0002","0003"};
    static String Nombre_Finca[] = {"Finca El Manglar","Finca el Arenal","Finca Tres Arroyos"};
    static String Ubicacion[] = {"Alajuela", "Heredia", "San Carlos"};
    static String Duenho[] = {"Alberto Avendaño Arias", "Miguel Angel Suarez Aguilar", "David Gerardo Araya"};
    static String Cedula[] = {"4 0233 0701", "1 0623 0066", "1 0733 0674"};
    static String Telefono[] = {"9854-0991", "2742-9437", "1077-9381"};
    static int cant_Potreros[] = {4, 1, 5};
    static int Tamanho[] = {3, 2, 5};
    static int cant_Ganado[] = {70, 34, 12};
    static String tipo_Ganado[] = {"bovino", "ovino", "vacuno"};
    
    Object Finca[][] =  new Object[Tabla_Finca.sum_fincas][10];
    
    public void Pre_Fincas()
    {

        for (int i = 0; i < Tabla_Finca.sum_fincas; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                Finca[i][0] = Codigo[i];
                Finca[i][1] = Nombre_Finca[i];
                Finca[i][2] = Ubicacion[i];
                Finca[i][3] = Duenho[i];
                Finca[i][4] = Cedula[i];
                Finca[i][5] = Telefono[i];
                Finca[i][6] = cant_Potreros[i];
                Finca[i][7] = Tamanho[i];
                Finca[i][8] = cant_Ganado[i];
                Finca[i][9] = tipo_Ganado[i];
            }
        }
      
    }
    
    /*public void Nueva_Finca
    {
        Fincas fincas = new Fincas();
        
        
    }*/
    
}     
        