
import java.util.Scanner;
import fatec.poo.model.Retangulo;
/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        
        //Instaciação dos objetos
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        //# # # # # # # # # # # # # # # # # # # # # # # # # # # # #//
        System.out.print("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.print("\nA medida da altura do retângulo: "
                + objRet.getAltura() + "\n");
        
        System.out.print("A medida da base do retângulo: "
                + objRet.getBase() + "\n");
        
        System.out.print("\nA medida do perímetro desse retângulo é de: "
                + objRet.calcPerimetro() + "\n");
        
        System.out.print("A medida da area desse retângulo é de: "
                + objRet.calcArea() + "\n");
       
        
        System.out.print("A medida da diagonal: "
                + objRet.calcDiagonal() + "\n");
    }
    
}
