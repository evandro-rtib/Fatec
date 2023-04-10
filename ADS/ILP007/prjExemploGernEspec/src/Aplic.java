
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,#0.00");
        int regAluno=1010,regProf=1212;
        String nomeAluno="Carlos Silva", nomeProf="Dimas";
        String dataNascAluno="15/03/2000",dataNascProf="15/03/1976";
        double mesalidade = 1500.0,salarioProf=8432.95;
        
        
        
        
        Aluno objAluno = new Aluno(regAluno,nomeAluno,dataNascAluno);
        objAluno.setMensalidade(mesalidade);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data nascimento: " + objAluno.getDataNasc());        
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        Professor objProfessor = new Professor(regProf,salarioProf,nomeProf,dataNascProf);
        System.out.println("Registro Professor: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data nascimento: " + objProfessor.getDataNasc());        
        System.out.println("Salário: " + df.format(objProfessor.getSalario()));
        
    }
    
}
