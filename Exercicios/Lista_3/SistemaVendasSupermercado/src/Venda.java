import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente; // AGREGAÇÃO
    private ArrayList<ItemVenda> itens; // COMPOSIÇÃO

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Método de composição (cria o ItemVenda dentro da Venda)
    public void adicionarItem(int idItem, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(idItem, quantidade, produto);
        itens.add(item);
    }

    // Calcular total da venda
    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    // Exibir venda
    public void exibirVenda() {
        System.out.println("Venda ID: " + id);
        System.out.println("Cliente: " + cliente.getNome());

        System.out.println("\nItens da venda:");
        for (ItemVenda item : itens) {
            System.out.println(item);
        }

        System.out.println("\nTotal: " + calcularTotal());
    }
}
