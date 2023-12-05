package ecole3il.groupe1.tp3.exo13;

public class Renault extends Voiture {
	private int anneeFrabrication;
	private int reductionConstructeur;
	public Renault(int vitesse, double prixDeBase, String couleur, int anneeFrabrication, int reductionConstructeur) {
		super(vitesse, prixDeBase, couleur);
		this.anneeFrabrication = anneeFrabrication;
		this.reductionConstructeur = reductionConstructeur;
	}
	public int getAnneeFrabrication() {
		return anneeFrabrication;
	}
	public int getReductionConstructeur() {
		return reductionConstructeur;
	}
	
	@Override
	public double calculerPrixDeVente() {
		return super.calculerPrixDeVente() - reductionConstructeur;
	}
	
	
}
