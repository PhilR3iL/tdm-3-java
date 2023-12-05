package ecole3il.groupe1.tp3.exo42;

public class PokemonFeu extends Pokemon {

	public PokemonFeu(String nom, int pv, int atk) {
		super(nom, pv, atk);
	}
	
	protected void blessePar(PokemonPlante autrePokemon){
		super.infligerDegats((int) (autrePokemon.getAtk() * 0.5));
	}

	protected void blessePar(PokemonEau autrePokemon){
		super.infligerDegats((int) (autrePokemon.getAtk() * 2));
	}
}
