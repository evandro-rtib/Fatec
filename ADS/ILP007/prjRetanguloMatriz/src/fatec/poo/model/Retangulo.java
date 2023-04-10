
package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Retangulo {
    private double altura;
    private double base;
    private String unidade;
    
    public Retangulo(String unidade){
        this.unidade=unidade;
    }
    
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

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public double calcArea(){
        
        return (altura * base);
    }
    
    public double calcPerimetro(){
        
        return 2 * (altura + base);
    }
    
     public double calcDiagonal(){
        double raiz=1.0/2;
        
        //return Math.sqrt(Math.pow(altura, 2) + Math.pow(base,2));
        return Math.pow(Math.pow(altura, 2) + Math.pow(base,2),raiz);
    }

}
