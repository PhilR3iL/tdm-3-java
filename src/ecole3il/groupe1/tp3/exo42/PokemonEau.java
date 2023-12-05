package ecole3il.groupe1.tp3.exo42;

public class PokemonEau extends Pokemon {

	public PokemonEau(String nom, int pv, int atk) {
		super(nom, pv, atk);
		// TODO Auto-generated constructor stub
	}


	protected void blessePar(PokemonPlante autrePokemon){
		super.infligerDegats((int) (autrePokemon.getAtk() * 2));
	}

	protected void blessePar(PokemonFeu autrePokemon){
		super.infligerDegats((int) (autrePokemon.getAtk() * 0.5));
	}
}
