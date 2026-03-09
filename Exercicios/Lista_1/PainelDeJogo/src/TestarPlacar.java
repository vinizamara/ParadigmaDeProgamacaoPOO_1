public class TestarPlacar {

    public static void main(String[] args) {

        // Criando o placar
        Placar jogo = new Placar("Lakers", "Bulls");

        // Placar inicial
        System.out.println("=== Início do jogo ===");
        System.out.println(jogo);

        // Registrando pontos
        jogo.registrarPonto("Casa", 2);
        jogo.registrarPonto("Visitante", 3);
        jogo.registrarPonto("Casa", 1);

        System.out.println("\n=== Após algumas jogadas ===");
        System.out.println(jogo);

        // Próximo quarto
        jogo.proximoQuarto();
        System.out.println("\n=== Início do 2º quarto ===");
        System.out.println(jogo);

        // Mais pontos
        jogo.registrarPonto("Visitante", 2);
        jogo.registrarPonto("Visitante", 2);
        jogo.registrarPonto("Casa", 3);

        System.out.println("\n=== Placar atualizado ===");
        System.out.println(jogo);

        // Avançando quartos
        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto();

        System.out.println("\n=== Estado final ===");
        System.out.println(jogo);
    }
}