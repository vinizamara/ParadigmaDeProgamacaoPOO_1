public class Placar {
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;

    public Placar (String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo){
        if (tipo < 1 || tipo > 3){
            System.out.println("Tipo de ponto inválido!");
            return;
        }
        else if (time.equalsIgnoreCase("Casa")){
            this.pontosCasa += tipo;
        }
        else if (time.equalsIgnoreCase("Visitante")) {
            this.pontosVisitante += tipo;
        }
    }

    public void proximoQuarto(){
        if (this.periodoQuarto == 4){
            System.out.println("Fim de Jogo!");
            return;
        }
        else{
            this.periodoQuarto += 1;
        }
    }

    public String toString() {
        return nomeTimeCasa + " [" + pontosCasa + "] x [" + pontosVisitante + "] "
                + nomeTimeVisitante + " - Período: " + periodoQuarto;
    }
}
