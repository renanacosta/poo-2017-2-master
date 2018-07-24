class Banco {
  private Conta[] contas = new Conta[100];
  private int n = 0;

  boolean abreConta(Conta c, int valorDeposito) {
	// aceita Conta e "filhas" de Conta
	// Conta e suas covariantes (filhas/subtipos)
    if (valorDeposito <= 0) return false;
    c.ativa(true);
    c.deposito(valorDeposito);
    this.contas[n++] = c;
    return true;
  }

  boolean fechaConta(Conta c) {
    if (c.saldo() < 0) return false;
    c.fecha();
    return true;
  }

  void cicloMensal() {
    for (Conta c : contas)
      if (c != null && c.ativa())
        c.cicloMensal();
  }
}
