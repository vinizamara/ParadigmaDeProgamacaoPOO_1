import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    // Agregação: recebe um aluno já existente
    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    // Composição: cria a avaliação dentro da disciplina
    public void criarAvaliacao(int id, String nome) {
        Avaliacao avaliacao = new Avaliacao(id, nome);
        this.avaliacoes.add(avaliacao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Disciplina{id=").append(id)
                .append(", nome='").append(nome).append('\'')
                .append(", professor='").append(professor).append('\'')
                .append("\n\nAlunos:\n");

        for (Aluno a : alunos) {
            sb.append(" - ").append(a).append("\n");
        }

        sb.append("\nAvaliacoes:\n");
        for (Avaliacao av : avaliacoes) {
            sb.append(av).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}
