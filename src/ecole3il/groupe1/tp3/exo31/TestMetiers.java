package ecole3il.groupe1.tp3.exo31;

public class TestMetiers {
	public static void main(String[] argv) {
		Personne[] personnes = new Personne[3];
		personnes[0] = new IngenieurReseau("Paul");
		personnes[1] = new IngenieurLogiciel("Philippe");
		personnes[2] = new IngenieurReseau("Pierre");
		for (int i = 0; i < personnes.length; i++)
			personnes[i].afficher();
	}
}
