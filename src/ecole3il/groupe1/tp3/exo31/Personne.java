package ecole3il.groupe1.tp3.exo31;

public abstract class Personne {

	// Le prénom de la personne
	private String prenom;

	/**
	 * Affiche le prénom de la personne.
	 */
	public void afficher() {
		System.out.println("La personne s'appelle " + prenom + ".");
	}

	/**
	 * Constructeur de Personne.
	 * @param prenom Le prénom de la personne.
	 */
	public Personne(String prenom) {
		this.prenom = prenom;
	}

}
