package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Yakuza;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		
		Commercant marco = new Commercant("Marco", 9);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku Le noir", "whisky", 30, "les noirs");
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
	

}
