package principessaDragoCavaliere;

public class Main {
    public static void main(String[] args){

        Principessa principessa=new Principessa("Yasmin");
        Cavaliere cavaliere= new Cavaliere("Aladin");

        DragoSputaFuoco drago1= new DragoSputaFuoco();
        DragoSputaGhiaccio drago2= new DragoSputaGhiaccio();
        DragoLanciaRocce drago3=new DragoLanciaRocce();

        principessa.richiediAiuto();
        cavaliere.cacciaDrago();

        drago1.lanciaAttacco();
     

        drago2.lanciaAttacco();
 

        drago3.lanciaAttacco();


    }
}