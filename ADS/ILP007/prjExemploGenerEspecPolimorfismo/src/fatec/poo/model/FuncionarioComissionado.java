package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao,double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    
    
    public double calcSalBruto(){
        return (this.salBase+(this.taxaComissao/100)*this.totalVendas);
    }
    
    public double calcGratificacao(){
        if(this.totalVendas<=5000){
            return 0;
        }
        else if (this.totalVendas <= 10000){
            return 0.03*calcSalBruto();
        }
        return (0.05*calcSalBruto());
    }
    
    public void addVendas(double valorVenda){
        this.totalVendas+=valorVenda;
    }
    public double calcSalLiquido(){
        return (super.calcSalLiquido()+calcGratificacao());
    }
}
