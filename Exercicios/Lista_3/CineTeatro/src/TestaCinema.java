import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {

        // Criando filmes (independentes)
        Filme f1 = new Filme(1, "Batman", "Ação", 180);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 155);

        // Criando sessão
        LocalDateTime horario = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao = new Sessao(1, horario, 1);

        // Agregação
        sessao.vincularFilme(f1);

        // Composição (venda de ingressos)
        sessao.venderIngresso(1, "A1", "Inteira", 30.0f);
        sessao.venderIngresso(2, "A2", "Meia", 15.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 30.0f);

        // Exibir dados
        sessao.exibirSessao();
    }
}
