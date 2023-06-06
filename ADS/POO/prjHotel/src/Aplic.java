
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
        int q=0;
        int opcoes;
        int numQuarto;
        double valorBaseQuarto = 20.0;
        DecimalFormat df = new DecimalFormat("#,##.00");
        Scanner entrada = new Scanner(System.in);
        
        QuartoHotel[] matQtHotel = new QuartoHotel[qtdQuartos];
        
        //POPULA DADOS DA MATRIZ
        for (q=0;q<qtdQuartos;q++){
            matQtHotel[q] = new QuartoHotel(q*2+1, valorBaseQuarto);
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
                    for (q=0;q<matQtHotel.length;q++){
                         System.out.println("Quarto " + matQtHotel[q].getNumQuarto() + "num: " + numQuarto);
                        if (matQtHotel[q].getNumQuarto() == numQuarto)
                            break;
                    }
                    if (q<matQtHotel.length){
                        if (matQtHotel[q].isSituacao()){
                            System.out.println("Quarto " + matQtHotel[q].getNumQuarto() +" está reservado");
                        }
                        else {
                            System.out.println("Quarto " + matQtHotel[q].getNumQuarto() +" está livre");
                        }
                    }
                    else
                    {
                        System.out.println("Quarto não cadastrado");
                    }
            }
            
        } while(opcoes < 6);
    }
    
}
