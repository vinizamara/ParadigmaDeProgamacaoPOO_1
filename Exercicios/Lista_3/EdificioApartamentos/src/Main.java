public class Main {
    public static void main(String[] args) {

        Edificio edificio = new Edificio(
                "Residencial Sol Nascente",
                "Rua das Flores, 123"
        );

        // Construindo apartamentos (composição)
        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(102, 1);
        edificio.construirApartamento(201, 2);

        // Listando apartamentos
        edificio.listarApartamentos();
    }
}
