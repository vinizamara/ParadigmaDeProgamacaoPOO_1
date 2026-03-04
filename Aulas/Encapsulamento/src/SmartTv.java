public class SmartTv {
        private String marca, modelo;
        private int volume;

        //setter do volume (coloca um valor na variavel, recebe valor e não retorna nada)
        public void setVolume(int volume){
            if (volume >= 0 && volume <= 100){
                this.volume = volume;
            }
            else System.out.println("Volume inválido");
        }

        //get do volume (não recebe valor e retorna um valor)
        public int getVolume(){
            return this.volume;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public String getMarca(){
            return this.marca;
        }

        public void setModelo(String modelo){
            this.modelo = modelo;
        }

        public String getModelo(){
            return this.modelo;
        }

        public SmartTv(){

        }

        public SmartTv(String marca, String modelo, int volume){
            this.setMarca(marca);
            this.setModelo(modelo);
            this.setVolume(volume); // para não perder o encapsulamento
        }
}
