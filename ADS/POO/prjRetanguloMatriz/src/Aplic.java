
import java.util.Scanner;
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        String unidade;
        
        //Instaciação dos objetos
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.0");
        Retangulo[] matRet = new Retangulo[3];
        
        for(int i=0;i<3;i++)
        {
            System.out.print("Digite a unidade de medida do retângulo ["+(i+1)+"]: ");
            unidade = entrada.next();
            matRet[i] = new Retangulo(unidade);
            System.out.print("Digite a medida da altura do retângulo ["+(i+1)+"]: ");
            medAlt = entrada.nextDouble();

            System.out.print("Digite a medida da base do retângulo ["+(i+1)+"]: ");
            medBase = entrada.nextDouble();

            matRet[i].setAltura(medAlt);
            matRet[i].setBase(medBase);
        }
        for(int i=0;i<3;i++)
        {
            System.out.print("\nA medida da altura do retângulo["+(i+1)+"]: "
                    + df.format(matRet[i].getAltura()) + "["+matRet[i].getUnidade()+"]\n");

            System.out.print("A medida da base do retângulo ["+(i+1)+"]: "
                    + df.format(matRet[i].getBase()) + "["+matRet[i].getUnidade()+"]\n");

            System.out.print("A medida do perímetro desse retângulo ["+(i+1)+"] é de: "
                    + df.format( matRet[i].calcPerimetro()) + "["+matRet[i].getUnidade()+"]\n");

            System.out.print("A medida da área desse retângulo ["+(i+1)+"] é de: "
                    + df.format( matRet[i].calcArea()) + "["+matRet[i].getUnidade()+"²]\n");
            
            System.out.print("A medida da diagonal retângulo ["+(i+1)+"]: "
                    + df.format( matRet[i].calcDiagonal()) + "["+matRet[i].getUnidade()+"]\n");
        }
    
            
    }        
}
