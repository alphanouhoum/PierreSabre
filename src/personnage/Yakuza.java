package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int quantiteArgent, String clan) {
		super(nom, boisson, quantiteArgent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + " , si tu tiens à la vie donne moi ta bourse !");
		int argentVictime = victime.getQuantiteArgent();
		quantiteArgent+= argentVictime;
		victime.seFaireExtorquer();
		reputation++;
		
		this.parler("J'ai pique les "+argentVictime+" sous de "+victime.getNom()+" , ce qui me fait "
				+quantiteArgent+ " sous dans ma poche. Hi ! Hi !");
	}

}
