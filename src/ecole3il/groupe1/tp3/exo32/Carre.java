package ecole3il.groupe1.tp3.exo32;

public class Carre extends Forme {

	private double cote;
	
	public Carre(double d) {
		this.cote = d;
	}

	@Override
	public double getSurface() {
		return cote * cote;
	}
	
	@Override
	public String toString() {
		return "Carre [cote = " + cote + "]";
	}

}
