/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class PruebaCoche {
    
    public static void main(String arg[]){
        
        Coche miCoche = createNewCoche();
        printInfoCoche(miCoche);
        
        System.out.println("------------------------------");
        
        Coche nuevoCoche = createNewCoche();
        printInfoCoche(nuevoCoche);
        
    }
    
    public static Coche createNewCoche(){
        Scanner entrada = new Scanner(System.in);
        Coche coche = new Coche();
        
        System.out.print("Marca: ");
        coche.setMarca(entrada.next());
        
        System.out.print("Color: ");
        coche.setColor(entrada.next());
        
        System.out.print("Matricula: ");
        coche.setMatricula(entrada.next());
        
        System.out.print("Modelo: ");
        coche.setModelo(entrada.nextInt());
       
        System.out.print("No Caballos: ");
        coche.setNCaballos(entrada.nextInt());
        
        System.out.print("No Puertas: ");
        coche.setNPuertas(entrada.nextInt());
        
        return coche;
    }
    
    public static void printInfoCoche(Coche coche){
        System.out.println("Color: " + coche.getColor());
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Matricula: " + coche.getMatricula());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("No Caballos: " + coche.getNCaballos());
        System.out.println("No Puertas: " + coche.getNPuertas());
    }
    
}
