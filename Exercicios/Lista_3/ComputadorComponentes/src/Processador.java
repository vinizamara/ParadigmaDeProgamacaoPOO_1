public class Processador {
    private String marca;
    private String modelo;
    private double frequencia;

    // Construtor
    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    // toString
    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frequencia=" + frequencia + "GHz" +
                '}';
    }
}
