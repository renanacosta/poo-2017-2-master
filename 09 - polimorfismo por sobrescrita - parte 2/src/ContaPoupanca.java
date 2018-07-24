
class ContaPoupanca extends Conta {

	ContaPoupanca(String cpf) {
		super(cpf);
	}

	@Override
	String tipo() {		
		return "Poupanca";
	}

	@Override
	int limiteParaSaque() {		
		return this.saldo();
	}

	@Override
	int calculaDescontos() {
		return 0;
	}

	@Override
	int calculaAcrescimos() {
		return (int)(0.01 * this.saldo());
	}

}
