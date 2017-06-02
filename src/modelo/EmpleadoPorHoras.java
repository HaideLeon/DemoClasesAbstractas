/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sams
 */
public class EmpleadoPorHoras extends Empleado{
    
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras (String nombre, String ApellidoP, String nss,
            double sueldoPorHoras, double horasDeTrabajo ){
         super (nombre,ApellidoP,nss);
         setSueldoPorHora(horas);
         setHorasDeTrabajo (horas);
    }
    
    public void setSueldoPorHora (double sueldoPorHoras ){
        
        if (sueldoPorHoras >= 0.0){
            sueldo = sueldoPorHoras;
        }else{
            throw new IllegalArgumentException( "El sueldo por horas debe ser >= 0.0" ); 
        }
        
    }
    
    public double getSueldo (){
        
        return sueldo;
    }
 
    public void setHorasDeTrabajo (double horasDeTrabajo){
        
        if ((horasDeTrabajo >= 00 ) && (horasDeTrabajo <= 168.0)){
            
            horas = horasDeTrabajo;
        
        }else {
            throw new IllegalArgumentException ("Las horas de trabajo debe ser >= 0.0 && <= 168.0");
        }
    }
    
    public double getHoras (){
    
        return horas;
    }
    
    

    @Override
    public double ingresos() {
        if (getHoras() <= 40){
            return getSueldo () * getHoras();
        }else{
            return 40* getSueldo() + ( getHoras() - 40 )* getSueldo() * 1.5;
        }
    }
    
    @Override 
    public String toString (){
        
        return "Empleado por horas : " + super.toString()
                + "\nSu sueldo por horas: " + getSueldo()
                + "\nHoras Trabajadas: " + getHoras();
    }
    
}
