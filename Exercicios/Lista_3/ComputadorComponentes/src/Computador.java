public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    // Construtor (COMPOSIÇÃO ACONTECE AQUI)
    public Computador(int id, String marca,
                      String marcaProcessador,
                      String modeloProcessador,
                      double frequencia) {

        this.id = id;
        this.marca = marca;

        // O processador é criado DENTRO do computador
        this.processador = new Processador(
                marcaProcessador,
                modeloProcessador,
                frequencia
        );
    }

    // Método para exibir dados
    public void exibirComputador() {
        System.out.println("Computador ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println(processador);
    }
}