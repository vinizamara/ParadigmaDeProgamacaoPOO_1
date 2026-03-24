public class Main {
    public static void main(String[] args) {

        Computador pc = new Computador(
                1,
                "Dell",
                "Intel",
                "i7-12700K",
                3.6
        );

        pc.exibirComputador();

        // Quando 'pc' deixar de existir, o processador também deixa
        pc = null;

        System.out.println("\nComputador removido da memória.");
    }
}
