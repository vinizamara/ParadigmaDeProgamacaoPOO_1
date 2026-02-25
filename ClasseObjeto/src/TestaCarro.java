// Por ser uma classe de teste, deve ter o void.
// Um programa copilado só ira funcionar se não possuir erros de sintaxe
// Quem copila e interpreta o programa é o JDK (Java Developers Kit)


public class TestaCarro {
    public void main(String[] args){
        // Instânciar objeto obj1
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Uno";
        obj1.velocidade = 0;
        obj1.motor = false;
        System.out.println(obj1); // Imprime o endereço de memória
        System.out.println(obj1.toString()); // Chama a função toString()
        Carro obj2 = new Carro();
        obj2.marca = "GM";
        obj2.modelo = "Onix";
        obj2.velocidade = 0;
        obj2.motor = false;
        System.out.println(obj2);
        System.out.println(obj2.toString());
    }
}

// Classes possuem variáveis e métodos (semelhantes a função)
