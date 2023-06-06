package fatec.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedido;
    
    
    public Cliente(String cpf, String pessoa, double limiteCred) {
        super(cpf, pessoa);
        this.limiteCred = limiteCred;
        this.pedido = new ArrayList<Pedido>();
    }

    public void addPedido(Pedido pedido) {
        this.pedido.add(pedido);
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    
}
