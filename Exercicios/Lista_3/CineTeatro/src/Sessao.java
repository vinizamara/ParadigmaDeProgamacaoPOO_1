import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    // AGREGAÇÃO
    private Filme filme;

    // COMPOSIÇÃO
    private ArrayList<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // Agregação
    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    // Composição
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    // Exibir dados da sessão
    public void exibirSessao() {

        // FORMATADOR DE DATA
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

        System.out.println("Sessão ID: " + id);
        System.out.println("Sala: " + sala);
        System.out.println("Horário: " + horario.format(formatter));

        System.out.println("\nFilme:");
        System.out.println(filme);

        System.out.println("\nIngressos vendidos:");
        if (ingressos.isEmpty()) {
            System.out.println("Nenhum ingresso vendido.");
        } else {
            for (Ingresso i : ingressos) {
                System.out.println(i);
            }
        }
    }
}