// "public" é a visibilidade que, no caso de uma classe, deve ser sempre pública
// Classes devem ter primeira letra em maiusculo, além disso, uma classe pública deve ter o mesmo nome do arquivo

public class Carro{
    // Uma classe possui váriaveis, popriedades ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é um tipo de dado que é primitivo
    public boolean motor; // boolean é um tipo de dado primitivo

    // Método que converte objeto em String
    public String toString(){
        // this representa um objeto que chama o método
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }

    // Método contrutor (deve ter o mesmo nome da classe)
    public Carro(String marca, String modelo, float velocidade, boolean motor){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    // Método Ligar Motor
    // É necessário colocar o void nesse método, pois o mesmo não retorna um valor
    public void ligar(){
        if (!this.motor){
            this.motor = true;
            System.out.println("Motor Ligado!");
        }
        else{
            System.out.println("O motor já está ligado!");
        }
    }

    public void desligar(){
        if (this.motor){
            this.motor = false;
            System.out.println("Motor Desligado!");
        }
        else{
            System.out.println("O motor já está desligado!");
        }
    }

    // Acelerar carro em um valor x
    public void acelerar(float x){
        if (this.motor){
            this.velocidade += x;
            System.out.println("O carro acelerou, nova velocidade: " + this.velocidade);
        }
        else{
            System.out.println("O carro precisa estar ligado para acelerar");
        }
    }

    public void frear(float x){
        if (this.motor && this.velocidade - x >= 0){
            this.velocidade -= x;
            System.out.println("O carro freou, nova velocidade: " + this.velocidade);
        }
        else{
            System.out.println("O carro precisa estar ligado para frear");
        }
    }
}


