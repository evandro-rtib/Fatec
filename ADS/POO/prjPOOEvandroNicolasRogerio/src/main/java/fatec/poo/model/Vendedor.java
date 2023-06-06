package fatec.poo.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa{
    private double salarioBase;
    private double txComissao;
    private ArrayList<Pedido> pedido;

    public Vendedor(String cpf, String pessoa, double salarioBase) {
        super(cpf, pessoa);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTxComissao() {
        return txComissao;
    }

    public void setTxComissao(double txComissao) {
        this.txComissao = txComissao;
    }

    public void addPedido(Pedido pedido) {
        this.pedido.add(pedido);
    }
 
    
}
