package personnage;

import java.util.Iterator;

public class Humain {
	private String nom;
	private String boisson;
	private int quantiteArgent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];
	
	
	
	
	
	
	
	public Humain(String nom, String boisson, int quantiteArgent) {
		this.nom = nom;
		this.boisson = boisson;
		this.quantiteArgent = quantiteArgent;
	}
	
	public void setQuantiteArgent(int quantiteArgent) {
		this.quantiteArgent = quantiteArgent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	
	
	
	protected void parler(String texte) {
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
	
	protected void gagnerArgent(int gain) {
		
		quantiteArgent += gain;
		
	}
	
	protected void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
		
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		repondre(autreHumain);
		autreHumain.memoriser(this);
		this.memoriser(autreHumain);
	}
	
	public void listeConnaissance() {
		this.parler("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			System.out.println(memoire[i].getNom()+ ", ");
		}
	}
	


	
	
	
	
	
	
	
	

}
