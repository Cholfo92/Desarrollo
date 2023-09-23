package lab2_ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Velo
 */
public class Lab2_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int aactual,anacimiento,edad, legajo, n;
        aactual = anacimiento = edad = legajo = 0;
        String nomyape="";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos."));
        
        aactual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año actual: "));
        
        for(int i = 0;i<n;i++)
             {
                nomyape = JOptionPane.showInputDialog("Ingrese el nombre y apellido del alumno " + (i+1) + ": ");

                JOptionPane.showMessageDialog(null, "Bienvenido: "+nomyape);
                anacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));

                edad = aactual - anacimiento;
                legajo ++;
                
                if(edad < 18)
                {
                   JOptionPane.showMessageDialog(null, "Señor: "+ nomyape + ". Usted tiene: "+edad+" años (Menor de edad) y posee el Legajo N°: "+ legajo); 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Señor: "+ nomyape + ". Usted tiene: "+edad+" años (Mayor de edad) y posee el Legajo N°: "+ legajo);
                }
        
        


                
        
            }
  
        
        Alumno a = new Alumno();
        
        a.registrar_alumno();
        
        a.mostrar_alumno();
        
        /*
        int egresado_se = 0;
        int l, tel, dni, año;
        String nya, email, dom;
        boolean egresado;
        
        
        l = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Legago: ")));
        nya = (JOptionPane.showInputDialog("Ingrese el Nombre y apellido: "));
        tel = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Telefono: ")));
        email = (JOptionPane.showInputDialog("Ingrese el Email: "));
        dni = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI: ")));
        dom = (JOptionPane.showInputDialog("Ingrese el domicilio: "));
        año = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de ingreso: ")));
        egresado_se = JOptionPane.showConfirmDialog(null, "Ingrese si egreso del secundaro: ");
        
        if(egresado_se == 0) egresado = true;
        else egresado = false;
        
        Alumno a1 = new Alumno(l, tel, dni, 0, año, nya, email, dom, egresado );
        
        a1.mostrar_alumno();
        */
        
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos alumnos desea cargar: "));
        
        Alumno valu[] = new Alumno[n];
        Alumno a; 
        
        for (int i = 0; i<valu.length; i++)
            {
                a = new Alumno();
                a.registrar_alumno();
                valu[i] = a;
                JOptionPane.showMessageDialog(null, "Alumno Cargado");
            }
        
        for (int i = 0; i<valu.length; i++)
            {
                valu[i].mostrar_alumno();
            }
        String opciones = "Elija una opcion:\n" +
        "0- Listado de alumnos ordenado descendente por apellido y nombre que ingresaron en el año actual\n " +
        "1- Listado de alumnos que ingresaron hace 5 años\n " +
        "2- Listado ordenado por su dni\n " +
        "3- Listado que no han egresado del secundario\n " +
        "4- Busqueda de un alumno por su nombre y apellido\n " +
        "5- Listado de alumnos ordenado por apellido y nombre\n " +
        "6- Buscar un alumno por lejago para actualizar datos\n " +
        "7- Buscar alumno por lejago y eliminarlo\n " +
        "8- Salir";
        
        int opc = 0;
        do{
            
            opc = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            
            switch(opc)
                {
                case 0:
                        {
                            ordenar_nombre(valu);
                            listado_actual(valu);
                        }
                        break;
                        
                case 1:
                        {
                            listado_hace5años(valu);
                        }
                        break;
                       
                case 2: 
                        {
                            ordenarpordni(valu);
                            listado(valu);
                        }
                        break;

                case 3: 
                        {
                            sin_egresar_secu(valu);
                        }
                        break;
                        
                case 4:
                        {
                            mostrar(valu, busqueda(valu,1));
                        }
                        break;
                case 5:
                        {
                            ordenar_nombre(valu);
                            listado(valu);
                        }
                        break;
                case 6:
                        {
                            modificar(valu, busqueda(valu, 2));
                        }
                        break;
                case 7:
                        {
                            eliminar(valu, busqueda(valu, 2));
                        }
                        
                default:
                        JOptionPane.showMessageDialog(null, "Inrese una opcion VALIDA!");
                }
            
        }while(opc!=8);
        
        JOptionPane.showMessageDialog(null, "Gracias por usar este sistema.");
    
    }
    
    
    
    public static void listado(Alumno vec[])
        {
            for(int i = 0; i<vec.length;i++)
            {
                if(vec[i].isActivo()) vec[i].mostrar_alumno();
            }
        }
        
    public static void listado_actual(Alumno vec[])
        {
            for(int i = 0; i<vec.length; i++)
            {
                if(vec[i].getAño_ingreso() == 2023 && vec[i].isActivo())
                {
                    vec[i].mostrar_alumno();
                }
            }
        }
    
    public static void listado_hace5años (Alumno vec[])
        {
            for (int i = 0; i<vec.length; i++)
            {
                if(vec[i].getAño_ingreso() <= 2018 && vec[i].isActivo())
                    {
                        vec[i].mostrar_alumno();
                    } 
            }

        }
    
    public static void ordenarpordni(Alumno vec[])
        {
            Alumno aux;
            
            for(int i = 0; i<vec.length-1; i++)
            {
                for(int j = i+1;j<vec.length;j++)
                        {
                            aux = new Alumno();
                            if(vec[i].getDni()>vec[j].getDni())
                            {
                                aux = vec[i];
                                vec[i] = vec[j];
                                vec[j] = aux;
                            }
                        }
            }
        }
    
    public static void sin_egresar_secu(Alumno vec[])
        {
            for(int i = 0; i<vec.length; i++)
            {
                if(vec[i].isEgresado_secun() == false && vec[i].isActivo())
                {
                    vec[i].mostrar_alumno();
                }
            }
        }
    
    public static int busqueda(Alumno vec[], int opc)
        {
            boolean ban = false;
            int pos =  -1;
            switch(opc)
            {
                case 1: 
                        {
                            String msj = "";
                            msj = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
                            for(int i = 0; i<vec.length; i++)
                                {
                                    if(vec[i].getNomyape().compareToIgnoreCase(msj) == 0 && vec[i].isActivo())
                                    {
                                        ban = true;
                                        pos = i;

                                    }

                                }
                            if(!ban) JOptionPane.showMessageDialog(null, " Alumno no encontrado :( ");
                    
                        }
                        
                        break;
                case 2:
                        {
                            int leg;
                            leg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Legajo a buscar: "));
                            for(int i = 0; i<vec.length; i++)
                                {
                                    if(vec[i].getLegajo() == leg && vec[i].isActivo())
                                        {
                                            ban = true;
                                            pos = i;
                                            
                                        }

                                }
                            if(!ban) JOptionPane.showMessageDialog(null, " Alumno no encontrado :( ");

                        }
                        
                        break;
                        
                
                        
                             
          
            }

            
            return pos;      
        }
    
    public static void ordenar_nombre(Alumno vec[])
        {
            Alumno aux;
            
            for(int i = 0; i<vec.length-1; i++)
            {
                for(int j = i+1;j<vec.length;j++)
                        {
                            aux = new Alumno();
                            if(vec[i].getNomyape().compareToIgnoreCase(vec[j].getNomyape())>0)
                            {
                                aux = vec[i];
                                vec[i] = vec[j];
                                vec[j] = aux;
                            }
                        }
            }
        }
    
    public static void mostrar(Alumno vec[], int pos)
    {
        if(pos!=-1 && vec[pos].isActivo())
        {
            vec[pos].mostrar_alumno();
        }
    }
    
    public static void modificar(Alumno vec[],int pos)
    {
        if(pos!=-1 && vec[pos].isActivo())
        {
            vec[pos].registrar_alumno();
        }
    }
            
    public static void eliminar(Alumno vec[], int pos)       
    {
        vec[pos].eliminar();
    }
        
}    
