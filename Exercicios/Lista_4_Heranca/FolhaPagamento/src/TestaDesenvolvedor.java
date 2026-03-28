public class TestaDesenvolvedor {
    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }

    public static void main(String[] args){
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        //jr1.codar();
        //System.out.println(jr1.toString() + " Bônus " + jr1.calcularBonus());
        exibir(jr1);

        Pleno pl1 = new Pleno("Beltrano", "Java", 6000, 5);
        exibir(pl1);

        Senior sr1 = new Senior("Ciclano", "Java", 8000, 2000);
        exibir(sr1);

        Desenvolvedor[] desenvolvedores = new Desenvolvedor[4];

        desenvolvedores[0] = jr1;
        desenvolvedores[1] = pl1;
        desenvolvedores[2] = sr1;
        desenvolvedores[3] = new Desenvolvedor("Ricardo", "JavaScript", 4000);


        System.out.println("\n --- Segue vetor com desenvolvedores: \n");
        /*Usando for:
        for (int i = 0; i < desenvolvedores.length; i++){
            desenvolvedores[i].codar();
            System.out.println("Resultado do método calcular bônus:" + desenvolvedores[i].calcularBonus());
            System.out.println(desenvolvedores[i].toString() + "\n");
        }
        */

        //Usando forEach:
        //Para cada desenvolvedor em desenvolvedores
        for (Desenvolvedor desenvolvedor : desenvolvedores){
            desenvolvedor.codar();
            System.out.println("Resultado do método calcular bônus:" + desenvolvedor.calcularBonus());
            System.out.println(desenvolvedor.toString() + "\n");
        }
    }
}
