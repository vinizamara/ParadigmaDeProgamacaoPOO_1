public class Apartamento {
    private int numero;
    private int andar;

    // Construtor
    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    // toString
    @Override
    public String toString() {
        return "Apartamento{" +
                "numero=" + numero +
                ", andar=" + andar +
                '}';
    }
}
