public class Leitor {
    private int id;
    private String nome;

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Leitor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
