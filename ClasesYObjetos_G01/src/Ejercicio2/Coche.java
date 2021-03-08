/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author jairo
 */
public class Coche {
    
    private String marca, color, matricula;
    private int modelo, nPuertas, nCaballos;
    
    public Coche(){  }
    
    public String getMarca(){return this.marca;}
    public String getColor(){return this.color;}
    public String getMatricula(){return this.matricula;}
    public int getModelo(){return this.modelo;}
    public int getNCaballos(){return this.nCaballos;}
    public int getNPuertas(){return this.nPuertas;}
    
    public void setMarca(String m){this.marca=m;}
    public void setColor(String c){this.color=c;}
    public void setMatricula(String m){this.matricula=m;}
    public void setModelo(int m){this.modelo=m;}
    public void setNCaballos(int n){this.nCaballos=n;}
    public void setNPuertas(int n){this.nPuertas=n;}
    
}
