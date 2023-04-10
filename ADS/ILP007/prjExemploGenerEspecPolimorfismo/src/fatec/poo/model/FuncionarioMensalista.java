package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class FuncionarioMensalista extends Funcionario{
    private double valSalMinimo;
    private double numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao,double valSalMinimo) {
        super(registro, nome, dtAdmissao);
        this.valSalMinimo = valSalMinimo;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }

    public double calcSalBruto(){
        return (valSalMinimo * numSalMin);
    }
}
