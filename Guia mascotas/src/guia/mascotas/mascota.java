/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia.mascotas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.Global;

/**
 *
 * @author Rodrigo Velo
 */
public class mascota {


    
    private int codigo;
    private String nombre;
    private String raza;
    private Date fNacimiento;
    private Date fDefuncion;
    private int edad;
    
    public mascota()
    {
        codigo = 0;
        nombre = "";
        raza = "";
        fNacimiento = null;
        fDefuncion = null;
        edad = 0;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Date getfDefuncion() {
        return fDefuncion;
    }

    public void setfDefuncion(Date fDefuncion) {
        this.fDefuncion = fDefuncion;
    }
    
    public void registrar(int a) throws ParseException
    {
        int cod; //para que sea aunto incremental le voy pasando el valor de i del for donde estoy cargando el vector
        String nom;
        String raz;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fNac;
        
        do
        {
            raz = JOptionPane.showInputDialog("Ingrese la Raza de su mascota: (Perro - Gato - Conejo");
            if(raz.compareToIgnoreCase("perro")!=0 && raz.compareToIgnoreCase("gato")!=0 && raz.compareToIgnoreCase("conejo")!=0) JOptionPane.showMessageDialog(null, "Ingrese una Raza Valida!!");
            
        }while(raz.compareToIgnoreCase("perro")!=0 && raz.compareToIgnoreCase("gato")!=0 && raz.compareToIgnoreCase("conejo")!=0);
        
        
        nom = JOptionPane.showInputDialog("Ingrese el Nombre de su mascota: ");
        
        fNac = formato.parse(JOptionPane.showInputDialog("Ingrese la fecha de Nacimiento de su mascota: "));
        
        setCodigo(a);
        setNombre(nom);
        setRaza(raz);
        setfNacimiento(fNac);
        setEdad(edad());
        
        
        
    }
    
    public void reg_Defuncion() throws ParseException
    {
        Date fDef;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        fDef = formato.parse(JOptionPane.showInputDialog(null, "Ingrese la fecha de defuncion de su mascota: "));
        
        setfDefuncion(fDef);
    }
    
    public void mostrar()
    {
        String msj = "";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        msj = "\nCodigo: " + getCodigo() +
              "\nNombre: " + getNombre() +
              "\nRaza: " + getRaza() +
              "\nFecha de Nacimiento: " + formato.format(fNacimiento) +
              "\nEdad: " + getEdad();
                
        if(fDefuncion != null) msj+= "\nFecha de Defuncion: " + formato.format(fDefuncion);
        
        JOptionPane.showMessageDialog(null, msj);
    }
    
    public int edad()
    {
        int edad = 0;
        Date hoy = new Date();
        
        edad = hoy.getYear() - getfNacimiento().getYear();
        
        return edad;
    }
    
     
}
