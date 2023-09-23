/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class film {
    
    private String titulo;
    private int duracion;
    private String director;
    private String genero;
    private actor vecactor[]; 
    
    public film()
    {
        titulo = "";
        duracion = 0;
        director = "";
        genero = "";
        vecactor = null;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public actor getVecactor(int pos) {
        return vecactor[pos];
    }

    public void setVecactor(int pos, actor a) {
        vecactor[pos] = a;
    }
    
    public int cantActores()
    {
        return vecactor.length;
    }
    
    public void registrar() throws ParseException
    {
        int ca = 0;
        
        setTitulo(JOptionPane.showInputDialog("Ingrese el titulo de la pelicula: "));
        setDirector(JOptionPane.showInputDialog("Ingrese el director de la pelicula: "));
        setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos minutos dura la pelicula: ")));
        setGenero(JOptionPane.showInputDialog("Ingrese el genero de la pelicula: "));
        ca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de actores: "));
        vecactor = new actor[ca];
        
        actor aux = null;
        for(int i = 0; i<vecactor.length;i++)
        {
            aux = new actor();
            aux.registrar();
            vecactor[i] = aux;
        }

    }
    
    public void mostrar()
    {
        String msj = "";
        
        msj = "\nTitulo: " + getTitulo() +
              "\nDirector: " + getDirector() +
              "\nGenero: " + getGenero()+
              "\nDuracion: " + getDuracion();
        
        JOptionPane.showMessageDialog(null, msj);
        
        for(int i = 0; i<vecactor.length;i++)
        {
            vecactor[i].mostrar();
        }
    }


}
