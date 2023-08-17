/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2cuat;

import javax.swing.JOptionPane;

/**
 *
 * @author yusme
 */
public class Empresa {
    
    private static Tabla_Finca tabla_Finca;
    
    public static void Empresa() {
        // TODO code application logic here
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú Principal:\n" +
                "1. Gestionar Fincas\n" +
                "2. Gestionar Potreros\n" +
                "3. Gestionar Ganado\n" +
                "0. Salir"
            ));

            switch (opcion) {
                case 1:
                    gestionarFincas();
                    opcion = 0;
                    break;
                case 2:
                    gestionarPotreros();
                    break;
                case 3:
                    gestionarGanado();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void gestionarFincas() {
        Fincas finca = new Fincas();
        
        int opcion;
        do { 
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú de Gestión de Fincas:\n" +
                "1. Agregar Información\n" +
                "2. Mostrar Información\n" +
                "3. Eliminar Información\n" +
                "4. Consultar Información\n" +
                "5. Modificar Información\n" +
                "6. Aumentar Cantidad de Animales\n" +
                "7. Disminuir Cantidad de Animales\n" +
                "8. Rotar Animales\n" +
                "0. Volver"
            ));
            
        
        
        int codigo;
        switch (opcion) {
            case 1 -> {
                if (tabla_Finca == null)
                {
                    tabla_Finca = new Tabla_Finca();
                }
                tabla_Finca.Tabla_Finca();
                opcion = 0;
                }
            case 2 -> {
                if (tabla_Finca == null)
                {
                    tabla_Finca = new Tabla_Finca();
                }
                tabla_Finca.Fincas_existentes();
                opcion = 0;
                }
            case 3 -> {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la finca a eliminar:"));
                finca.eliminarInformacionFinca(codigo);
                }
            case 4 -> {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la finca a consultar:"));
                finca.consultarInformacionFinca(codigo);
                }
            case 5 -> {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la finca a modificar:"));
                finca.modificarInformacionFinca(codigo);
                }
            case 6 -> {
                int cantidadAumentar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a aumentar:"));
                finca.aumentarAnimales(cantidadAumentar);
                }
            case 7 -> {
                int cantidadDisminuir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a disminuir:"));
                finca.disminuirAnimales(cantidadDisminuir);
                }
            case 8 -> finca.rotarAnimales();
            case 0 -> JOptionPane.showMessageDialog(null, "Volviendo al menú principal de gestión...");
            default -> JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
        }
    } while (opcion != 0);
}

    public static void gestionarPotreros() {
        Potreros potrero = new Potreros();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú de Gestión de Potreros:\n" +
                "1. Agregar Información\n" +
                "2. Mostrar Información\n" +
                "3. Eliminar Información\n" +
                "4. Consultar Información\n" +
                "5. Modificar Información\n" +
                "0. Volver"
            ));

            int codigo;
            switch (opcion) {
                case 1:
                    potrero.agregarInformacionPotrero();
                    break;
                case 2:
                    potrero.mostrarInformacionPotrero();
                    break;
                case 3:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del potrero a eliminar:"));
                    potrero.eliminarInformacionPotrero(codigo);
                    break;
                case 4:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del potrero a consultar:"));
                    potrero.consultarInformacionPotrero(codigo);
                    break;
                case 5:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del potrero a modificar:"));
                    potrero.modificarInformacionPotrero(codigo);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Volviendo al menú principal de gestión...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void gestionarGanado() {
        Ganado ganado = new Ganado();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú de Gestión de Ganado:\n" +
                "1. Agregar Información\n" +
                "2. Mostrar Información\n" +
                "3. Eliminar Información\n" +
                "4. Consultar Información\n" +
                "5. Modificar Información\n" +
                "0. Volver"
            ));

            int codigo;
            switch (opcion) {
                case 1:
                    ganado.agregarInformacionGanado();
                    break;
                case 2:
                    ganado.mostrarInformacionGanado();
                    break;
                case 3:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del animal a eliminar:"));
                    ganado.eliminarInformacionGanado(codigo);
                    break;
                case 4:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del animal a consultar:"));
                    ganado.consultarInformacionGanado(codigo);
                    break;
                case 5:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del animal a modificar:"));
                    ganado.modificarInformacionGanado(codigo);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Volviendo al menú principal de gestión...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}
  
    
