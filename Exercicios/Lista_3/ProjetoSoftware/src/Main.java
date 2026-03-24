public class Main {
    public static void main(String[] args) {

        // Criando programadores
        Programador p1 = new Programador(1, "Vinicius", "Java");
        Programador p2 = new Programador(2, "Ana", "Python");
        Programador p3 = new Programador(3, "Carlos", "JavaScript");

        // Criando projeto
        Projeto projeto = new Projeto(1, "Sistema de Gestão");

        // Adicionando programadores ao projeto
        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);
        projeto.adicionarProgramador(p3);

        // Listando programadores do projeto
        projeto.listarProgramadores();
    }
}
