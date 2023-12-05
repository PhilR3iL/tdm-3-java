package ecole3il.groupe1.tp3.exo13;

public class Voiture {
	private int vitesse;
	private double prixDeBase;
	private String couleur;
	
	public Voiture(int vitesse, double prixDeBase, String couleur) {
		super();
		this.vitesse = vitesse;
		this.prixDeBase = prixDeBase;
		this.couleur = couleur;
	}

	public int getVitesse() {
		return vitesse;
	}

	public String getCouleur() {
		return couleur;
	}

	public double calculerPrixDeVente() {
		return prixDeBase;
	}
}
