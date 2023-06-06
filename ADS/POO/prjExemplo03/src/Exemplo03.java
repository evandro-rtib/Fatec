import java.util.Scanner;

/**
 *
 * @author 0030481921018
 */
public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont=1;
        System.out.print("Digite o valor do número para gerar a tabuada: ");
        numero = entrada.nextInt();
        System.out.println("Com while: ");
        while(cont <=10){
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
            cont++;
        }
    }
    
}
