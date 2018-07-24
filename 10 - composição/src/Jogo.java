
class Jogo {

	private final Time mandante;
	private final Time visitante;
	private Integer golsMandante;
	private Integer golsVisitante;

	Jogo(Time mandante, Time visitante) {
		this.mandante = mandante;
		this.visitante = visitante;
	}
	
	public Time getMandante() { return mandante; }
	public Time getVisitante() { return visitante; }
	
	Time getGanhador() {
		if (!pendente()) {
			if (golsMandante > golsVisitante) {
				return mandante;
			} else if (golsVisitante > golsMandante) {
				return visitante;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {		
		return mandante + " vs " + visitante;
	}

	boolean pendente() {		
		return golsMandante == null;
	}

	void placar(int golsMandante, int golsVisitante) {
		this.golsMandante = golsMandante;
		this.golsVisitante = golsVisitante;
	}

	
	
	
	
	
	
	
	
}
