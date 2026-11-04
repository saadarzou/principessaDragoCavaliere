package principessaDragoCavaliere;


public class Cavaliere {
    
    private String nome;

    public Cavaliere(String nome){
        this.nome=nome;
    }

    public void cacciaDrago(){
        System.out.println("Il cavaliere "+nome+" va a caccia del drago!");
    }


}