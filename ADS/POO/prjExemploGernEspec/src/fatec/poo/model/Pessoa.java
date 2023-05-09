package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Pessoa {
    
    private String nome;
    private String dataNasc;

    public Pessoa(String nome, String dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

       public String getDataNasc() {
        return dataNasc;
    }

    
}
