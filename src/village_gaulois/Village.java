package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int NB_VILLAGEOIS_MAX = 50;
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[NB_VILLAGEOIS_MAX];

	public String getNom() {
		return nom;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		for (int i = 0; i < NB_VILLAGEOIS_MAX; i++) {
			if (villageois[i] == null) {
			villageois[i] = gaulois;
			}
		}
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		//if (*place tableau* == Null) {
		System.out.println("Il n'y a pas autant de villageois dans notre village");
		} else {
			return //le gaulois
		}
	} 
}
