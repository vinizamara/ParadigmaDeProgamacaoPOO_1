public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    // Construtor padrão
    public ArCondicionado() {
    }

    // Construtor com parâmetros usando setters
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        setModelo(modelo);
        setTemperatura(temperatura);
        setLigado(ligado);
    }

    // Setter da marca
    public void setMarca(String marca) {
        if (marca != null && marca.length() >= 3) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida");
        }
    }

    // Getter da marca
    public String getMarca() {
        return marca;
    }

    // Setter do modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter do modelo
    public String getModelo() {
        return modelo;
    }

    // Setter da temperatura
    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    // Getter da temperatura
    public int getTemperatura() {
        return temperatura;
    }

    // Setter de ligado
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Getter de ligado
    public boolean isLigado() {
        return ligado;
    }

    // Método público
    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            this.setTemperatura(16);
            System.out.println("Modo turbo ativado com sucesso.");
        } else {
            System.out.println("Falha técnica no compressor. Modo turbo não ativado.");
        }
    }

    // Método privado
    private boolean verificarCompressor() {
        double numero = Math.random() * 10;
        return numero > 2;
    }

    @Override
    public String toString() {
        return "ArCondicionado {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + (ligado ? "Sim" : "Não") +
                '}';
    }
}
