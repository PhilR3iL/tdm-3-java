package ecole3il.groupe1.tp3.exo13;

public class Camion extends Voiture {
	private int poids;

	public Camion(int poids, int vitesse, double prixDeBase, String couleur ) {
		super(vitesse, prixDeBase, couleur);
		this.poids = poids;
	}
	
	@Override
	public double calculerPrixDeVente() {
		return (poids > 2000 ? 0.9 : 0.8) * super.calculerPrixDeVente();
	}
}
