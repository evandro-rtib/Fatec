
package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dataNasc) {
        super(nome, dataNasc);
        this.regEscolar = regEscolar;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public void setRegEscolar(int regEscolar) {
        this.regEscolar = regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
   
}
