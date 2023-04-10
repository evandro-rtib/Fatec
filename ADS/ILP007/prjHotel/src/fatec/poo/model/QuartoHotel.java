
package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        this.situacao = false;
    }
 
    public void reservar(int numRG){
        this.numRG = numRG;
        situacao = true;
        
    }

    public double liberar(int qtdDias){
        double valor;
        valor = qtdDias *valorDiaria;
        totalFaturado+=valor;
        numRG=0;
        situacao=false;
        return valor;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    
}
