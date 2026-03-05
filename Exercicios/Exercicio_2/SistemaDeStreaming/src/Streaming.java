public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;

        if (this.plano == "Básico"){
            this.mensalidade = 25.90F;
        }
        else if (this.plano == "Premium") {
            this.mensalidade = 45.90F;
        }
        else if (this.plano == "Família") {
            this.mensalidade = 60.90F;
        }
        else{
            System.out.println("Plano com valor inválido, só é aceito: Básico, Premium ou Família");
            return;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }
}
