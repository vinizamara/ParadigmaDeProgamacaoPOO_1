public class Main {
    public static void main(String[] args) {

        // Produtos (existem independente)
        Produto p1 = new Produto(1, "Arroz", 25.0);
        Produto p2 = new Produto(2, "Feijão", 10.0);
        Produto p3 = new Produto(3, "Leite", 6.5);

        // Cliente (independente)
        Cliente cliente = new Cliente(1, "Vinicius");

        // Venda
        Venda venda = new Venda(1, cliente);

        // Adicionando itens (COMPOSIÇÃO)
        venda.adicionarItem(1, 2, p1);
        venda.adicionarItem(2, 3, p2);
        venda.adicionarItem(3, 5, p3);

        // Exibir venda
        venda.exibirVenda();
    }
}
