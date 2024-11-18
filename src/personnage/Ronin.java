package personnage;

public class Ronin extends Humain{
	private int honneur = 1;
	
	

	public Ronin(String nom, String boisson, int quantiteArgent) {
		super(nom, boisson, quantiteArgent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (0.1*this.getQuantiteArgent());
		beneficiaire.setQuantiteArgent((beneficiaire.getQuantiteArgent()+argentDonner));
		this.parler(beneficiaire.getNom()+" prend ces "+argentDonner+" sous.");
		beneficiaire.parler(argentDonner+" sous ! Je te remercie genereux donateur! ");
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		
		
		
		if (force >= adversaire.reputation) {
			this.parler("Je t'ai retrouver vermine, tu vas payer pour ce"
					+ " que tu as fait a  ce pauvre marchand!");
			this.parler("Je t'ai eu petit yakusa!");
			int argentPerduAdversaire = adversaire.perdre();
			
			this.setQuantiteArgent(argentPerduAdversaire + this.getQuantiteArgent());
			honneur++;
		}else {
			honneur--;
			this.parler("J'ai perdu contre ce yakuza, mon honneur "
					+ "et ma bourse ont en pris un coup");
			
			adversaire.gagner(this.getQuantiteArgent());
			
			
			
		}
		
	}
	
}
