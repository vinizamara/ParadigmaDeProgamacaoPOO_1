public class Main {
    public static void main(String[] args){
        FechaduraEletronica fechadura = new FechaduraEletronica();

        //Quando insere senha incorreta
        fechadura.validarAcesso("senhaIncorreta");

        //Quando inseri senha correta
        fechadura.validarAcesso("senhaCorreta");

        TermostatoSmart termostato = new TermostatoSmart();

        termostato.ligar();
        System.out.println("A temperatura atual do termostato é "+termostato.lerTemperatura()+" °C");
        System.out.println("A temperatura atual do termostato é "+termostato.lerTemperatura()+" °C");
        termostato.desligar();
    }
}
