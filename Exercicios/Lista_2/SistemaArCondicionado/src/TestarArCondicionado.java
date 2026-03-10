public class TestarArCondicionado {
    public static void main(String[] args) {
        // Teste com construtor vazio
        ArCondicionado ar1 = new ArCondicionado();
        ar1.setMarca("LG");
        ar1.setMarca("Samsung");
        ar1.setModelo("WindFree");
        ar1.setTemperatura(22);
        ar1.setLigado(true);

        System.out.println("Dados do ar1:");
        System.out.println(ar1);

        System.out.println("\nTentando colocar temperatura inválida:");
        ar1.setTemperatura(35);

        System.out.println("\nAtivando modo turbo no ar1:");
        ar1.ativarModoTurbo();
        System.out.println(ar1);

        // Teste com construtor cheio
        ArCondicionado ar2 = new ArCondicionado("Consul", "FrioMax", 24, false);

        System.out.println("\nDados do ar2:");
        System.out.println(ar2);

        System.out.println("\nAtivando modo turbo no ar2:");
        ar2.ativarModoTurbo();
        System.out.println(ar2);
    }
}
