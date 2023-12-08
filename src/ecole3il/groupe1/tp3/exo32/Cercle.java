package ecole3il.groupe1.tp3.exo32;

public class Cercle extends Forme {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double getSurface() {
		return rayon * rayon * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Cercle [rayon = " + rayon + "]";
	}
	
}
