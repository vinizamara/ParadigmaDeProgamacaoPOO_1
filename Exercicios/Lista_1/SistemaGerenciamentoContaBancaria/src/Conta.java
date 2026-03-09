public class Conta {
    public int numeroConta, agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
        System.out.println("Conta criada com sucesso!");
    }

    public void depositar(float valor){
        if (this.status){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + ", realizado. Seu saldo atual é R$" + this.saldo);
        }
        else{
            System.out.println("Não foi possivel realizar o depósito pois a conta não está ativada.");
        }
    }

    public void sacar(float valor){
        if (this.status){
            if (valor <= this.saldo){
                this.saldo -= valor;
                System.out.println("Saque de R$"+valor+" realizado. Você possui R$"+this.saldo+" de saldo.");
            }
            else{
                System.out.println("Não foi possivel realizar o saque pois a conta não possui R$"+valor+" de saldo.");
            }
        }
        else{
            System.out.println("Não foi possivel realizar o saque pois a conta não está ativada.");
        }
    }

    public void encerrarConta(){
        if (this.saldo == 0){
            this.status = false;
            System.out.println("A conta foi encerrada.");
        }
        else{
            System.out.println("Não foi possivel encerrar a conta pois a mesma ainda " +
                    "possui R$" + this.saldo +" de saldo. Saque o dinheiro antes de tentar encerrar.");
        }
    }

    public String toString(){
        return " Numero Conta: " + numeroConta +
                " / Agência: " + agencia +
                " / Nome Cliente: " + nomeCliente +
                " / Saldo: " + saldo +
                " / Status: " + status;
    }
}
