package fatec.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0030481921018
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    //private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    public void listarFuncionarios(){
        System.out.println("Codigo Projeto: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data Inicio: " + dtInicio);
        System.out.println("Data Término: " + dtTermino);
        System.out.println("Número de funcionários:" + funcionarios.size());
        System.out.print("Registro\tNome\t\t\tCargo\t\t\tDepartamento\r\n");
        for (int i=0;i<funcionarios.size();i++){
            System.out.print(       funcionarios.get(i).getRegistro()+"\t\t"+
                                    funcionarios.get(i).getNome()+"\t\t"+
                                    funcionarios.get(i).getCargo()+"\t\t"+
                                    funcionarios.get(i).getDepartamento().getNome()+"\r\n");
        }
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ");
    }
    
}
