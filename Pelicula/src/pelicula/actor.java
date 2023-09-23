/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class actor {
    
    private String nombre;
    private Date fNacimiento;
    private String nacionalidad;
    
    public actor()
    {
        nombre = "";
        fNacimiento = null;
        nacionalidad = "";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public void registrar() throws ParseException
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        setNombre(JOptionPane.showInputDialog("Igrese el nombre del actor: "));
        setNacionalidad(JOptionPane.showInputDialog("Ingrese la Nacionalidad del actor: "));
        setfNacimiento(formato.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del actor: ")));
    }
    
    public void mostrar()
    {
        String msj = "";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        msj = "\nNombre: " + getNombre() +
              "\nNacionalidad: " + getNacionalidad() +
              "\nFecha de nacimiento: " + formato.format(getfNacimiento());
        
        JOptionPane.showMessageDialog(null, msj);
    }
    
    

    
}
