package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		
		System.out.println("\nClasse Humain\n");
		
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.println("\nClasse commenrcant\n");
		
		
		Commercant marco = new Commercant("Marco", 9);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("\nClasse Yakuza\n");
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		System.out.println("\nClasse Ronin\n");
		
		Ronin roco = new Ronin("Roco", "shoshu", 52);
		roco.direBonjour();
		roco.donner(marco);
		
		System.out.println("\nHistoire 3- Honneur, réputation et duel entre les Ronins et les Yakuza \n");
		
		roco.provoquer(yaku);
		
	}
	

}
