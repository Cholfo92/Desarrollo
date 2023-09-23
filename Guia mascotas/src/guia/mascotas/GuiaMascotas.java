/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.mascotas;

import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class GuiaMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        int n = 0;
        int opc = 0;
        String msj = "";
        
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas mascotas desea registrar: "));
        
        mascota vec[] = new mascota[n];
        
        mascota a = null;
        
        for (int i = 0;i<vec.length;i++)
        {
            a = new mascota();
            a.registrar(i+1);
            vec[i] = a;
        }
        
        do
        {
            msj = "\n\t*****Menu de Opciones*****" +
            "\n1- Registrar defunción de mascota" +
            "\n2- Buscar una mascota por su nombre y especie, y modificar sus datos" +
            "\n3- Buscar una mascota por su nombre y especie, y eliminar sus datos" +
            "\n4- Listar los datos del perro más longevo" + 
            "\n5- Listar la edad de todos los conejos" + 
            "\n6- Listar los datos de perros fallecidos en el mes actual" +
            "\n7- Emitir listado de gatos, ordenados por su fecha de nacimiento" +
            "\n8- Salir";
            
        
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, msj));

            switch(opc)
                    {
                        case 1:
                        {
                            reg_Def(vec, buscar(vec));
                        }
                        break;
                        
                        case 2:
                        {
                            modificar(vec, buscar(vec));
                        }
                        break;
                        
                        case 3:
                        {
                            eliminar(vec, buscar(vec));
                        }
                        break;
                        
                        case 4:
                        {
                            perro_longevo(vec);
                        }
                        break;
                        
                        case 5:
                        {
                            edad_comejos(vec);
                        }
                        break;
                        
                        case 6:
                        {
                            perros_fallecidos_mesActual(vec);
                        }
                        break;
                        
                        case 7:
                        {
                            gatos_ord_porFecha(vec);
                        }
                        break;
                        
                        default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida por favor!");
                        
                    }
            
        }while(opc!=8);
 
        JOptionPane.showMessageDialog(null, "Gracias por usar el sistema :)");
    }
    
    public static int buscar(mascota vec[])
    {
        int retorno = 0;
        String nom = "";
        String raz = "";
                
                
        nom = JOptionPane.showInputDialog("Ingrese el Nombre de la mascota a buscar: ");
        raz = JOptionPane.showInputDialog("Ingrese la Raza de la mascota a buscar: ");

        for (int i = 0; i<vec.length;i++)
        {
            if(vec[i].getNombre().compareToIgnoreCase(nom)==0 && vec[i].getRaza().compareToIgnoreCase(raz)==0 && vec[i].getfDefuncion() != null)
            {
                retorno = i;
            }
        }
        
        return retorno;
            
    }
    
    public static void reg_Def(mascota vec[], int pos) throws ParseException
    {
        vec[pos].reg_Defuncion();
    }
    
    public static void modificar(mascota vec[], int pos) throws ParseException
    {
        vec[pos].registrar(pos);
    }
    
    public static void eliminar(mascota vec[], int pos)
    {
        mascota eliminada = new mascota();
        vec[pos] = eliminada;
    }
    
    public static void perro_longevo(mascota vec[])
    {
        int mayor = 0;
        
        for(int i=0;i<vec.length-1;i++)
        {
            if(vec[i].getEdad()> mayor && vec[i].getRaza() == "perro") mayor = i;
        }
        
        vec[mayor].mostrar();
    }
    
    public static void edad_comejos(mascota vec[])
    {
        String msj = "La edad de los conejos registados es de: ";
                
        for(int i = 0;i<vec.length;i++)
        {
            if(vec[i].getRaza().compareToIgnoreCase("conejo")==0)
            {
                msj = msj + " " + vec[i].getEdad();
            }
        }
        
        JOptionPane.showInputDialog(msj);
    }
    
    public static void perros_fallecidos_mesActual(mascota vec[])
    {
        Date hoy = new Date();
        
        for(int i = 0; i<vec.length; i++)
            if(vec[i].getfDefuncion() != null)
            {
                if(vec[i].getfDefuncion().getMonth() == hoy.getMonth() && vec[i].getRaza().compareToIgnoreCase("perro")==0)
                {
                    vec[i].mostrar();
                }
            }
    }
    
    public static void gatos_ord_porFecha(mascota vec[])
    {
        mascota aux = null;
        
        for(int i = 0;i<vec.length-1;i++)
        {
            for(int j = i+1; j<vec.length;j++)
            {
                if(vec[i].getfNacimiento().compareTo(vec[j].getfNacimiento())<0)
                {
                    aux = new mascota();
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
        
        for(int i = 0; i<vec.length;i++)
        {
            if(vec[i].getRaza().compareToIgnoreCase("gato")==0) vec[i].mostrar();
        }
    }
}
