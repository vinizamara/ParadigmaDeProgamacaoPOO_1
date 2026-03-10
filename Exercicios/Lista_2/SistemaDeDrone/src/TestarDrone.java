public class TestarDrone {

    public static void main(String[] args) {

        Drone d1 = new Drone();

        d1.setCodigo("DRN001");
        d1.setBateria(50);
        d1.setAltura(0);

        System.out.println("Estado inicial do drone:");
        System.out.println(d1);

        System.out.println("\nTentando decolar...");
        d1.decolar();

        System.out.println("\nSubindo 10 metros...");
        d1.subir(10);

        System.out.println("\nDescendo 5 metros...");
        d1.descer(5);

        System.out.println("\nEstado final do drone:");
        System.out.println(d1);

        System.out.println("\nTentando definir altura inválida:");
        d1.setAltura(150);
    }
}
