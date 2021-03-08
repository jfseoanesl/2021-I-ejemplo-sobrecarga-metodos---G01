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
public class PruebaTrabajador {
    
    public static void main(String arg[]){
        
        Trabajador.tarifa = 200;
        
        Trabajador juan = new Trabajador();
        juan.setHTrabajadas(10);
        System.out.println("Sueldo juan: " + juan.calcularSueldo());
        
        Trabajador pedro = new Trabajador();
        pedro.setHTrabajadas(500);
        System.out.println("Sueldo pedro: " + pedro.calcularSueldo());
        
    }
    
}
