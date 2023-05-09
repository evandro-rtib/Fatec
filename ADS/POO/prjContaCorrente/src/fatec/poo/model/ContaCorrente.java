package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valDeposito){
        saldo+=valDeposito;
    }
    
    public void sacar(double valorSaque)
    {
        saldo =- valorSaque;
    }
            
}
