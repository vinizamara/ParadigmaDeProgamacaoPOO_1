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
                " Velocidade " + this.velocidade +
                " Motor: " + this.motor;
    }
}


