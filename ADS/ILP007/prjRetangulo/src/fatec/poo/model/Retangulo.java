/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura = a;
    }

    public void setBase(double b){
      base = b;
    }
    
    public double getAltura(){
        return altura;
    }

    public double getBase(){
        return base;
    }
    
    public double calcArea(){
        
        return (altura * base);
    }
    
    public double calcPerimetro(){
        
        return 2 * (altura + base);
    }

}
