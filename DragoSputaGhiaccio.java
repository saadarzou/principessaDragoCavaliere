package principessaDragoCavaliere;

public class DragoSputaGhiaccio extends Drago {
    
    public DragoSputaGhiaccio(){
        super("Sputa ghiaccio");
    }

    public void lanciaAttacco(){
        System.out.println("il drago sputa ghiaccio! Con il potere micidiale: "+this.potereMicidiale);
    }
}