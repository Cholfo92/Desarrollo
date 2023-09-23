/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_fechas;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class Ejercicio_Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        int n, opc;
        String msj = "";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: "));
        
        empleado vec[] = new empleado[n];
        
        empleado a = null;
        
        for(int i = 0; i<vec.length;i++)
        {
            a = new empleado();
            a.registrar();
            vec[i] = a;
            
        }
        
        
        for(int i = 0;i<vec.length;i++)
        {
            vec[i].mostrar();
        }
        
        
        /*
        realizar con menu de opciones: (Menos el 3, el 4 y el 7)
        1- Ingresar una ciudad y listar los empleados
        2- Ingresar un sueldo basico y listar los empleados que perciban un sueldo inferior
        3- Listar los datos de los empleados con mas de 10 años de antiguedad
        4- Listar los datos de los empleados con mayor edad a 55
        5- Registrar baja de empleado (buscar empleado por legajo)
        6- Informar la cantidad de empleados dados de baja
        7- Listar empleados por antiguedad (Mayor a menor)
        8- Buscar un empleado por legajo y actulizar sus datos
        */
        
        msj = "Elija una opcion: " +
        "\n1- Ingresar una ciudad y listar los empleados" +
        "\n2- Ingresar un sueldo basico y listar los empleados que perciban un sueldo inferior" +
        "\n3- Listar los datos de los empleados con mas de 10 años de antiguedad" +
        "\n4- Listar los datos de los empleados con mayor edad a 55" +
        "\n5- Registrar baja de empleado (buscar empleado por legajo)" +
        "\n6- Informar la cantidad de empleados dados de baja" +
        "\n7- Listar empleados por antiguedad (Mayor a menor)" +
        "\n8- Buscar un empleado por legajo y actulizar sus datos" +
        "\n9- Salir";
        
        do{
            
            opc = Integer.parseInt(JOptionPane.showInputDialog(msj));
            
            switch(opc)
            {
                case 1:
                        {
                            busquedaCiudad(vec);
                        }
                        break;
                case 2:
                        {
                            busquedaMenorSueldo(vec);
                        }
                        break;
                case 3:
                        {
                            ant10(vec);
                        }
                        break;
                case 4:
                        {
                            mas55(vec);
                        }
                        break;
                case 5:
                        {
                            busquedaLejagoYEliminar(vec);
                        }
                        break;
                        
                case 6:
                        {
                            cantidadDespedidos(vec);
                        }
                        break;
                case 7:
                        {
                            ord_por_antiguedad(vec);
                            listar(vec);
                        }
                        break;
                case 8:
                        {
                            
                        }
                        break;
                default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida!!");
            }
            
            
        }while(opc!=9);
        
        JOptionPane.showMessageDialog(null, "Gracias por usar este sistema.");
        
    }
    
    public static void busquedaCiudad(empleado vec[])
    {
       String city = "";
       
       city = JOptionPane.showInputDialog("Ingrese la localidad a buscar: ");
       
       for(int i = 0;i<vec.length;i++)
       {
           if(vec[i].getCiudad().compareToIgnoreCase(city)==0 && vec[i].isActivo()) vec[i].mostrar();
       }
    }
    
    public static void busquedaMenorSueldo(empleado vec[])
    {
       float sueldo = 0;
       
       sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese tope maximo de sueldo a buscar: "));
       
       for(int i = 0;i<vec.length;i++)
       {
           if(vec[i].getSueldo_basico() < sueldo && vec[i].isActivo()) vec[i].mostrar();
       }
    }
    
    public static void busquedaLejagoYEliminar(empleado vec[])
    {
       int leg = 0;
       
       leg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el legajo a buscar: "));
       
       for(int i = 0; i<vec.length;i++)
       {
           if(vec[i].getLegajo()==leg && vec[i].isActivo()) vec[i].eliminar();
       }
       
    }
    
    public static void cantidadDespedidos(empleado vec[])
    {
        for(int i = 0; i<vec.length;i++)
        {
            if(!vec[i].isActivo()) vec[i].mostrar();
        }
    }
    
    public static void busquedaLegajoAct(empleado vec[]) throws ParseException
    {
       int leg = 0;
       
       leg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un legajo a buscar: "));
       
       for(int i = 0;i<vec.length;i++)
       {
           if(vec[i].getLegajo() == leg && vec[i].isActivo()) vec[i].registrar();
       }
    }
    
    public static void ant10(empleado vec[])
    {
        for(int i = 0; i<vec.length; i++)
        {
            if(vec[i].antiguedad()>9 && vec[i].isActivo()) vec[i].mostrar();
        }
    }
     
    public static void mas55(empleado vec[])
    {
        for(int i = 0; i<vec.length; i++)
        {
            if(vec[i].edad()>54 && vec[i].isActivo()) vec[i].mostrar();
        }
    }
    
    public static void ord_por_antiguedad(empleado vec[])
    {
        empleado aux = null;
        for(int i = 0;i<vec.length-1;i++)
        {
            for(int j = i+1;i<vec.length;j++)
            {
                aux = new empleado();
                if(vec[i].edad()<vec[j].edad())
                {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }
   
    public static void listar(empleado vec[])
    {
        for(int i = 0;i<vec.length;i++)
        {
            if(vec[i].isActivo()) vec[i].mostrar();
        }
    }
    
    
}
