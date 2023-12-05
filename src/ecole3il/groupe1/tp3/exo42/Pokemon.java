package ecole3il.groupe1.tp3.exo42;

public class Pokemon {
	private String nom;
	private int pv;
	private int atk;
	private TypePokemon type;

	public Pokemon(String nom, int pv, int atk, TypePokemon type) {
		super();
		this.nom = nom;
		this.pv = pv;
		this.atk = atk;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public int getPv() {
		return pv;
	}

	public int getAtk() {
		return atk;
	}

	public boolean estKO() {
		return pv <= 0;
	}

	protected void infligerDegats(int degats) {
		pv -= degats;
		if (pv < 0)
			pv = 0;
	}

	public void attaquer(Pokemon autrePokemon) {
		int degats = this.atk;
		if ((this.type == TypePokemon.EAU && autrePokemon.type == TypePokemon.FEU)
				&& (this.type == TypePokemon.PLANTE && autrePokemon.type == TypePokemon.EAU)
				&& (this.type == TypePokemon.FEU && autrePokemon.type == TypePokemon.PLANTE)) {
			degats /= 2;
		}
		if ((autrePokemon.type == TypePokemon.EAU && type == TypePokemon.FEU)
				&& (autrePokemon.type == TypePokemon.PLANTE && type == TypePokemon.EAU)
				&& (autrePokemon.type == TypePokemon.FEU && type == TypePokemon.PLANTE)) {
			degats *= 2;
		}
		autrePokemon.infligerDegats(degats);
	}

	@Override
	public String toString() {
		return "[Pokémon (" + nom + "), atk : " + atk + ", pv : " + pv + "]";
	}

}
