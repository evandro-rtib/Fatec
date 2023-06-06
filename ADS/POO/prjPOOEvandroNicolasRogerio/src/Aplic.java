
import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;

public class Aplic {
    public static void main(String[] args) {
        
        //CADASTRO DO VENDEDOR
        Vendedor vd1 = new Vendedor("12345678912","Pessoa 3",1300);
        
        //CADASTRO DOS CLIENTES
        Cliente cl1 = new Cliente("12345678910","Pessoa 1",1000.0);
        Cliente cl2 = new Cliente("12345678911","Pessoa 2",550.30);
        
        //CADASTRO DE PRODUTOS
        Produto pr1 = new Produto("1","Caneta");
        Produto pr2 = new Produto("2","Lápis");
        Produto pr3 = new Produto("3","Caderno");
        Produto pr4 = new Produto("4","Mochila");
        
        //CADASTRO DOS PEDIDOS
        Pedido pd1 = new Pedido("1","2023-05-14");
        Pedido pd2 = new Pedido("2","2023-05-15");
        
        
        pd1.setCliente(cl1);
        pd1.setVendedor(vd1);
        pd2.setCliente(cl2);
        pd2.setVendedor(vd1);
        
        ItemPedido ip1 = new ItemPedido(1,1,pr1);
        ItemPedido ip2 = new ItemPedido(2,3,pr2);
        
        
        ItemPedido ip3 = new ItemPedido(1,1,pr3);
        ItemPedido ip4 = new ItemPedido(1,1,pr4);
        
        pd1.addItemPedido(ip1);
        pd1.addItemPedido(ip2);
        
        pd2.addItemPedido(ip3);
        pd2.addItemPedido(ip4);
        
        
    }
    
}
