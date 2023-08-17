/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2cuat;

import javax.swing.JOptionPane;

/**
 *
 * @author yusme
 */
public class Potreros {
    private int    codigoPotrero;
    private String nombrePotrero;
    private int    estado;  // Usaremos un entero para representar el estado: 0 (descanso), 1 (libre), 2 (ocupado), 3 (No utilizable)
    private String fechaEntrada;
    private String fechaSalida;
    private int    cantidadAnimales;
    private int    tieneAgua; // Usaremos un entero para representar el agua: 0 (No), 1 (Sí)
    private String tipoTerreno;
    private String fechaUltimaRotacion; // Fecha de la última rotación de ganado
    private int    diasEnDescanso;
    private int diaInicioUso;
    private int diaInicioDescanso;
    
    private static final int DESCANSO = 0;

    public Potreros() {
       
    }

    public Potreros(int codigoPotrero, String nombrePotrero, int estado, String fechaEntrada, String fechaSalida, int cantidadAnimales, int tieneAgua, String tipoTerreno) {
        this.codigoPotrero    = codigoPotrero;
        this.nombrePotrero    = nombrePotrero;
        this.estado           = estado;
        this.fechaEntrada     = fechaEntrada;
        this.fechaSalida      = fechaSalida;
        this.cantidadAnimales = cantidadAnimales;
        this.tieneAgua        = tieneAgua;
        this.tipoTerreno      = tipoTerreno;
    }

    public void mostrarInformacionPotrero() {
        System.out.println("Código: " + codigoPotrero);
        System.out.println("Nombre: " + nombrePotrero);
        System.out.println("Estado: " + getEstadoAsString());
        System.out.println("Fecha de entrada: " + fechaEntrada);
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("Cantidad de animales: " + cantidadAnimales);
        System.out.println("Posee agua para el ganado: " + getAguaAsString());
        System.out.println("Tipo de terreno: " + tipoTerreno);
    }
    
    private String getEstadoAsString() {
        switch (estado) {
            case 0:
                return "Descanso";
            case 1:
                return "Libre";
            case 2:
                return "Ocupado";
            case 3:
                return "No utilizable";
            default:
                return "Estado desconocido";
        }
    }
    
    private String getAguaAsString() {
        return tieneAgua == 0 ? "No" : "Sí";
    }

    // Getters y setters

    public int getDiaInicioUso() {
        return diaInicioUso;
    }

    public int getDiaInicioDescanso() {
        return diaInicioDescanso;
    }

    public void setDiaInicioDescanso(int dia) {
        diaInicioDescanso = dia;
    }

    public int getCodigoPotrero() {
        return codigoPotrero;
    }

    public void setCodigoPotrero(int codigoPotrero) {
        this.codigoPotrero = codigoPotrero;
    }

    public String getNombrePotrero() {
        return nombrePotrero;
    }

    public void setNombrePotrero(String nombrePotrero) {
        this.nombrePotrero = nombrePotrero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public void setCantidadAnimales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
    }

    public int getTieneAgua() {
        return tieneAgua;
    }

    public void setTieneAgua(int tieneAgua) {
        this.tieneAgua = tieneAgua;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    // Métodos para agregar, mostrar, eliminar y modificar información

    public void agregarInformacionPotrero() {
        codigoPotrero    = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del potrero:"));
        nombrePotrero    = JOptionPane.showInputDialog("Ingrese el nombre del potrero:");
        estado           = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado del potrero : 0 (descanso), 1 (libre), 2 (ocupado), 3 (No utilizable):"));
        fechaEntrada     = JOptionPane.showInputDialog("Ingrese la fecha de entrada:");
        fechaSalida      = JOptionPane.showInputDialog("Ingrese la fecha de salida:");
        cantidadAnimales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de animales:"));
        tieneAgua        = Integer.parseInt(JOptionPane.showInputDialog("¿Tiene agua para el ganado? (0 para No, 1 para Sí):"));
        tipoTerreno      = JOptionPane.showInputDialog("Ingrese el tipo de terreno:");
    }

    public void eliminarInformacionPotrero(int codigo) {
        if (codigo == codigoPotrero) {
            codigoPotrero    = 0;
            estado           = 0;
            cantidadAnimales = 0;
            tieneAgua        = 0;
            nombrePotrero    = null;
            fechaEntrada     = null;
            fechaSalida      = null;
            tipoTerreno      = null;
            JOptionPane.showMessageDialog(null, "Información eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Código de potrero no coincide. No se pudo eliminar.");
        }
    }

    public void consultarInformacionPotrero(int codigo) {
        if (codigo == codigoPotrero) {
            mostrarInformacionPotrero();
        } else {
            JOptionPane.showMessageDialog(null, "Código de potrero no coincide. No se pudo consultar.");
        }
    }

    public void modificarInformacionPotrero(int codigo) {
        if (codigo == codigoPotrero) {
            agregarInformacionPotrero();
        } else {
            JOptionPane.showMessageDialog(null, "Código de potrero no coincide. No se pudo modificar.");
        }
    }
    public void descansarPotrero() {
        if (estado == DESCANSO) {
            System.out.println("El potrero ya está en descanso.");
            return;
        }

        if (estado == 2) {
            System.out.println("El potrero está ocupado. No se puede poner en descanso.");
            return;
        }

        System.out.println("Poniendo el potrero en descanso...");
        estado = DESCANSO;
    }

    public void liberarPotrero() {
        if (estado != DESCANSO) {
            System.out.println("El potrero no está en descanso. No se puede liberar.");
            return;
        }

        System.out.println("Liberando el potrero...");
        estado = 1; // Cambiar a estado libre
    }
    
}
