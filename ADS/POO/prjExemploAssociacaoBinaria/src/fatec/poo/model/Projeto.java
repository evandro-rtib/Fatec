package fatec.poo.model;

/**
 *
 * @author 0030481921018
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.numFunc =0;
        funcionarios = new Funcionario[10];
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
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("Codigo Projeto: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data Inicio: " + dtInicio);
        System.out.println("Data Término: " + dtTermino);
        System.out.println("Número de funcionários:" + numFunc);
        System.out.print("Registro\tNome\t\t\tCargo\t\t\tDepartamento\r\n");
        for (int i=0;i<numFunc;i++){
            System.out.print(       funcionarios[i].getRegistro()+"\t\t"+
                                    funcionarios[i].getNome()+"\t\t"+
                                    funcionarios[i].getCargo()+"\t\t"+
                                    funcionarios[i].getDepartamento().getNome()+"\r\n");
        }
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ");
    }
    
}
