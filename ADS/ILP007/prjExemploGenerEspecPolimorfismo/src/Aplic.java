
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author 0030481921018
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int regFuncionario, qtdeHora;
        String nomeFuncionario, dtAdmissao,cargo;
        double valHora,valSalMinimo,numSalMinimo,valSalBase, valTaxaComissao;

        System.out.print("Digite o nome do funcionário Horista: ");
        nomeFuncionario = entrada.next();
        System.out.print("\nDigite o registro do funcionário Horista: ");
        regFuncionario = entrada.nextInt();
        System.out.print("\nDigite o cargo do funcionário Horista: ");
        cargo = entrada.next();
        System.out.print("\nDigite a data de admissão do funcionário Horista: ");
        dtAdmissao = entrada.next();
        System.out.print("\nDigite o valor da hora trabalhada do funcionário Horista: ");
        valHora = entrada.nextDouble();
        System.out.print("\nDigite a quantidade de horas trabalhadas do funcionário Horista: ");
        qtdeHora = entrada.nextInt();
        
        FuncionarioHorista objFuncHor = new FuncionarioHorista(regFuncionario,nomeFuncionario,dtAdmissao,valHora);
        objFuncHor.setQtdeHorTrab(qtdeHora);
        objFuncHor.setCargo(cargo);
        System.out.println("");
        System.out.println("");
        System.out.print("Digite o nome do funcionário Mensalista: ");
        nomeFuncionario = entrada.next();
        System.out.print("\nDigite o registro do funcionário Mensalista: ");
        regFuncionario = entrada.nextInt();
        System.out.print("\nDigite o cargo do funcionário Mensalista: ");
        cargo = entrada.next();
        System.out.print("\nDigite a data de admissão do funcionário Mensalista: ");
        dtAdmissao = entrada.next();
        System.out.print("\nDigite o valor do salário mínimo: ");
        valSalMinimo = entrada.nextDouble();
        System.out.print("\nDigite a quantidade de salários mínimos: ");
        numSalMinimo = entrada.nextDouble();
        
        FuncionarioMensalista objFuncMen = new FuncionarioMensalista(regFuncionario,nomeFuncionario,dtAdmissao,valSalMinimo);
        objFuncMen.setNumSalMin(numSalMinimo);
        objFuncMen.setCargo(cargo);
        
        System.out.println("");
        System.out.print("Digite o nome do funcionário Comissionado: ");
        nomeFuncionario = entrada.next();
        System.out.print("\nDigite o registro do funcionário Comissionado: ");
        regFuncionario = entrada.nextInt();
        System.out.print("\nDigite o cargo do funcionário Comissionado: ");
        cargo = entrada.next();
        System.out.print("\nDigite a data de admissão do funcionário Comissionado: ");
        dtAdmissao = entrada.next();
        System.out.print("\nDigite o valor do salário base: ");
        valSalBase = entrada.nextDouble();
        System.out.print("\nDigite a o valor da taxa de comissão: ");
        valTaxaComissao = entrada.nextDouble();
        FuncionarioComissionado objFuncCom = new FuncionarioComissionado(regFuncionario,nomeFuncionario,dtAdmissao,valTaxaComissao);
        objFuncCom.setSalBase(valSalBase);
        objFuncCom.setCargo(cargo);
        objFuncCom.addVendas(100.5);
        objFuncCom.addVendas(1000.5);
        objFuncCom.addVendas(700.5);
        objFuncCom.addVendas(5000.5);
        System.out.println("");
        System.out.println("");
        System.out.println("Registro [H]: " + objFuncHor.getRegistro());
        System.out.println("Nome [H]: " + objFuncHor.getNome());
        System.out.println("Cargo [H]: " + objFuncHor.getCargo());
        System.out.println("Data admissão [H]: " + objFuncHor.getDtAdmissao());
        System.out.println("Salario Bruto [H]: " + objFuncHor.calcSalBruto());
        System.out.println("Desconto [H]: " + df.format(objFuncHor.calcDesconto()));
        System.out.println("Gratificação [H]: " + df.format(objFuncHor.calcGratificacao()));
        System.out.println("Salário Líquido [H]: " + df.format(objFuncHor.calcSalLiquido()));            
        System.out.println("");
        System.out.println("Registro [M]: " + objFuncMen.getRegistro());
        System.out.println("Nome [M]: " + objFuncMen.getNome());
        System.out.println("Cargo [M]: " + objFuncMen.getCargo());
        System.out.println("Data admissão [M]: " + objFuncMen.getDtAdmissao());
        System.out.println("Salario Bruto [M]: " + objFuncMen.calcSalBruto());
        System.out.println("Desconto [M]: " + df.format(objFuncMen.calcDesconto()));
        System.out.println("Salário Líquido [M]: " + df.format(objFuncMen.calcSalLiquido()));              
        System.out.println("");
        System.out.println("Registro [C]: " + objFuncCom.getRegistro());
        System.out.println("Nome [C]: " + objFuncCom.getNome());
        System.out.println("Cargo [C]: " + objFuncCom.getCargo());
        System.out.println("Data admissão [C]: " + objFuncCom.getDtAdmissao());
        System.out.println("Salario Base [C]: " + objFuncCom.getSalBase());
        System.out.println("Desconto [C]: " + df.format(objFuncCom.calcDesconto()));
        System.out.println("Total vendas [C]: " + df.format(objFuncCom.getTotalVendas()));
        System.out.println("Gratificação [C]: " + df.format(objFuncCom.calcGratificacao()));
        System.out.println("Salário Líquido [C]: " + df.format(objFuncCom.calcSalLiquido()));            
        
    }
    
}
