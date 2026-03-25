public class Junior extends Desenvolvedor{
    private String mentor;

    public Junior(){
        super(); // chama o constructor da super classe
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }
}
