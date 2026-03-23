import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Leitor leitor1 = new Leitor(1, "Roberto");
        Livro livro1 = new Livro(1, "Harry Poter", "Jeremias Gonçalves");

        LocalDateTime dataEmprestimo = LocalDateTime.of(2026, 4, 18, 8, 15);
        LocalDateTime dataDevolucao = LocalDateTime.of(2026, 5, 18, 8, 15);
        Emprestimo emprestimo1 = new Emprestimo(dataEmprestimo, dataDevolucao, livro1, leitor1);

        System.out.println("Emprestimo Realizado: " + emprestimo1);
    }
}
