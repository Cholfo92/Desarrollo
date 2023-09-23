/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelicula;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class Pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        int n  = 0;
        int opc = 0;
        String msj = "";
        
        msj = "Elije una opcion: " +
        "\n1- Listar actores por nacionalidad" +
        "\n2- Listar  los datos de la pelicula que duren mas de 120 minutos" +
        "\n3- Listaro los datos de los actores que nacieron en el año 1990" +
        "\n4- ingresar un genero y listar las peliculas" +
        "\n5- buscar una pelicula por su nombre y modificar sus datos" +
        "\n6- buscar una pelicula por su nombre y eliminarla" +
        "\n7- Listar los datos de las peliculas que tengan menos de 10 actores" +
        "\n8- Salir";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de peliculas a registrar: "));
        
        film p[] = new film[n];
        
        film aux = null;
        
        
        for(int i = 0;i<p.length;i++)
        {
            aux = new film();
            aux.registrar();
            p[i] = aux;
        }
        
        for(int i = 0;i<p.length;i++)
        {
            p[i].mostrar();
        }
        
        /*
        1- Listar actores por nacionalidad
        2- Listar los datos de la pelicula que duren mas de 120 minutos
        3- Listar los datos de los actores que nacieron en el año 1990
        4- ingresar un genero y listar las peliculas
        5- buscar una pelicula por su nombre y modificar sus datos
        6- buscar una pelicula por su nombre y eliminarla
        7- Listar los datos de las peliculas que tengan menos de 10 actores
        */
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(msj));
            
            switch(opc)
            {
                case 1:
                {
                    acotres_X_nac(p);
                }
                break;
                
                case 2:
                {
                    pelis_120m(p);
                }
                break;
                
                case 3:
                {
                    actores_1990(p);
                }
                break;
                
                case 4:
                {
                    listado_genero(p);
                }
                break;
                
                case 5:
                {
                    modificar(p, buscar_nombre(p));
                }
                break;
                
                case 6:
                {
                    eliminar(p, buscar_nombre(p));
                }
                break;
                
                case 7:
                {
                    dies_actores(p);
                }
                break;
                
                default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida!");
            }
             
            
        }while(opc!=8);
        
        
        
                
                
    }
    
    public static void acotres_X_nac(film p[]) // punto 1
    {
        String nac = "";
        
        nac = JOptionPane.showInputDialog("Ingrese una nacionalidad a buscar: ");
        
        
        for(int i = 0;i<p.length;i++)
        {
            for(int j = 0;j<p[i].cantActores();i++)
            {
                if(p[i].getVecactor(j).getNacionalidad().compareToIgnoreCase(nac)==0) p[i].getVecactor(j).mostrar();
            }
        }
    }
    
    public static void pelis_120m(film p[])
    {
        for(int i = 0; i<p.length;i++)
        {
            if(p[i].getDuracion()>120)
            {
                p[i].mostrar();
            }
    }
    
}
    
    public static void actores_1990(film p[])
    {
        for(int i = 0;i<p.length;i++)
        {
            for(int j = 0;j<p[i].cantActores();j++)
            {
                if(p[i].getVecactor(j).getfNacimiento().getYear() == 1990)
                {
                   p[i].getVecactor(j).mostrar();
                }
            }
        }
    }
    
    public static void listado_genero(film p[])
    {
        String msj = "";
        
        msj = JOptionPane.showInputDialog("Ingrese el genero que desea buscar: ");
        
        for(int i = 0;i<p.length;i++)
        {
            if(p[i].getGenero().compareToIgnoreCase(msj)==0) p[i].mostrar();
        }
    }
    
    public static int buscar_nombre(film p[])
    {
        String msj = "";
        int retorno = 0;
        
        msj = JOptionPane.showInputDialog("Ingrese el titulo de la pelicula que desea buscar: ");
        
        for(int i = 0; i<p.length;i++)
        {
            if(p[i].getTitulo().compareToIgnoreCase(msj)==0) retorno = i;
        }
        
        return retorno;
        
    }
    
    public static void modificar(film p[], int pos) throws ParseException
    {
        p[pos].registrar();
    }
    
    public static void eliminar(film p[], int pos)
    {
        film aux = new film();
        
        p[pos] = aux;
    }
    
    public static void dies_actores(film p[])
    {
        for(int i = 0; i<p.length;i++)
        {
            if(p[i].cantActores()>9) p[i].mostrar();
        }
    }
    
}