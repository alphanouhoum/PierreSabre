package personnage;

public class Commercant extends Humain {
	
	public Commercant(String nom, int quantitArgent) {
		super(nom, "thé", quantitArgent);
	}
	
	public int seFaireExtorquer(){
		int argentExtorquer = this.getQuantiteArgent();
		this.setQuantiteArgent(0);
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentExtorquer; 
	}
	
	public void recevoir(int argent) {
		this.setQuantiteArgent(argent + this.getQuantiteArgent() );
		this.parler(argent+" sous ! Je te remercie genereux donateur!");
	}
	

}
