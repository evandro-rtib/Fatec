
import fatec.poo.model.Livro;
import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        int numIdentificacao,opcao,diasAtraso;
        double valMultaDiaria;
        boolean situacao=false;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Sistema de Gerenciamento de Livros\n");
        Livro objLivro = new Livro();
        do{
            System.out.print("\n0 - Inserir dados do Livro\n");
            System.out.print("1 - Consultar Livro\n");
            System.out.print("2 - Emprestar Livro\n");
            System.out.print("3 - Devolver Livro\n");
            System.out.print("4 - Total de multas pagas\n");
            System.out.print("5 - Sair\n\n");
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao)
            {
                case 0:
                    System.out.print("Digite a identificação do livro: ");
                    numIdentificacao = entrada.nextInt();
                    System.out.print("Digite o valor da multa diária: ");
                    valMultaDiaria = entrada.nextDouble();

                    objLivro.setIdentificao(numIdentificacao);
                    objLivro.setValMultaDiaria(valMultaDiaria);
                    break;

                case 1:
                    String textoSituacao;
                    if (objLivro.getSituacao()){
                        textoSituacao="Emprestado";
                    }
                    else{
                        textoSituacao="Disponível";
                    }
                    System.out.print("Identificação: " + objLivro.getIdentificao() + "\n");
                    System.out.print("O valor da multa diária: " + objLivro.getValMultaDiaria() + "\n");
                    System.out.print("Situação: " + textoSituacao + "\n");
                    break;
            
                case 2:
                    if (objLivro.getSituacao()){
                        System.out.print("O livro: " + objLivro.getIdentificao() + " já está emprestado\n");
                    }
                    else{
                        System.out.print("Realizado o emprestimo do livro: " + objLivro.getIdentificao()+"\n");
                        objLivro.emprestar();
                    }
                    break;

                case 3:
                    if (!objLivro.getSituacao()){
                        System.out.print("O livro: " + objLivro.getIdentificao() + " já está disponível\n");
                    }
                    else{
                        System.out.print("Digite a quantidades de dias em atraso: ");
                        diasAtraso = entrada.nextInt();

                        System.out.print("Realizado a devolução do livro: " + objLivro.getIdentificao()+"\n");
                        if (objLivro.devolver(diasAtraso) > 0)
                        {
                            System.out.print("Valor da multa R$ "+ objLivro.devolver(diasAtraso) + "\n");
                        }
                    }
                    break;
                case 4:
                    System.out.print("O valor total de multas pagas do livro: " + objLivro.getIdentificao()
                            +" é de: "+ objLivro.getValMultasPagas() +" \n");
                    break;
                case 5:
                    System.out.print("Sistema encerrado\n");
                    break;
                    
                default:
                    System.out.print("Opção inválida\n");
            }
        }
        while(opcao!=4);
    }
}
