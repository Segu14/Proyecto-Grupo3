/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2cuat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Tabla_Finca extends JFrame {
    static JTable tabla;
    static DefaultTableModel almacen;   
    
    static int sum_fincas = 3;
    
    
    public void Tabla_Finca() {
 
        setLayout(null);
        
        Fincas fincas = new Fincas(); // Traemos la clase Fincas para usar los datos de la misma
        Empresa empresa = new Empresa();
        Pre_Fincas pre_Fincas = new Pre_Fincas();
        
        JFrame add_finca = new JFrame("Agregar Finca");
        add_finca.setBounds(0, 0, 1800, 900);
        add_finca.setLayout(null);

        // En cada fila, estos son los nombres que saldrán arriba.
        String clasificacion[] = {"Código", "Nombre", "Ubicación", "Dueño", "Cédula Dueño", "Num. Teléfono Dueño", "Cant. Potreros", "Tamaño Finca", "Cant. Animales", "Tipo Ganado"};
        almacen = new DefaultTableModel(clasificacion, 0);
        // Cantidad de filas que va a tener la fila al incio, cada vez que se agregue una finca nueva, se sumará una fila nueva.

        tabla = new JTable(almacen); // los datos de ´almacen´ los incorporamos en la tabla
        
        // configuración de la tabla (visibilidad, ubicación, etc.)
        JScrollPane sc_tabla = new JScrollPane(tabla);
        sc_tabla.setBounds(100, 100, 1180, 300);
        add_finca.setVisible(true);
        
        add_finca.add(sc_tabla); // agregamos la tabla a la ventana.
        
        JButton agregar = new JButton("Agregar Finca"); // Botón para agregar los datos.
        agregar.setBounds(600, 450, 150, 40);
        agregar.addActionListener((e) -> { fincas.agregarInformacionFinca();
        
        Object fila[] = {Fincas.codigoFinca, Fincas.nombreEncargado, Fincas.ubicacion, Fincas.nombreEncargado, Fincas.cedulaEncargado, Fincas.telefonoEncargado, Fincas.cantidadPotreros, Fincas.tamanoTotal, Fincas.cantidadAnimales, Fincas.tipoGanado, sum_fincas = sum_fincas + 1};
        almacen.addRow(fila); // Usa las variables de la clase Finca y almacena los valores en cada columna, y al final, agrega la fila. 
        }); 
        
        add_finca.add(agregar); // Agregamos el botón a la ventana.
        
        JButton regresar = new JButton("Regresar"); // Creamos botón para regresar al menú principal
        regresar.setBounds(625, 500, 100, 40);
        regresar.addActionListener((e) -> { add_finca.setVisible(false); empresa.Empresa();});
        //Se cierra la ventana de la tabla y se abre el menú principal
        
        add_finca.add(regresar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add_finca.setLocationRelativeTo(null);
        add_finca.setVisible(true);
        }
    
    public void Fincas_existentes()
    {
        setLayout(null);
        
        Fincas fincas = new Fincas(); // Proceso idéntico a la impresión de la tabla pasada
        Empresa empresa = new Empresa();
        Pre_Fincas pre_Fincas = new Pre_Fincas();
        
        JFrame exist_fincas = new JFrame("Fincas Existentes");
        exist_fincas.setBounds(0, 0, 1800, 900);
        exist_fincas.setLayout(null);

        // En cada fila, estos son los nombres que saldrán arriba.
        String clasificacion[] = {"Código", "Nombre", "Ubicación", "Dueño", "Cédula Dueño", "Num. Teléfono Dueño", "Cant. Potreros", "Tamaño Finca", "Cant. Animales", "Tipo Ganado"};
        almacen = new DefaultTableModel(clasificacion, 0);
        
        for (int i = 0; i < sum_fincas; i++) {
            Object fila[] = {
                Pre_Fincas.Codigo[i],
                Pre_Fincas.Nombre_Finca[i],
                Pre_Fincas.Ubicacion[i],
                Pre_Fincas.Duenho[i],
                Pre_Fincas.Cedula[i],
                Pre_Fincas.Telefono[i],
                Pre_Fincas.cant_Potreros[i],
                Pre_Fincas.Tamanho[i],
                Pre_Fincas.cant_Ganado[i],
                Pre_Fincas.tipo_Ganado[i]
            };
            almacen.addRow(fila);
        }
        
        tabla = new JTable(almacen);
        
        JScrollPane sc_tabla = new JScrollPane(tabla);
        sc_tabla.setBounds(100, 100, 1180, 300);
        exist_fincas.setVisible(true);
                
        exist_fincas.add(sc_tabla);
        
        JButton regresar = new JButton("Regresar"); // Creamos botón para regresar al menú principal
        regresar.setBounds( 625, 500, 100,40);
        regresar.addActionListener((e) -> { exist_fincas.setVisible(false); empresa.Empresa();});
        //Se cierra la ventana de la tabla y se abre el menú principal
        
        exist_fincas.add(regresar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        exist_fincas.setLocationRelativeTo(null);
        exist_fincas.setVisible(true);
        
    }
}



