public class SmartTv {
        private String marca, modelo;
        private int volume;
        private boolean conectadaInternet;

        //setter do volume (coloca um valor na variavel, recebe valor e não retorna nada)
        public void setVolume(int volume){
            if (volume >= 0 && volume <= 100){
                this.volume = volume;
                System.out.println("Volume alterado para "+this.volume);
            }
            else System.out.println("Volume inválido");
        }

        //Aumentar volume
        public void aumentarVolume(int x){
            this.setVolume(this.volume + x);
        }

        //Diminuir volume
        public void diminuirVolume(int x){
            this.setVolume(this.volume - x);
        }

        //get do volume (não recebe valor e retorna um valor)
        public int getVolume(){
            return this.volume;
        }

        public void setMarca(String marca){
            if (marca.length() <= 30){
                this.marca = marca;
            }
            else{
                System.out.println("Marca inválida!");
            }
        }

        public String getMarca(){
                return this.marca;
        }

        public void setModelo(String modelo){
            //Todo modelo deve começar com a primeira letra maiúscula
            char primeiro = modelo.charAt(0);
            boolean response = Character.isUpperCase(primeiro);
            if (response){
                this.modelo = modelo;
            }
            else{
                System.out.println("Atenção, todo modelo deve começar com a letra maiuscula");
            }
        }

        public String getModelo(){
            return this.modelo;
        }

        public void setConectadaInternet(boolean conectadaInternet){
            this.conectadaInternet = conectadaInternet;
        }
        public boolean isConectadaInternet(){
            return this.conectadaInternet;
        }

        //abrir youtube
        public void abrirYoutube(){
            //verifica se tem internet
            if (this.conectaInternet()){
                System.out.println("Abrindo Youtube");
            }
            else System.out.println("Youtube não pode ser aberto, estamos sem internet");
        }
        private boolean conectaInternet(){
            System.out.println("Buscando sinal de wifi");
            System.out.println("Verificando credenciais");
            System.out.println("Autenticando IP no roteador");
            //50% de chance de conectar e 50% de chance de não conectar
            int randomico = (int) (Math.random() * 10);
            if (randomico < 5){
                System.out.println("Conectou na internet");
                return true;
            }
            else{
                System.out.println("Problema na conexão");
                return false;
            }
        }

        public SmartTv(){

        }

        public SmartTv(String marca, String modelo, int volume){
            this.setMarca(marca);
            this.setModelo(modelo);
            this.setVolume(volume); // para não perder o encapsulamento
            this.conectadaInternet = false;
        }
}
