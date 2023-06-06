
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Aplic {

    public static void main(String[] args) {
        double medRaio;
        Scanner entrada = new Scanner(System.in);
        
        Circulo objCir = new Circulo();
        
        System.out.print("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        objCir.setRaio(medRaio);
        System.out.print("\n\nA medida do raio do círculo: " + objCir.getRaio() + "\n");
        System.out.print("O Valor da área do círculo: " + objCir.calcArea() + "\n");
        System.out.print("O valor do perímetro do círculo: " + objCir.calcPerimetro()+ "\n");
        System.out.print("O valor do diâmetro do círculo: " + objCir.calcDiametro()+ "\n");
    }
    
}
