abstract class Conta { // new Conta() será proibido

	private final String cpf;
	private boolean ativa = false;
	private int saldo = 0;

	Conta(String cpf) {
		this.cpf = cpf;
	}

	void fecha() {
		if (this.saldo < 0)	return;
		this.saldo = 0;
		this.ativa = false;
	}

	// método sem implementação
	abstract String tipo();

	boolean depositoDinheiro(int v) {
		if (!ativa)	return false;
		this.saldo += v;
		return true;
	}

	boolean depositoCheque(int v) {
		if (v > limiteDepositoCheque()) return false;
		this.saldo += v;
		return true;
	} 
	
	// filhas têm acesso (hook/gancho)
	protected int limiteDepositoCheque() {
		return Integer.MAX_VALUE;
	}

	boolean saque(int v) {
		if (!ativa)
			return false;
		if (v > this.saldoDisponivelSaque())
			return false;
		if (v > limiteParaSaque())
			return false;
		this.saldo -= v;
		return true;
	}

	abstract int limiteParaSaque();

	void deposito(int v) {
		this.saldo += v;
	}

	void ativa(boolean a) {
		this.ativa = a;
	}

	boolean ativa() {
		return this.ativa;
	}

	int saldo() {
		return this.saldo;
	}

	int saldoDisponivelSaque() {
		return this.saldo;
	}

	void cicloMensal() {
		if ( ! this.ativa) return;
		this.saldo -= calculaDescontos();
		this.saldo += calculaAcrescimos();
	}

	abstract int calculaDescontos();
	abstract int calculaAcrescimos();

}
