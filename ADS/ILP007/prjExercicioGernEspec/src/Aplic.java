
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author 0030481921018
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Instrutor objInst = new Instrutor(1010,"Carlos","15987654321");
        objInst.setAreaAtuacao("Academia");
        Cliente objCli = new Cliente("12345678910","Jorge","9875654123");
        objCli.setAltura(1.81);
        objCli.setPeso(82.35);
        System.out.println("Instrutor");
        System.out.println("Nome: " + objInst.getNome());
        System.out.println("Telefone: " + objInst.getTelefone());
        System.out.println("A. Atuação: " + objInst.getAreaAtuacao());
        System.out.println("");
        System.out.println("Cliente");
        System.out.println("Nome: " + objCli.getNome());
        System.out.println("Telefone: " + objCli.getTelefone());
        System.out.println("Altura: " + df.format(objCli.getAltura()));
        System.out.println("Peso: " + df.format(objCli.getPeso()));
        
        System.out.println("IMC: "+df.format(objCli.icm()));
        
    }
    
}
