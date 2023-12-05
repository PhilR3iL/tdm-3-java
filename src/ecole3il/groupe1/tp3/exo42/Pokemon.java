package ecole3il.groupe1.tp3.exo42;

public class Pokemon {
	private String nom;
	private int pv;
	private int atk;

	public Pokemon(String nom, int pv, int atk) {
		super();
		this.nom = nom;
		this.pv = pv;
		this.atk = atk;
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

	protected void blessePar(Pokemon autrePokemon) {
		infligerDegats(autrePokemon.atk);
	}
	
	protected void infligerDegats(int degats) {
		pv -= degats;
		if (pv < 0)
			pv = 0;
	}

	public void attaquer(Pokemon autrePokemon) {
		autrePokemon.blessePar(this);
	}

	@Override
	public String toString() {
		return "[Pokémon (" + nom + "), atk : " + atk + ", pv : " + pv + "]";
	}

}
