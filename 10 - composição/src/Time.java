class Time {

	private final String nome;
	private final Jogador[] equipe =
			new Jogador[50];

	Time(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {		
		return nome;
	}

	void contrata(Jogador jogador, int nroCamisa) {
		if (nroCamisa < 1 || nroCamisa > 50) {
			throw new IllegalArgumentException("camisa invalida");
		}
		if (this.equipe[nroCamisa - 1] != null) {
			throw new IllegalArgumentException("camisa já em uso");
		}
		this.equipe[nroCamisa - 1] = jogador;
	}

	public Jogador[] getEquipe() {
		Jogador[] e = new Jogador[getNroJogadores()];
		int i = 0;
		for (Jogador j : equipe) {
			if (j != null) e[i++] = j;
		}
		return e;
	}

	int getNroJogadores() {
		int nro = 0;
		// for each (para cada)
		for (Jogador j : equipe) if (j != null) nro++;		
		return nro;
	}

	void demite(int nroCamisa) {
		if (nroCamisa < 1 || nroCamisa > 50) {
			throw new IllegalArgumentException("camisa invalida");
		}
		if (equipe[nroCamisa - 1] == null) {
			throw new IllegalArgumentException("jogador não existe");
		}
		equipe[nroCamisa - 1] = null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
