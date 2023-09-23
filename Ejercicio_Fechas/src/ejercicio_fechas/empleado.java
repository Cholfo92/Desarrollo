/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class empleado {


    private int legajo;
    private String apellido;
    private String nombre;
    private Date fIngreso;
    private float sueldo_basico;
    private String ciudad;
    private Date fEgreso;
    private Date fNacimiento;
    private String sexo;
    private boolean activo;
    
    public empleado()
    {
        legajo = 0;
        apellido = "";
        nombre = "";
        fIngreso = null;
        sueldo_basico = 0;
        ciudad = "";
        fEgreso = null;
        fNacimiento = null;
        sexo = "";
        activo = true;
              
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apelido) {
        this.apellido = apelido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
    }

    public float getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(float sueldo_basico) {
        this.sueldo_basico = sueldo_basico;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciuadad) {
        this.ciudad = ciuadad;
    }

    public Date getfEgreso() {
        return fEgreso;
    }

    public void setfEgreso(Date fEgreso) {
        this.fEgreso = fEgreso;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    public void registrar() throws ParseException
    {
        int leg;
        String ape, nom, ciud, sex;
        float sueldo;
        Date fIng, fNac;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        leg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Legajo del empleado: "));
        ape = JOptionPane.showInputDialog("Ingrese el Apellido del emepleado: ");
        nom = JOptionPane.showInputDialog("Ingrese el nombre del emepleado: ");
        ciud = JOptionPane.showInputDialog("Ingrese la ciudad del emepleado: ");
        sex = JOptionPane.showInputDialog("Ingrese el sexo del emepleado: ");
        sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo basico del emepleado: "));
        fIng = formato.parse(JOptionPane.showInputDialog("Ingrese la fecha de ingreso: "));
        fNac = formato.parse(JOptionPane.showInputDialog("Ingrese la fecha de Nacimiento del empleado: "));
        
        
        setLegajo(leg);
        setApellido(ape);
        setNombre(nom);
        setCiudad(ciud);
        setSexo(sex);
        setSueldo_basico(sueldo);
        setfNacimiento(fNac);
        setfIngreso(fIng);
        setfEgreso(null);
        setActivo(true);

    }
    
    
    public void mostrar()
    {
        String info = "";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        info = "\n Legajo: " + getLegajo() +
                "\n Apellido: " + getApellido() +
                "\n Nombre: " + getNombre()+
                "\n Ciudad: " + getCiudad()+
                "\n Sexo: " + getSexo()+
                "\n Sueldo Basico: " + getSueldo_basico()+
                "\n Fecha de Nacimiento: " + formato.format(getfNacimiento())+
                "\n Fecha de Ingreso: " + formato.format(getfIngreso());
                
        
        JOptionPane.showMessageDialog(null, info);
    }
    
    public void eliminar()
    {
        setActivo(false);
    }
    

    public int antiguedad()
    {
        int a = 0;
        Date hoy = new Date();
        
        a = hoy.getYear() - fIngreso.getYear();
        
        return a;
    }
    
    public int edad()
    {
        int edad = 0;
        Date hoy = new Date();
        
        edad = hoy.getYear() - fNacimiento.getYear();
        
        return edad;
    }

    
    
}
