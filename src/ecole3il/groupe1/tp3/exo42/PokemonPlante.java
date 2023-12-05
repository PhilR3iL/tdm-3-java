package ecole3il.groupe1.tp3.exo42;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nom, int pv, int atk) {
		super(nom, pv, atk);
	}

	protected void blessePar(PokemonEau autrePokemon){
		super.infligerDegats((int) (autrePokemon.getAtk() * 0.5));
	}

	protected void blessePar(PokemonFeu autrePokemon){
		super.infligerDegats((int) (autrePokemon.getAtk() * 2));
	}


}
