package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Cliente extends Pessoa{
    private String cpf;
    private double peso;
    private double altura;

    public Cliente(String cpf, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
   public double icm(){
       return peso / Math.pow(altura, 2);
   }

    
    
}
