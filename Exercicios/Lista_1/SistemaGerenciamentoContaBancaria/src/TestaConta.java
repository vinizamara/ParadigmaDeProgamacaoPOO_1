public class TestaConta {
    public static void main(String[] args){
        //Cria conta Jão Silva
        Conta c1 = new Conta(1, 1, "João Silva");

        //Realiza depósito de 500
        c1.depositar(500);

        //Realizar saque de 200 e imprima estado da conta
        c1.sacar(300);
        System.out.println(c1);

        //Criar conta Maria Souza e tentar sacar 50
        Conta c2 = new Conta(2, 2, "Maria Souza");
        c2.sacar(50);

        //Tentar encerrar conta com saldo
        c1.encerrarConta();

        //Sacar, encerrar conta e mostrar dados finais.
        c1.sacar(200);
        c1.encerrarConta();
        System.out.println(c1);


    }
}
