package ecole3il.groupe1.tp3.exo2;

public class PointNom extends Point{
	private String nom;
	
	public void setPointNom(String nom, int x, int y) {
		setNom(nom);
		super.setPoint(x, y);
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void afficheCoordonnées() {
		System.out.println("Nom : " + nom);
		afficheCoords();
	}
	
}
