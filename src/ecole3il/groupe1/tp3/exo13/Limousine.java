package ecole3il.groupe1.tp3.exo13;

public class Limousine extends Voiture{
	private int longueur;

	public Limousine(int vitesse, double prixDeBase, String couleur, int longueur) {
		super(vitesse, prixDeBase, couleur);
		this.longueur = longueur;
	}
	
	@Override
	public double calculerPrixDeVente() {
		return (longueur > 6 ? 0.95 : 0.9) * super.calculerPrixDeVente();
	}
}
