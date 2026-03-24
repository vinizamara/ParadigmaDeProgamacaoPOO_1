import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    // Construtor
    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    // Método de composição
    public void construirApartamento(int num, int andar) {
        Apartamento ap = new Apartamento(num, andar);
        apartamentos.add(ap);
    }

    // Método para listar apartamentos
    public void listarApartamentos() {
        System.out.println("Edifício: " + nome);
        System.out.println("Endereço: " + endereco);

        if (apartamentos.isEmpty()) {
            System.out.println("Nenhum apartamento construído.");
        } else {
            for (Apartamento ap : apartamentos) {
                System.out.println(ap);
            }
        }
    }
}
