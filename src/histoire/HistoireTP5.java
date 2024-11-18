package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin =  new Commercant("Chonin", 40);
		Commercant kumi =  new Commercant("Kumi", 10); 
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong"); 
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		System.out.println("Les humains ont une m�moire\n");
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
	
		marco.listeConnaissance();
		roro.listeConnaissance();
		yaku.listeConnaissance();
		
		System.out.println("Le yakuza est fier de son clan\n");
		
		yaku.direBonjour();
		
		
		
		
		
	}
	
	

}