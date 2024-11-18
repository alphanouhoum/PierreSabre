package personnage;

public class Samourai extends Ronin {
	private String seigneur;
	
	
	public Samourai(String seigneur, String nom, String boisson, int quantiteArgent) {
		super(nom, boisson, quantiteArgent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur "+ seigneur);
	}
	
	
	
	public void boire(String boisson) {
		this.parler("Qu'est ce que je vais choisir comme boisson ? Tiens je vais prendre "+boisson);
	}

}
