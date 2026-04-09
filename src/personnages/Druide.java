package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int force) {
		chaudron.remplirChaudron(quantite, force);
		parler("J'ai concocter " + quantite + " doses de potion magique. Elle à une force de " + force + ".");
	}

	public void boosterGaulois(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			String nomGaulois = gaulois.getNom();
			if (nomGaulois != null && nomGaulois.equals("Obélix")) {
				parler("Non, " + gaulois.getNom() + " Non... ! Et tu le sais très bien.");
			} else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			}
		} else {
			parler("Désolé" + gaulois.getNom() + " mais il ne reste plus un goutte de potion magique.");
		}
	}
}
