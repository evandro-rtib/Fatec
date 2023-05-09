
package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Circulo {
    private double raio;
    private String unidadeMedida;

    public Circulo(String unidadeMedida, double raio){
        this.raio=raio;
        this.unidadeMedida = unidadeMedida;
    }
    
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double r){
        raio = r;
    }
   
    public double calcArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    
    public double calcPerimetro(){
        return 2 * Math.PI * raio;
    }
    
    public double calcDiametro(){
        return 2 * raio;
    }
}
