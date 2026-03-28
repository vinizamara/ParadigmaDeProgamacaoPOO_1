public class Aviao extends Veiculo{
    private float altitudeMax;

    public Aviao(){
        super();
    }

    public Aviao(String marca, String modelo, float velocidade, int altitudeMax){
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "Veiculo=" + super.toString() +
                "altitudeMax=" + altitudeMax +
                '}';
    }

    @Override
    public void mover(){
        System.out.println("Avião voando a " + this.getVelocidade() + " km/h e " + this.getAltitudeMax() + " metros.");
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
    }
}
