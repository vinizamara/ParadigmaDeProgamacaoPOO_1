import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // Associação Todo-Parte
    private ArrayList<ItemPedido> itensPedido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                ", itens do pedido=" + itensPedido +
                '}';
    }

    public Pedido() {
    }

    //O cliente veio pronto mostrando a sua independência do Pedido
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensPedido = new ArrayList<>();
    }

    // Adiciona um item de pedido no vetor ou no pedido
    public void adicionaItemPedido (int id, float qtde, Produto produto){
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        this.itensPedido.add(aux);
        System.out.println("Item do pedido adicionado com sucesso");
    }

    //Não finalizado
    public float calculaTotalPedido(){
        // para cada itemPedido
        float soma = 0;
        for(ItemPedido ip : this.itensPedido){
            soma += ip.getQtde() * ip.getProduto().getPreco();
        }
        return soma;
    }
}
