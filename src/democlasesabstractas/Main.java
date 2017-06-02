/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlasesabstractas;

import modelo.Empleado;
import modelo.EmpleadoAsalariado;
import modelo.EmpleadoPorComision;
import modelo.EmpleadoPorHoras;
import modelo.EmpleadoBaseMasComision;

/**
 *
 * @author sams
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado
        ( "Ivan", "Biscaldi", "11-11-1111", 800.00 ); 
       
       EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras
        ( "Sofia" , "Price" , "222-22-2222", 16.75, 40 ); 
       
       EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision 
        ("Piero","Jones","333-33-33",10000,.06);
       
       EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision 
        (" Jocelyn "," Lewis "," 444-44-444 ",5000,0.04,300);
        
       System.out.println ("Empleados procesados por separado\n");
       
       System.out.printf("%s\n%s: $%,.2f\n\n",
               empleadoAsalariado,"ingresos: ", empleadoAsalariado.ingresos() );
       System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoPorHoras, "ingresos:", empleadoPorHoras.ingresos());
       System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoPorComision, "ingresos",empleadoPorComision.ingresos());
       System.out.printf("%s\n%s: $%,.2f\n\n",
                 empleadoBaseMasComision, "ingresos",
                 empleadoBaseMasComision.ingresos());
       
       Empleado [] empleados = new Empleado [4];
       
       empleados [0] = empleadoAsalariado;
       empleados [1] = empleadoPorHoras;
       empleados [2]= empleadoPorComision;
       empleados [3]= empleadoBaseMasComision;
       
       System.out.println("Empleados procesando en forma polimorfica:\n");
       
       for (Empleado empleadoActual : empleados ){
       
           System.out.println (empleadoActual);
           
           if (empleadoActual instanceof EmpleadoBaseMasComision){
               
               EmpleadoBaseMasComision empleado = 
                       (EmpleadoBaseMasComision)empleadoActual;
               
               empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
              
               
               System.out.printf (
                       "El nuevo salario base con 10%% de aumento es: $%,.2f\n", 
                       empleado.getSalarioBase());
           
           }
           
           System.out.printf (
                   "ingresos $%,.2f\n\n",
                    empleadoActual.ingresos() ); 
       }
        
    
       for (int i = 0; i < empleados.length; i++){
           System.out.printf("El empleado %d es un %s\n",
                   i ,empleados[i].getClass().getName() ); 
           
           
    }
    }
}
    
