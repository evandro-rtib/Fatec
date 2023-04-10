package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Professor extends Pessoa{
    private int regFuncional;
    private double salario;

    public Professor(int regFuncional, double salario, String nome, String dataNasc) {
        super(nome, dataNasc);
        this.regFuncional = regFuncional;
        this.salario = salario;
    }

    public int getRegFuncional() {
        return regFuncional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
