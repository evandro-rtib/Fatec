import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Exemplo01 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int codProd,qtdeVend;
       String descProd;
       double precUnit, valCompra, refDescon=850.0,valDescon=0,percDescont=0.1;
       
       System.out.print("Digite o código do produto: ");
       
       codProd = entrada.nextInt();
       System.out.print("Digte a descrição: ");
       descProd = entrada.next();
       System.out.print("Digite o preço unitário do produto: ");
       precUnit = entrada.nextDouble();
       System.out.print("Digite a quantidade de venda: ");
       qtdeVend = entrada.nextInt();
       
       valCompra = (precUnit*qtdeVend);
       if (valCompra >= refDescon){
           valDescon = valCompra*percDescont;
       }
       System.out.println("O valor de compra: R$ " + valCompra);
       System.out.println("O valor do Desconto: R$ " + valDescon);
       System.out.println("O valor total: R$ " + (valCompra - valDescon));
       
    }//FIM DO MAIN
}//FIM DA CLASSE
