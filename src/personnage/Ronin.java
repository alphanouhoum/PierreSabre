package personnage;

import java.lang.reflect.Constructor;

public class Ronin extends Humain{
	private int honneur = 1;
	
	

	public Ronin(String nom, String boisson, int quantiteArgent) {
		super(nom, boisson, quantiteArgent);
	}




	public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (0.1*quantiteArgent);
		beneficiaire.quantiteArgent += argentDonner;
		this.parler(beneficiaire.getNom()+"prend ces "+argentDonner+" sous.");
		beneficiaire.parler(argentDonner+" sous ! Je te remercie généreux donateur! ");
	}
	
}
