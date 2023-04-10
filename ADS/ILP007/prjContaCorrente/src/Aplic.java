
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
        int numConta,opcao;
        DecimalFormat df = new DecimalFormat("###,##,##0.00");
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Conta Corrente\n");
        ContaCorrente objCC = new ContaCorrente();
        do{
            System.out.print("\n0 - Inserir dados da Conta Corrente\n");
            System.out.print("1 - Consultar Saldo\n");
            System.out.print("2 - Depositar\n");
            System.out.print("3 - Sacar\n");
            System.out.print("4 - Sair\n");
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao)
            {
                case 0:
                    System.out.print("Digite o número da conta: ");
                    numConta = entrada.nextInt();
                    objCC.setNumeroConta(numConta);
                    break;

                case 1:
                    System.out.print("Número da conta: " + objCC.getNumeroConta()+ "\n");
                    System.out.print("Valor do saldo: R$ " + df.format(objCC.getSaldo()) + "\n");
                    break;
            
                case 2:
                    System.out.print("Número da conta: " + objCC.getNumeroConta()+ "\n");
                    System.out.print("Valor do deposito: ");
                    valDeposito=entrada.nextDouble();
                    objCC.depositar(valDeposito);
                    break;

                case 3:
                    System.out.print("Número da conta: " + objCC.getNumeroConta()+ "\n");
                    System.out.print("Valor do saque: ");
                    valSaque = entrada.nextDouble();
                    if (objCC.getSaldo() >= valSaque){
                        objCC.sacar(valSaque);
                    }
                    else
                    {
                        System.out.print("Saldo insulficiente!\n");
                    }
                    break;
                case 4:
                    System.out.print("Sistema encerrado\n");
                    break;
                    
                default:
                    System.out.print("Opção inválida\n");
            }
        }
        while(opcao!=4);
    }
}
