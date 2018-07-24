
class Campeonato {

	private final String nome;
	private final Time[] times;
	private final int ano;
	private final Jogo[] jogos;

	Campeonato(String nome, int ano, Time... times) {
		this.nome = nome;
		this.times = times;
		this.ano = ano;
		this.jogos = 
		  new Jogo[Util.combinacao(times.length, 2)];
		int k = 0;
		for (int i = 0; i < times.length; i++) {
			Time mandante = times[i];
			for (int j = i + 1; j < times.length; j++) {
				Time visitante = times[j];
				this.jogos[k++] = 
						new Jogo(mandante, visitante);
			}
		}
	}

	public String getNome() { return nome; }
	public Time[] getTimes() { return times; }
	public int getAno() { return ano; }
	public Jogo[] getJogos() { return jogos; }
	
	@Override
	public String toString() {
		return nome + " " + ano;
	}

	Time getCampeao() {
		if (aberto()) return null;
		int[] pontos = new int[times.length];
		for (int i = 0; i < times.length; i++) {
			for (Jogo j : jogos) {
				if (j.getGanhador() == times[i]) {
					pontos[i] += 3;
				} else if (j.getGanhador() == null) {
					pontos[i] += 1;
				}
			}
		}
		int posicao = 0;
		for (int i = 1; i < pontos.length; i++) {
			if (pontos[i] > pontos[i - 1]) {
				posicao = i;
			}
		}
		return this.times[posicao];
	}

	boolean aberto() {
		for (Jogo j : jogos) {
			if (j.pendente()) return true;	
		}			
		return false;
	}

	void placar(int golsMandante, int golsVisitante) {
		Jogo aberto = null;
		for (Jogo j : jogos) {
			if (j.pendente()) {
				aberto = j;
				break;
			}
		}
		if (aberto != null) {
			aberto.placar(golsMandante, golsVisitante);
		}		
	}

		

	
	
	
	
	
	
}
