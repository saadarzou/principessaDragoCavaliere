package principessaDragoCavaliere;

public abstract class Drago {
    
    protected  String  potereMicidiale;
    
    public Drago(String potereMicidiale){
        this.potereMicidiale=potereMicidiale;
    }



    public abstract void lanciaAttacco();
}
