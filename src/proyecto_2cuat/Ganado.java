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
public class Ganado {
    private int codigoAnimal;
    private String nombreAnimal;
    private String fechaNacimiento;
    private double ultimoPesoRegistrado;
    private String sexo;
    private String raza;

    public Ganado() {

    }

    public Ganado(int codigoAnimal, String nombreAnimal, String fechaNacimiento,
                  double ultimoPesoRegistrado, String sexo, String raza) {
        this.codigoAnimal         = codigoAnimal;
        this.nombreAnimal         = nombreAnimal;
        this.fechaNacimiento      = fechaNacimiento;
        this.ultimoPesoRegistrado = ultimoPesoRegistrado;
        this.sexo                 = sexo;
        this.raza                 = raza;
    }

    // Getters
    public int getCodigoAnimal() {
        return codigoAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getUltimoPesoRegistrado() {
        return ultimoPesoRegistrado;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    // Setters
    public void setCodigoAnimal(int codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setUltimoPesoRegistrado(double ultimoPesoRegistrado) {
        this.ultimoPesoRegistrado = ultimoPesoRegistrado;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Metodo para agregar informacion
    public void agregarInformacionGanado() {
        codigoAnimal         = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del animal:"));
        nombreAnimal         = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        fechaNacimiento      = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento:");
        ultimoPesoRegistrado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el último peso registrado:"));
        sexo                 = JOptionPane.showInputDialog("Ingrese el sexo del animal:");
        raza                 = JOptionPane.showInputDialog("Ingrese la raza del animal  ganado vacuno o bovino y ganado ovino:");
    }

    // Metodo para mostrar informacion
    public void mostrarInformacionGanado() {
        System.out.println("Código del animal: " + codigoAnimal);
        System.out.println("Nombre del animal: " + nombreAnimal);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Último peso registrado: " + ultimoPesoRegistrado);
        System.out.println("Sexo del animal: " + sexo);
        System.out.println("Raza del animal  ganado vacuno o bovino y ganado ovino: " + raza);
    }

    // Metodo para eliminar informacion
    public void eliminarInformacionGanado(int codigo) {
        if (codigo == codigoAnimal) {
            codigoAnimal         = 0;
            nombreAnimal         = null;
            fechaNacimiento      = null;
            ultimoPesoRegistrado = 0;
            sexo                 = null;
            raza                 = null;
            JOptionPane.showMessageDialog(null, "Información del ganado eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Código del animal no coincide. No se pudo eliminar.");
        }
    }

    // Metodo para consultar informacion
    public void consultarInformacionGanado(int codigo) {
        if (codigo == codigoAnimal) {
            mostrarInformacionGanado();
        } else {
            JOptionPane.showMessageDialog(null, "Código del animal no coincide. No se pudo consultar.");
        }
    }

    // Metodo para modificar informacion
    public void modificarInformacionGanado(int codigo) {
        if (codigo == codigoAnimal) {
            agregarInformacionGanado();
        } else {
            JOptionPane.showMessageDialog(null, "Código del animal no coincide. No se pudo modificar.");
        }
    }
}
    

