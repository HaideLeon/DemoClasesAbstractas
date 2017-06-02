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
public abstract class Empleado {
   
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    public Empleado (String nombre, String ApellidoP, String nss){
        
        primerNombre = nombre;
        apellidoPaterno = ApellidoP;
        numeroSeguroSocial = nss;
        
        
    }
    
    public void setPrimerNombre (String nombre){
    
        primerNombre =  nombre;
    }
    
    public String getPrimerNombre (){
        
        return primerNombre;
    }
    
    
    public void setApellidoPaterno (String apellidoP){
        
        apellidoPaterno = apellidoP;
    }
    
    public String getApellidoPaterno (){
    
        return apellidoPaterno;
    }
    
    public void setNumeroSS (String nss){
    
        numeroSeguroSocial = nss;
        
    }
    
    public String getNumeroSS(){
        
        return numeroSeguroSocial;
    }
    
    @Override 
    public String toString (){
        
        return String.format("%s %s\nNumero de seguro social : %s",
                getPrimerNombre (), getApellidoPaterno(),getNumeroSS());
    
    }
    
    public abstract double ingresos ();
}

    

