package personnage;

public class Humain {
	private String nom;
	private String boisson;
	protected int quantiteArgent;
	
	
	
	
	
	public Humain(String nom, String boisson, int quantiteArgent) {
		this.nom = nom;
		this.boisson = boisson;
		this.quantiteArgent = quantiteArgent;
	}
	public String getNom() {
		return nom;
	}
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	
	
	
	public void parler(String texte) {
		System.out.println("("+nom+") - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle "+nom+ " et j'aime boire du " + boisson+ ".");
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de "+ boisson + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(prix > quantiteArgent) {
			this.parler("Je n'ai plus que "+ quantiteArgent+" sous en poche. "
					+ "Je ne peux meme pas m'offrir un "+ bien+" a "+prix +" sous");
	
		}else {
			this.parler("J'ai "+quantiteArgent+" sous en poche. "
					+ "Je vais pouvoir m'offrir " +bien + " a "+ prix+" sous");
			this.perdreArgent(prix);
			
		}
		
	}
	
	private void gagnerArgent(int gain) {
		
		quantiteArgent += gain;
		
	}
	
	private void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}
	

	
	
	
	
	
	
	
	

}
