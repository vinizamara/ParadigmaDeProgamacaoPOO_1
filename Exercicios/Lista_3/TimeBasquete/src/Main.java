public class Main {
    public static void main(String[] args){
        Atleta atl1 = new Atleta(1, "Jeremias", "Ala");
        Atleta atl2 = new Atleta(2, "Roberto", "Armador");

        Time tim1 = new Time(1, "Bulls", "Ricardo");

        tim1.contratarAtleta(atl1);
        tim1.contratarAtleta(atl2);
        System.out.println("Time completo:" + tim1);

        tim1 = null;
        System.out.println("Time 1 anulado: " + tim1);

        System.out.println("Atleta 1 ainda existente: " + atl1);
        System.out.println("Atleta 2 ainda existente: " + atl2);
    }
}
