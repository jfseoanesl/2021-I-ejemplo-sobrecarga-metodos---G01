/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploTrabajador;

/**
 *
 * @author jairo
 */
public class Trabajador {
    
    private double hTrabajadas;
    public static double tarifa = 100;
    
    public Trabajador(){
    }
    
    public double getHTrabajadas(){return this.hTrabajadas;}
    public void setHTrabajadas(double h){this.hTrabajadas=h;}
    
    public double calcularSueldo(){return this.hTrabajadas * Trabajador.tarifa;}
    
}
