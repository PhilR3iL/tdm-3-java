package ecole3il.groupe1.tp3.exo42;

public class PokemonFeu extends Pokemon {

	public PokemonFeu(String nom, int pv, int atk) {
		super(nom, pv, atk);
	}
	
	public void attaquer(PokemonPlante autrePokemon){
		autrePokemon.infligerDegats((int) (getAtk() * 2));
	}

	public void attaquer(PokemonEau autrePokemon){
		autrePokemon.infligerDegats((int) (getAtk() / 2));
	}
}
