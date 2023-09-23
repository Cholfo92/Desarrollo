/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author velor
 */
public class alumno {
    
    private int legajo;
    private String nom_Ape;
    private Date fInscipcion;
    private int nota1;
    private int nota2;
    private int asistencia;
    private String turno;
    private int curso;
    
    public alumno()
    {
        legajo = 0;
        nom_Ape = "";
        fInscipcion = null;
        nota1 = 0;
        nota2 = 0;
        asistencia = 0;
        turno = "";
        curso = 0;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNom_Ape() {
        return nom_Ape;
    }

    public void setNom_Ape(String nom_Ape) {
        this.nom_Ape = nom_Ape;
    }

    public Date getfInscipcion() {
        return fInscipcion;
    }

    public void setfInscipcion(Date fInscipcion) {
        this.fInscipcion = fInscipcion;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    public void registrar(int pos)
    {
        Date hoy = new Date();
        setLegajo((100+pos));
        setNom_Ape(JOptionPane.showInputDialog("Ingrese el nombre y el apellido del alumno N°: "+ (pos+1)));
        setfInscipcion(hoy);
        setNota1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primer nota del alumno N°: " + (pos+1))));
        setNota2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda nota del alumno N°: " + (pos+1))));
        setAsistencia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asistencias del alumno N°: "+(pos+1))));
        
        do
        {
            setTurno(JOptionPane.showInputDialog("Ingrese el turno del alumno N°: "+ (pos+1) + "(Mañana - Tarde - Noche"));
            if(getTurno().compareToIgnoreCase("mañana")!=0 && getTurno().compareToIgnoreCase("tarde")!=0 && getTurno().compareToIgnoreCase("noche")!=0)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un turno VALIDO!");
            }
        }while(getTurno().compareToIgnoreCase("mañana")!=0 && getTurno().compareToIgnoreCase("tarde")!=0 && getTurno().compareToIgnoreCase("noche")!=0);
        
        do
        {
            setCurso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Curso del alumno N°: "+(pos+1)+"(del 1 al 6)")));
            if(getCurso()<1 || getCurso()>6) JOptionPane.showMessageDialog(null,"Ingrese un Curso valido!");
            
        }while(getCurso()<1 || getCurso()>6);
        
        JOptionPane.showMessageDialog(null, "Alumno registado");
        
    }
    
    public void mostrar()
    {
        String msj = "";
        SimpleDateFormat formato = new SimpleDateFormat();
        
        msj = "\nLegajo: " + getLegajo() +
              "\nNombre y Apellido: " + getNom_Ape() +
              "\nFecha de inscirpcion: " + formato.format(fInscipcion) +
              "\nNota N° 1: " + getNota1()+
              "\nNota N° 2: " + getNota2()+
              "\nAsistencias: " + getAsistencia()+
              "\nTurno: " + getTurno() +
              "\nCurso: " + getCurso();
        
        JOptionPane.showMessageDialog(null, msj);
    }
    
}
