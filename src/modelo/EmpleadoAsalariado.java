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
public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;
    
    public EmpleadoAsalariado (String nombre , String ApellidoP, String nss, double salario){
        super(nombre,ApellidoP, nss);
        
       setEstableserSalarioSemanal(salario);
    }

    public void setEstableserSalarioSemanal (double salario){
        
        if (salario >= 0.0 ){
            salarioSemanal = salario;
        }else {
            throw new IllegalArgumentException ("El salario debe ser >= 0.0");
           
        }
    }
    
    public double getSalarioSemanal (){
        return salarioSemanal;
    
    }
    
    @Override
    public double ingresos() {
        
        return getSalarioSemanal(); 
    }
    
    
    @Override 
    public String toString(){
        return "Es un Empledo Asalariado" + super.toString() +
                "Su ingreso: " + getSalarioSemanal();
    
    }
    
}


