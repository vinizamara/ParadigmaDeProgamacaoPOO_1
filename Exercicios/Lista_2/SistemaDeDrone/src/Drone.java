public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    // Construtor padrão
    public Drone() {
    }

    // Construtor completo
    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        setCodigo(codigo);
        setAltura(altura);
        setBateria(bateria);
        setEmVoo(emVoo);
    }

    // Getter e Setter codigo
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    // Setter altura com regra
    public void setAltura(float altura) {
        if (altura >= 0 && altura <= 120) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. O drone deve estar entre 0 e 120 metros.");
        }
    }

    public float getAltura() {
        return altura;
    }

    // Setter bateria com regra
    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Bateria inválida. Valor deve estar entre 0 e 100.");
        }
    }

    public int getBateria() {
        return bateria;
    }

    // Setter emVoo
    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    // Método público decolar
    public void decolar() {

        if (bateria <= 20) {
            System.out.println("Bateria insuficiente para decolar.");
            return;
        }

        if (testarMotores()) {
            emVoo = true;
            setAltura(2);
            System.out.println("Drone decolou com sucesso.");
        } else {
            System.out.println("Falha nos motores. Decolagem cancelada.");
        }
    }

    // Método privado testar motores
    private boolean testarMotores() {

        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        double numero = Math.random() * 10;

        return numero < 8;
    }

    // Métodos de voo
    public void subir(float x) {
        if (emVoo) {
            setAltura(this.altura + x);
        } else {
            System.out.println("O drone precisa estar em voo para subir.");
        }
    }

    public void descer(float x) {
        if (emVoo) {
            setAltura(this.altura - x);
        } else {
            System.out.println("O drone precisa estar em voo para descer.");
        }
    }

    @Override
    public String toString() {
        return "Drone {" +
                "codigo='" + codigo + '\'' +
                ", altura=" + altura +
                ", bateria=" + bateria + "%" +
                ", emVoo=" + (emVoo ? "Sim" : "Não") +
                '}';
    }
}
