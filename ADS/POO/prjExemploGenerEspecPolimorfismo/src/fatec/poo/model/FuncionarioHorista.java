package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao,double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    public double calcSalBruto(){
        return (qtdeHorTrab * valHorTrab);
    }
    
    public double calcGratificacao(){
        return (0.075 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return (super.calcSalLiquido()+calcGratificacao());
    }
}
