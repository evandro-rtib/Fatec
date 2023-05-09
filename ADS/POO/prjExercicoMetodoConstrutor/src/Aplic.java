
import fatec.poo.model.Circulo;
import java.util.Scanner;
/**
 *
 * @author 0030481921018
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double medRaio;
         String uniMed;
        Scanner entrada = new Scanner(System.in);
        
       
        System.out.print("Digite a unidade de medida: ");
        uniMed = entrada.next();
        System.out.print("\nDigite a medida do raio: ");
        medRaio = entrada.nextDouble();
        Circulo objCir = new Circulo(uniMed);
        objCir.setRaio(medRaio);
        System.out.print("\n\nA medida do raio do círculo: " + objCir.getRaio() + " ["+ objCir.getUnidadeMedida() +"]\n");
        System.out.print("O Valor da área do círculo: " + objCir.calcArea() + " ["+ objCir.getUnidadeMedida() +"²]\n");
        System.out.print("O valor do perímetro do círculo: " + objCir.calcPerimetro()+ " ["+ objCir.getUnidadeMedida() +"]\n");
        System.out.print("O valor do diâmetro do círculo: " + objCir.calcDiametro()+ " ["+ objCir.getUnidadeMedida() +"]\n");
    }
    
}
