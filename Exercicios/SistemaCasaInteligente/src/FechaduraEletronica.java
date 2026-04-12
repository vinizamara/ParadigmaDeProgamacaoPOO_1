public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    @Override
    public void validarAcesso(String senha) {
        if (senha == "senhaCorreta"){
            System.out.println("Senha Correta.");
            this.ligar();
        }
        else{
            System.out.println("Senha Incorreta.");
            this.desligar();
        }
    }

    @Override
    public void ligar() {
        System.out.println("Fechadura Destrancada!");
    }

    @Override
    public void desligar() {
        System.out.println("Fechadura Trancada!");
    }
}
