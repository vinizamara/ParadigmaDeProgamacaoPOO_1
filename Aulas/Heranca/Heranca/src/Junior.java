public class Junior extends Desenvolvedor{
    private String mentor;

    public Junior(){
        super(); // chama o constructor da super classe
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    //Utiliza-se Override para anulação de método
    @Override
    public void codar(){
        System.out.println("Junior desenvolvendo mentoria de " + this.mentor);
    }

    @Override
    public String toString(){
        return "Junior{" +
                super.toString() +
                " Mentor: " + mentor +
                "}";
    }
}
