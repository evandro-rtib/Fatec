
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Aplic {

    public static void main(String[] args) {
        String uniMed;
        double medRaio;
        int qtd=1;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        Circulo[] matCir = new Circulo[10];
        
        for (int i=0;i<qtd;i++)
        {
            
            System.out.print("Digite a unidade de medida do círculo ["+(i+1)+"]: ");
            uniMed = entrada.next();
            System.out.print("Digite a medida do raio do círculo ["+(i+1)+"]: ");
            medRaio = entrada.nextDouble();
            matCir[i] = new Circulo(uniMed,medRaio);
            //matCir[i].setUnidadeMedida(uniMed);
            //matCir[i].setRaio(medRaio);   
        }
        
        for (int i=0;i<qtd;i++){    
            System.out.print("\n\nA medida do raio do círculo ["+(i+1)+"]: " + df.format(matCir[i].getRaio()) +" ["+ matCir[i].getUnidadeMedida()+"]\n");
            System.out.print("O Valor da área do círculo ["+(i+1)+"]: " + df.format(matCir[i].calcArea()) +" ["+ matCir[i].getUnidadeMedida()+"²]\n");
            System.out.print("O valor do perímetro do círculo ["+(i+1)+"]: " + df.format(matCir[i].calcPerimetro())+ " ["+ matCir[i].getUnidadeMedida()+"]\n");
            System.out.print("O valor do diâmetro do círculo ["+(i+1)+"]: " + df.format(matCir[i].calcDiametro())+ " [" +matCir[i].getUnidadeMedida()+"]\n");
        }
       
    }
    
}
