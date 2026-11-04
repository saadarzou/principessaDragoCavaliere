package principessaDragoCavaliere;

public class DragoSputaFuoco extends Drago {
    
    public DragoSputaFuoco(){
        super("Sputa fuoco");
    }

    public void lanciaAttacco(){
        System.out.println("il drago sputa fuoco! Con il potere micidiale: "+this.potereMicidiale);
    }

}