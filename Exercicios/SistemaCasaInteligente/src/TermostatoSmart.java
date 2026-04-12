//Método apenas para teste
import java.util.concurrent.ThreadLocalRandom; // Método para sortear valor de temperatura atual

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {

    @Override
    public void ligar() {
        System.out.println("Termostato Ligado!");
    }

    @Override
    public void desligar(){
        System.out.println("Termostato Desligado!");
    }

    @Override
    public double lerTemperatura(){
        double temperaturaAtual = ThreadLocalRandom.current().nextDouble(16, 30);

        //Método para deixar apenas duas casas no número
        double temperaturaAtualDuasCasas = Math.round(temperaturaAtual * 100.0) / 100.0;
        return temperaturaAtualDuasCasas;
    }
}
