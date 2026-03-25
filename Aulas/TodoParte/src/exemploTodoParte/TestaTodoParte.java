import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){
        //cria um objeto classe Cliente independente
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "1234", "Rua Chile");

        Produto pr1 = new Produto(100, "Mouse", "Mouse óptico", 180);

        Produto pr2 = new Produto(200, "Monitor", "WideScreen", 900);

        Produto pr3 = new Produto(300, "Gabinete", "caixa digital", 800000);

        //cria objeto-todo
        Pedido ped1 = new Pedido(10, new Date(), cl2);
        ped1.adicionaItemPedido(1000, 5, pr1);
        ped1.adicionaItemPedido(201, 2, pr2);
        ped1.adicionaItemPedido(3, 4, pr3);
        System.out.println(ped1.toString());
    }
}
