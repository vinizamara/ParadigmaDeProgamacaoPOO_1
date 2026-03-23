import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo, dataDevolucaoPrevista;
    private Livro livro;
    private Leitor leitor;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista, Livro livro, Leitor leitor) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.livro = livro;
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy ' às ' HH 'h' mm");
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo.format(dataFormatada) +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista.format(dataFormatada) +
                ", Titulo do livro=" + livro.getTitulo() +
                ", leitor=" + leitor +
                '}';
    }
}
