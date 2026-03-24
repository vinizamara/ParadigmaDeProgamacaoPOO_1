import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    // Construtor
    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    // Método para adicionar programador
    public void adicionarProgramador(Programador p) {
        programadores.add(p);
    }

    // Método para listar programadores
    public void listarProgramadores() {
        System.out.println("Programadores do projeto: " + nomeProjeto);

        if (programadores.isEmpty()) {
            System.out.println("Nenhum programador alocado.");
        } else {
            for (Programador p : programadores) {
                System.out.println(p);
            }
        }
    }
}
