package histoire;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ScenarioCasDegrade {
    public static void main(String[] args) {
        Gaulois gaulois = new Gaulois("Gaulois", 10);
        Etal etal = new Etal();
        etal.occuperEtal(gaulois, "menhirs", 10);
        etal.acheterProduit(10, null);
        try {
            etal.acheterProduit(-1, gaulois);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Etal etal2 = new Etal();
        try {
            etal2.acheterProduit(1, gaulois);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fin du scénario");
    }
}
