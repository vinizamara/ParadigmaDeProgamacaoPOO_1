public class TestarAcademico {
    public static void main(String[] args) {
        // Alunos independentes
        Aluno a1 = new Aluno(1, 2024001, "Carlos Silva", "Ciência da Computação");
        Aluno a2 = new Aluno(2, 2024002, "Mariana Souza", "Sistemas de Informação");

        // Disciplina
        Disciplina d1 = new Disciplina(101, "Programação Orientada a Objetos", "Prof. Ricardo");

        // Agregação
        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        // Composição
        d1.criarAvaliacao(1, "Prova Semestral");

        // Composição aninhada
        d1.getAvaliacoes().get(0).adicionarQuestao(1, "Explique o conceito de encapsulamento.", 2.0f);
        d1.getAvaliacoes().get(0).adicionarQuestao(2, "Diferencie herança de composição.", 3.0f);
        d1.getAvaliacoes().get(0).adicionarQuestao(3, "Implemente um exemplo usando polimorfismo.", 5.0f);

        // Exibir árvore de objetos
        System.out.println(d1);
    }
}
