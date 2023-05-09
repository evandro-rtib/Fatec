import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/78",
                                                             15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020,
                                                                   "Ana Beatriz",
                                                                   "22/07/88",
                                                                   600);
        
        funcMen.setCargo("Aux. Admin");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        funcCom.setCargo("Vendedor");
       
        //Instanciação de objetos da 
        //classe Departamento    
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
        objDep1.addFuncionario(funcHor);
        objDep1.addFuncionario(funcMen);
        objDep2.addFuncionario(funcCom);
	  
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioHorista com
       //1 objeto da classe Departamento
       funcHor.setDepartamento(objDep1);
       
       
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioMensalista com
       //1 objeto da classe Departamento
       funcMen.setDepartamento(objDep1);
        
      
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioComissionado com
       //1 objeto da classe Departamento       
       funcCom.setDepartamento(objDep2);
      
       //Estabelecendo a associação binária entre um
       //objeto da classe Departamento com 1 ou mais (1..*)
       //objetos da classe FuncionarioHorista, FuncionarioMensalista
       //e FuncionarioComissionado  

       
       Projeto objPro1 = new Projeto(3030,"POO");
       funcHor.setProjeto(objPro1);
       funcMen.setProjeto(objPro1);
       funcCom.setProjeto(objPro1);
       
       objPro1.setDtInicio("2023-02-24");
       objPro1.setDtTermino("2023-06-24");
       objPro1.addFuncionario(funcHor);
       objPro1.addFuncionario(funcMen);
       objPro1.addFuncionario(funcCom);
       
       
       System.out.println("O funcionario: " + funcHor.getNome() +
                            " trabalho no departamento: " +
                            funcHor.getDepartamento().getNome() +
                            " e trabalha no projeto: " + funcHor.getProjeto().getDescricao()
                );
       System.out.println("O funcionario: " + funcMen.getNome() +
                            " trabalho no departamento: " +
                            funcMen.getDepartamento().getNome() +
                            " e trabalha no projeto: " + funcMen.getProjeto().getDescricao()
                );
       
       System.out.println("O funcionario: " + funcCom.getNome() +
                            " trabalho no departamento: " +
                            funcMen.getDepartamento().getNome() +
                            " e trabalha no projeto: " + funcCom.getProjeto().getDescricao()
                );
        System.out.println("");
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ");
        objDep1.listarFuncionarios();
        objDep2.listarFuncionarios();
        
        System.out.println("");
        objPro1.listarFuncionarios();
    }    
}
