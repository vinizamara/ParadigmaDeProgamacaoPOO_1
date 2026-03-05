public class TestarSmartTv {

    public static void main(String[] args){
        // cria uma instância de SmartTv
        SmartTv s1 = new SmartTv();
        s1.setVolume(-40);
        s1.setVolume(130);
        s1.setVolume(30);
        System.out.println("Volume de s1: " + s1.getVolume());

        SmartTv s2 = new SmartTv("Samsung", "Qled de 45 polegadas", 0);

        SmartTv s3 = new SmartTv("LG", "WideScreen", -30);

        s1.setMarca("Teste");
        System.out.println(s1.getMarca());
        s1.setModelo("Teste2");
        System.out.println(s1.getModelo());

        s1.setConectadaInternet(true);
        System.out.println(s1.isConectadaInternet());
        s1.abrirYoutube();

        s2.aumentarVolume(100);
        s2.diminuirVolume(60);
    }
}
