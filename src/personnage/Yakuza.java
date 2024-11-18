package personnage;

public class Yakuza extends Humain {
	private String clan;
	public int reputation = 0;
	
	public Yakuza(String nom, String boisson, int quantiteArgent, String clan) {
		super(nom, boisson, quantiteArgent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		this.parler(victime.getNom() +" , si tu tiens a la vie donne moi ta bourse !");
		int argentVictime = victime.getQuantiteArgent();
		this.setQuantiteArgent(this.getQuantiteArgent() +argentVictime);
		victime.seFaireExtorquer();
		reputation++;
		
		this.parler("J'ai pique les "+argentVictime+" sous de "+victime.getNom()+" , ce qui me fait "
				+this.getQuantiteArgent()+ " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentPerdu = this.getQuantiteArgent();
		this.setQuantiteArgent(0);
		reputation--;
		this.parler("J'ai perdu mon duel et mes "+argentPerdu+ " sous, snif... "
				+ "J'ai desonorer le clan de "+clan);
		return argentPerdu;
	}
	
	public void gagner(int gain){
		this.setQuantiteArgent(this.getQuantiteArgent() + gain);
		reputation++;
		this.parler("- Ce ronin pensait vraiment battre "
				+this.getNom()+ " du clan de "+clan+" ? \nJe l'ai depouiller de ses " +gain+" sous" );
			
	}
	
	@Override
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est de "+clan);
	}
	
	
	
	

}
