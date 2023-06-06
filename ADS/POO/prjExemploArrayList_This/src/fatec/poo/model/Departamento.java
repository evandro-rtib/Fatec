
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios; //multiplicidade 1..*
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new ArrayList<Funcionario>();
    }

    public String getSigla() { 
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void listarFuncionarios(){
      System.out.println("");
      System.out.println("");
      System.out.println("Sigla: " + sigla);
      System.out.println("Nome: " + nome);
      System.out.println("Número funcionário: " + funcionarios.size());
      System.out.println("");
      System.out.print("Registro\tNome\t\tCargo\r\n");
      for (int i=0;i<funcionarios.size();i++){
          System.out.print(       funcionarios.get(i).getRegistro()+"\t\t"+
                                  funcionarios.get(i).getNome()+"\t\t"+
                                  funcionarios.get(i).getCargo()+"\r\n");
      }
      System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ");
    }
}
