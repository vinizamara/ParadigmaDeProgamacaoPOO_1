public class Main {
    public static void main(String[] args){
        //Criar Instâncias
        Veiculo vei1 = new Veiculo("Ford", "Ford KA", 200);
        Aviao avi1 = new Aviao("Gol", "Boing", 3000, 200);
        CarroEletrico carEle1 = new CarroEletrico("BYD", "BYD 207", 150, 20);

        //Crie uma variável do tipo Veiculo e faça-a apontar para um Aviao. Chame o método mover().
        Veiculo vei2 = new Aviao("Azul", "234", 20000, 3000);
        vei2.mover();

        //Mude a mesma variável para apontar para um CarroEletrico. Chame o método mover() novamente.
        vei2 = new CarroEletrico("BYD", "BYD 207", 150, 20);
        vei2.mover();
    }
}
