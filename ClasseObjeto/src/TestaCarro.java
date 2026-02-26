// Por ser uma classe de teste, deve ter o void.
// Um programa copilado só ira funcionar se não possuir erros de sintaxe
// Quem copila e interpreta o programa é o JDK (Java Developers Kit)


public class TestaCarro {
    public static void main(String[] args){
        // Instânciar objeto objeto 1
        Carro obj1 = new Carro("Fiat", "Uno", 0, false);
        System.out.println(obj1.toString()); // Chama a função toString()
        obj1.desligar();
        System.out.println(obj1.toString());
        obj1.ligar();
        System.out.println(obj1.toString());

        // Instância objeto 2 com um método construtor
        Carro obj2 = new Carro("GM", "Onix", 27, true);
        System.out.println(obj2.toString());
        obj2.ligar();
        System.out.println(obj2.toString());
        obj2.desligar();
        System.out.println(obj2.toString());


        obj2.desligar();

        obj1.acelerar(60);
        obj1.acelerar(60);
        obj1.frear(60);
        obj1.frear(60);
    }
}

// Classes possuem variáveis e métodos (semelhantes a função)
