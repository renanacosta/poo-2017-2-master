
class ContaEspecial extends ContaCorrente {

	private int limite;

	ContaEspecial(String cpf, int limite) {
		super(cpf);
		this.limite = limite;
	}

	@Override
	int limiteParaSaque() {
		// invocando o método 
		// sobrescrito da classe pai
		return super.limiteParaSaque() * 2;
	}
	
	@Override
	int saldoDisponivelSaque() {		
		return this.saldo() + this.limite();
	}
	
	@Override
	protected int limiteDepositoCheque() {		
		return 2 * super.limiteDepositoCheque();
	}
	
	@Override
	String tipo() {		
		return "Especial";
	}

	@Override
	int calculaDescontos() {		
		return 20 + (int)(0.1 * this.limiteUsado());
	}

	int limite() {
		return this.limite;
	}

	int limiteUsado() {
		if (this.saldo() < 0) { 
			return this.saldo() * -1;
		}
		return 0;
	}	
	
	
	
}
