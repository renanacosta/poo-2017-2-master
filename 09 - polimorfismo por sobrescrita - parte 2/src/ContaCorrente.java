
class ContaCorrente extends Conta {

	ContaCorrente(String cpf) {
		super(cpf);
	}

	@Override
	protected int limiteDepositoCheque() {
		return 1000;
	}
	
	@Override // sobrescrita de método
	String tipo() {
		return "Corrente";
	}

	@Override
	int limiteParaSaque() {
		return 1000;
	}

	@Override
	int calculaDescontos() {
		return 15;
	}

	@Override
	int calculaAcrescimos() {		
		return 0;
	}

}
