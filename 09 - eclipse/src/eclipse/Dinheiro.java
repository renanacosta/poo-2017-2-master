package eclipse;

class Dinheiro {

	int reais;
	int centavos;

	Dinheiro(int reais, int centavos) {
		this.reais = reais;
		this.centavos = centavos;
	}
	
	@Override
	public String toString() {
		return "R$ " + reais + "," + centavos;
	}

	public void maisReais(int reais) {
		this.reais += reais;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + centavos;
		result = prime * result + reais;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dinheiro other = (Dinheiro) obj;
		if (centavos != other.centavos)
			return false;
		if (reais != other.reais)
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
}
