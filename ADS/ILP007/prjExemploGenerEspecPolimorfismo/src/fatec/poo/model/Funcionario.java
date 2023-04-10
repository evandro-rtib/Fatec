package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return 0.1 * calcSalBruto();
    }
    
    public double calcSalLiquido(){
        return calcSalBruto() - calcDesconto();
    }
    
}
