
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        int numRA,opcao;
        double valNtPrv1,valNtPrv2,valNtTrab1,valNtTrab2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Sistema Xingling de alunos\n");
        Aluno objAluno = new Aluno();
        do{
            System.out.print("\n0 - Inserir dados do Aluno\n");
            System.out.print("1 - Exibir notas das Provas/Trabalhos\n");
            System.out.print("2 - Exibir média dos Trabalhos/Provas\n");
            System.out.print("3 - Exibir média final\n");
            System.out.print("4 - Sair\n\n");
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 0){
                System.out.print("Digite o RA do aluno: ");
                numRA = entrada.nextInt();
                System.out.print("Digite o valor da nota da prova 1: ");
                valNtPrv1 = entrada.nextDouble();
                System.out.print("Digite o valor da nota da prova 2: ");
                valNtPrv2 = entrada.nextDouble();
                System.out.print("Digite o valor da nota do trabalho 1: ");
                valNtTrab1 = entrada.nextDouble();
                System.out.print("Digite o valor da nota do trabalho 2: ");
                valNtTrab2 = entrada.nextDouble();

                objAluno.setRa(numRA);
                objAluno.setNtPrv1(valNtPrv1);
                objAluno.setNtPrv2(valNtPrv2);
                objAluno.setNtTrab1(valNtTrab1);
                objAluno.setNtTrab2(valNtTrab2);
            }
            
            else if (opcao== 1){
                System.out.print("O valor da prova 1: " + objAluno.getNtPrv1() + "\n");
                System.out.print("O valor da prova 2: " + objAluno.getNtPrv2() + "\n");
                System.out.print("O valor do trabalho 1: " + objAluno.getNtTrab1()+ "\n");
                System.out.print("O valor da trabalho 2: " + objAluno.getNtTrab2()+ "\n");
            }
            
             else if (opcao== 2){
                System.out.print("O valor da médias das provas: " + objAluno.calcMediaProva() + "\n");
                System.out.print("O valor da médias dos trabalhos: " + objAluno.calcMediaTrab()+ "\n");
            }
            else if (opcao== 3){
                System.out.print("O valor da médias do aluno: " + objAluno.calcMediaFinal()+ "\n");
            }
            else if (opcao==4)
            {
                System.out.print("Sistema encerrado\n");
            }
            else{
                System.out.print("Opção inválida\n");
            }
        }
        while(opcao!=4);
    }
}

