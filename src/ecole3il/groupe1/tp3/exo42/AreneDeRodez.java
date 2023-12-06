package ecole3il.groupe1.tp3.exo42;

public class AreneDeRodez {

	public static void main(String[] args) {
		Pokemon miasmasx = new Pokemon("Miasmasx", 32, 24);
		System.out.println(miasmasx);
		PokemonEau canardio = new PokemonEau("Canardio", 20, 5);
		PokemonFeu poussifeu = new PokemonFeu("Poussifeu", 19, 6);
		PokemonPlante bulbizarre = new PokemonPlante("Bulbizarre", 18, 7);
		Pokemon A = canardio;
		System.out.println(A.equals(canardio));
		
		System.out.println(canardio);
		System.out.println(poussifeu);
		canardio.attaquer(poussifeu);
		poussifeu.attaquer(canardio);
		System.out.println(canardio);
		System.out.println(poussifeu);
	}

}
