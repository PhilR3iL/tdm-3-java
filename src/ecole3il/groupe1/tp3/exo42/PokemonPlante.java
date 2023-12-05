package ecole3il.groupe1.tp3.exo42;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nom, int pv, int atk) {
		super(nom, pv, atk);
	}

	public void attaquer(PokemonFeu autrePokemon) {
		autrePokemon.infligerDegats(getAtk() / 2);
	}

	public void attaquer(PokemonEau autrePokemon) {
		autrePokemon.infligerDegats(getAtk() * 2);
	}

}
