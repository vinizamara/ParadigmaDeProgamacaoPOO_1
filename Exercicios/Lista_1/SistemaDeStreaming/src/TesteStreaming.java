public class TesteStreaming {
    public static void main(String[] args) {
        // Criando objeto
        Streaming conta1 = new Streaming("Teste", "Premium");

        // Exibindo dados iniciais
        System.out.println("=== Dados da Conta ===");
        System.out.println(conta1);

        // Testando método assistirFilme
        System.out.println("\n=== Assistindo Filme ===");
        conta1.assistirFilme("Interestelar");

        // Mostrando estado após assistir
        System.out.println("\n=== Dados Atualizados ===");
        System.out.println(conta1);

        // Cancelando assinatura
        System.out.println("\n=== Cancelando Assinatura ===");
        conta1.cancelarAssinatura();

        // Tentando assistir filme após cancelamento
        conta1.assistirFilme("Matrix");

        // Estado final
        System.out.println("\n=== Estado Final ===");
        System.out.println(conta1);
    }
}
