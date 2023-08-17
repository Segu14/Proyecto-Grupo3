/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2cuat;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author yusme
 */
public class Fincas {
    static String nombreFinca;
    static String ubicacion;
    static String nombreEncargado;
    static String cedulaEncargado;
    static String telefonoEncargado;
    static String tipoGanado;
    static int cantidadPotreros;
    static double tamanoTotal;
    static int cantidadAnimales;
    static int codigoFinca;
    private int diaActual = 1;
    private Potreros[] potreros;    
    
    int s = 1;
    
     

    public Fincas() {
    }

    public Fincas(String nombreFinca, String ubicacion, String nombreEncargado, String cedulaEncargado,
                  String telefonoEncargado, String tipoGanado, int cantidadPotreros, double tamanoTotal,
                  int cantidadAnimales, int codigoFinca) {
        this.nombreFinca = nombreFinca;
        this.ubicacion = ubicacion;
        this.nombreEncargado = nombreEncargado;
        this.cedulaEncargado = cedulaEncargado;
        this.telefonoEncargado = telefonoEncargado;
        this.tipoGanado = tipoGanado;
        this.cantidadPotreros = cantidadPotreros;
        this.tamanoTotal = tamanoTotal;
        this.cantidadAnimales = cantidadAnimales;
        this.codigoFinca = codigoFinca;
        
        
        // Inicializar el arreglo de potreros
        potreros = new Potreros[cantidadPotreros];
        for (int i = 0; i < cantidadPotreros; i++) {
            potreros[i] = new Potreros();
        }
    }
    // Getters
    public String getNombreFinca() {
        return nombreFinca;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public String getCedulaEncargado() {
        return cedulaEncargado;
    }

    public String getTelefonoEncargado() {
        return telefonoEncargado;
    }

    public int getCantidadPotreros() {
        return cantidadPotreros;
    }

    public double getTamanoTotal() {
        return tamanoTotal;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public int getCodigoFinca() {
        return codigoFinca;
    }
    public String getTipoGanado() {
        return tipoGanado;
    }
    // Setters
    public void setNombreFinca(String nombreFinca) {
        this.nombreFinca = nombreFinca;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public void setCedulaEncargado(String cedulaEncargado) {
        this.cedulaEncargado = cedulaEncargado;
    }

    public void setTelefonoEncargado(String telefonoEncargado) {
        this.telefonoEncargado = telefonoEncargado;
    }

    public void setCantidadPotreros(int cantidadPotreros) {
        this.cantidadPotreros = cantidadPotreros;
    }

    public void setTamanoTotal(double tamanoTotal) {
        this.tamanoTotal = tamanoTotal;
    }

    public void setCantidadAnimales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
    }
    public void setCodigoFinca(int codigoFinca){
        this.codigoFinca = codigoFinca;
    }
    public void setTipoGanado(String tipoGanado) {
        this.tipoGanado = tipoGanado;
    }

    // Metodo para agregar informacion
    public  void agregarInformacionFinca() {
        
        codigoFinca       = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la finca:"));
        nombreFinca       = JOptionPane.showInputDialog("Ingrese el nombre de la finca:");
        ubicacion         = JOptionPane.showInputDialog("Ingrese la ubicación:");
        nombreEncargado   = JOptionPane.showInputDialog("Ingrese el nombre del encargado:");
        cedulaEncargado   = JOptionPane.showInputDialog("Ingrese la cédula del encargado:");
        telefonoEncargado = JOptionPane.showInputDialog("Ingrese el teléfono del encargado:");
        cantidadPotreros  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de potreros:"));
        tamanoTotal       = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño total de la finca en km²:"));
        cantidadAnimales  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad total de animales:"));
        tipoGanado        = JOptionPane.showInputDialog("Ingrese el tipo de ganado de la finca: [vacuno/bovino/ovino]");
        
        
        }

    // Metodo para mostrar informacion
    public void mostrarInformacionFinca() {
        
        System.out.println("Nombre de la finca: " + nombreFinca);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Nombre del encargado: " + nombreEncargado);
        System.out.println("Cédula del encargado: " + cedulaEncargado);
        System.out.println("Teléfono del encargado: " + telefonoEncargado);
        System.out.println("Cantidad de potreros: " + cantidadPotreros);
        System.out.println("Tamaño total de la finca: " + tamanoTotal);
        System.out.println("Cantidad total de animales: " + cantidadAnimales);
        System.out.println("Codigo de la finca: " + codigoFinca);
        System.out.println("Tipo de ganado de la finca  ganado vacuno o bovino y ganado ovino: " + tipoGanado);
        
        
    }
    // Método para eliminar información utilizando el código de la finca
    public void eliminarInformacionFinca(int codigo) {
        if (codigo == codigoFinca) {
            nombreFinca       = null;
            tipoGanado        = null;
            ubicacion         = null;
            nombreEncargado   = null;
            cedulaEncargado   = null;
            telefonoEncargado = null;
            cantidadPotreros  = 0;
            tamanoTotal       = 0;
            cantidadAnimales  = 0;
            JOptionPane.showMessageDialog(null, "Información de finca eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Código de finca no coincide. No se pudo eliminar.");
        }
    }

    // Método para consultar información utilizando el código de la finca
    public void consultarInformacionFinca(int codigo) {
        if (codigo == codigoFinca) {
            mostrarInformacionFinca();
        } else {
            JOptionPane.showMessageDialog(null, "Código de finca no coincide. No se pudo consultar.");
        }
    }

    // Método para modificar información utilizando el código de la finca
    public void modificarInformacionFinca(int codigo) {
        if (codigo == codigoFinca) {
            agregarInformacionFinca();
        } else {
            JOptionPane.showMessageDialog(null, "Código de finca no coincide. No se pudo modificar.");
        }
    }

    // Método para aumentar la cantidad de animales
    public void aumentarAnimales(int cantidad) {
        cantidadAnimales += cantidad;
    }

    // Método para disminuir la cantidad de animales
    public void disminuirAnimales(int cantidad) {
        cantidadAnimales -= cantidad;
    }
    public void rotarAnimales() {
        if (cantidadPotreros <= 0) {
            System.out.println("No hay potreros para rotar.");
            return;
        }
        
        if (cantidadAnimales == 0) {
            System.out.println("No hay animales para rotar.");
            return;
        }
        
        int animalesPorPotrero = cantidadAnimales / cantidadPotreros;
        int animalesRestantes = cantidadAnimales % cantidadPotreros;
        
        for (int i = 0; i < cantidadPotreros; i++) {
            if (i < animalesRestantes) {
                System.out.println("Potrero " + (i + 1) + ": " + (animalesPorPotrero + 1) + " animales");
            } else {
                System.out.println("Potrero " + (i + 1) + ": " + animalesPorPotrero + " animales");
            }
        }
    }

   /* public void avanzarDia() {
        diaActual++;
        System.out.println("Día " + diaActual);
        rotarAnimales(); 
        gestionarPotreros(); 
    } */
/*
    private void gestionarPotreros() {
    for (int i = 0; i < cantidadPotreros; i++) {
        Potreros potrero = potreros[i];

        if (potrero.getEstado() == 2 && (diaActual - potrero.getDiaInicioUso()) >= 5) {
            System.out.println("Es necesario trasladar el ganado del Potrero " + potrero.getCodigoPotrero());
            // Realizar el traslado del ganado a otro potrero aquí
            int cantidadAnimales = potrero.getCantidadAnimales();
            trasladarGanado(potrero.getCodigoPotrero(), obtenerPotreroDestino(), cantidadAnimales);

            potrero.setEstado(0);  // Cambiar el estado del potrero a descanso
            potrero.setDiaInicioDescanso(diaActual);
        }

        if (potrero.getEstado() == 0 && (diaActual - potrero.getDiaInicioDescanso()) >= 10) {
            System.out.println("El Potrero " + potrero.getCodigoPotrero() + " está listo para ser utilizado nuevamente.");
            potrero.setEstado(1); // Cambiar el estado del potrero a libre
        }
    }
}
*//*
        // Método para obtener el código de un potrero disponible
    private int obtenerPotreroDestino() {
    for (int i = 0; i < cantidadPotreros; i++) {
        if (potreros[i].getEstado() == 1 && potreros[i].tieneEspacioSuficiente(cantidadAnimales)) {
            return potreros[i].getCodigoPotrero();
        }
    }
    return -1; // Retorna -1 si no se encontró un potrero disponible
}
        // Método de traslado de ganado (ya implementado previamente)
    private void trasladarGanado(int codigoOrigen, int codigoDestino, int cantidadAnimales) {
    
    }

*/
}
    
    

    


