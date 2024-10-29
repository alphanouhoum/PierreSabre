package personnage;

public class Commercant extends Humain {
	
	public Commercant(String nom, int quantitArgent) {
		super(nom, "thé", quantitArgent);
	}
	
	public int seFaireExtorquer(){
		int argentExtorquer = quantiteArgent;
		quantiteArgent = 0;
		this.parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentExtorquer; 
	}
	
	public void recevoir(int argent) {
		quantiteArgent+= argent;
		this.parler(argent+" sous ! Je te remercie genereux donateur!");
	}
	

}
