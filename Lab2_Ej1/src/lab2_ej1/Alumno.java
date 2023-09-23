/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class Alumno {

    private int legajo;
    private int telefono;
    private int dni;
    private int año_nac;
    private int año_ingreso;
    private String nomyape;
    private String email;
    private String domicilio;
    private boolean egresado_secun;
    private boolean activo;
    
    public Alumno ()
        {
            legajo=0;
            telefono =0;
            dni = 0;
            año_nac = 0;
            año_ingreso = 0;
            nomyape="";
            email = "";
            domicilio="";
            egresado_secun=false;
            activo = true;
            
        }
    
    public Alumno (int legajo, int telefono, int dni, int año_nac, int año_ingreso, String nomyape, String email, String domicilio, boolean egresado)
        {
            this.legajo= legajo;
            this.telefono = telefono;
            this.dni = dni;
            this.año_nac = año_nac;
            this.año_ingreso = año_ingreso;
            this.nomyape = nomyape;
            this.email = email;
            this.domicilio=domicilio;
            egresado_secun=egresado;
            activo = true;
            
        }
        
    public int getLegajo() {
        return legajo;
    }
    
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAño_nac() {
        return año_nac;
    }

    public void setAño_nac(int año_nac) {
        this.año_nac = año_nac;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public String getNomyape() {
        return nomyape;
    }

    public void setNomyape(String nomyape) {
        this.nomyape = nomyape;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEgresado_secun() {
        return egresado_secun;
    }

    public void setEgresado_secun(boolean egresado_secun) {
        this.egresado_secun = egresado_secun;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void registrar_alumno () 
    {
        
        int egresado_se = 0;
        
        setLegajo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Legago: ")));
        setNomyape(JOptionPane.showInputDialog("Ingrese el Nombre y apellido: "));
        setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Telefono: ")));
        setEmail(JOptionPane.showInputDialog("Ingrese el Email: "));
        setDni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI: ")));
        setDomicilio(JOptionPane.showInputDialog("Ingrese el domicilio: "));
        setAño_ingreso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de ingreso: ")));
        egresado_se = JOptionPane.showConfirmDialog(null, "Ingrese si egreso del secundaro: ");
        
        if(egresado_se == 0) setEgresado_secun(true);
        else setEgresado_secun(false);
    }
    
    public void mostrar_alumno()
    {
        JOptionPane.showMessageDialog(null, "Legajo: "+getLegajo()+"\n Nombre y Apellido: "+getNomyape()+"\n Telefono: "+getTelefono()+"\n Email: "+getEmail()+"\n DNI: "+getDni()+"\n Domicilio: "+getDomicilio()+"\n Año en que ingreso: "+getAño_ingreso()+"\n Egresado del Secundario: "+isEgresado_secun());
    }
    
    public void eliminar()
        {
            setActivo(false);
        }


}
