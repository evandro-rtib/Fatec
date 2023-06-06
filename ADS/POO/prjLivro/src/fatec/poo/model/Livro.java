
package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Livro {
    private int identificao;
    private boolean situacao;
    private double valMultaDiaria;
    private double valMultasPagas;

    public int getIdentificao() {
        return identificao;
    }

    public void setIdentificao(int identificao) {
        valMultasPagas=0;
        this.identificao = identificao;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public double getValMultaDiaria() {
        return valMultaDiaria;
    }
    
    public double getValMultasPagas() {
        return valMultasPagas;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public void emprestar() {
        this.situacao = true;
    }
    
    public double devolver(int diasAtraso) {
        this.situacao = false;
        if (diasAtraso > 0){
            this.valMultasPagas+=this.valMultaDiaria * diasAtraso;
        }
        return this.valMultaDiaria * diasAtraso;
    }
}
