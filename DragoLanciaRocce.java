package principessaDragoCavaliere;

public class DragoLanciaRocce extends Drago {
    
    public DragoLanciaRocce(){
        super("Lancia Roccia");
    }

    public void lanciaAttacco(){
        System.out.println("il drago lancia rocce! Con il potere micidiale: "+this.potereMicidiale);
    }
}