
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        int qtdQuartos=10;
        int opcoes;
        int numQuarto;
        double valorBaseQuarto = 20.0;
        DecimalFormat df = new DecimalFormat("#,##.00");
        Scanner entrada = new Scanner(System.in);
        
        QuartoHotel[] matQtHotel = new QuartoHotel[qtdQuartos];
        
        //POPULA DADOS DA MATRIZ
        for (int q=0;q<qtdQuartos;q++){
            matQtHotel[q] = new QuartoHotel(q+1, valorBaseQuarto);
            valorBaseQuarto+=1.5;
        }
        
        do {
            System.out.println("1 –Consultar quarto");
            System.out.println("2 –Reservar quarto");
            System.out.println("3 –Liberar quarto");
            System.out.println("4 –Consultar faturamento quarto");
            System.out.println("5 –Consultar faturamentoHotel");
            System.out.println("6 -Sair");
            opcoes = entrada.nextInt();
            
            switch (opcoes){
                case 1:
                    System.out.print("Digite o número do quarto a ser consultado: ");
                    numQuarto = entrada.nextInt();
                    if (matQtHotel[numQuarto-1].isSituacao()){
                        System.out.println("Quarto " + numQuarto +" está reservado");
                    }
                    else {
                        System.out.println("Quarto " + numQuarto +" está livre");
                    }
            }
            
        } while(opcoes < 6);
    }
    
}
