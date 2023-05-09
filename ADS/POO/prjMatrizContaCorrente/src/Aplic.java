
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        double valDeposito, valSaque;
        int i=0;
        int qtd=15;
        int numConta,procConta,opcao=0;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Conta Corrente\n");
        ContaCorrente[] matBanco = new ContaCorrente[qtd];
        
        for (i=0;i<qtd;i++)
        {
            matBanco[i] = new ContaCorrente();
            System.out.print("Digite o número da conta corrente: ");
            numConta = entrada.nextInt();
            matBanco[i].setNumeroConta(numConta);
        }
        
        do{
            procConta=-1;
            i =0;
            System.out.print("Qual o número da conta: ");
            numConta = entrada.nextInt();
            while (i < qtd){
                if (matBanco[i].getNumeroConta() == numConta)
                {
                    procConta=i;
                    break;
                }
                else
                {
                    procConta=-1;
                }
                i++;
            }
            
            if (procConta==-1){
                System.out.print("Número da conta: " + numConta + " não existe!\n");
                continue;
            }
            System.out.print("1 - Consultar Saldo\n");
            System.out.print("2 - Depositar\n");
            System.out.print("3 - Sacar\n");
            System.out.print("4 - Listar contas\n");
            System.out.print("5 - Sair\n");
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao)
            {
                case 1:
                    System.out.print("Número da conta: " + matBanco[i].getNumeroConta()+ "\n");
                    System.out.print("Valor do saldo: R$ " + df.format(matBanco[i].getSaldo()) + "\n");
                    break;
                case 2:
                    System.out.print("Número da conta: " + matBanco[i].getNumeroConta()+ "\n");
                    System.out.print("Valor do deposito: ");
                    valDeposito=entrada.nextDouble();
                    matBanco[i].depositar(valDeposito);
                    break;

                case 3:
                    System.out.print("Número da conta: " + matBanco[i].getNumeroConta()+ "\n");
                    System.out.print("Valor do saque: ");
                    valSaque = entrada.nextDouble();
                    if (matBanco[i].getSaldo() >= valSaque){
                        matBanco[i].sacar(valSaque);
                    }
                    else
                    {
                        System.out.print("Saldo insulficiente!\n");
                    }
                    break;
                case 4:
                     for (i=0;i<qtd;i++)
                    {
                        System.out.print("Número da conta: "+matBanco[i].getNumeroConta() + " saldo: R$ " + df.format(matBanco[i].getSaldo())+"\n");
                    }
                    break;
                case 5:
                    System.out.print("Sistema encerrado\n");
                    break;
                    
                default:
                    System.out.print("Opção inválida\n");
            }
        }
        while(opcao!=5);
    }
}
