class Banco {

  private Conta[] contas = new Conta[100];
  private int n = 0;

  boolean abreConta(Conta c, int depositoInicial) {
    if (depositoInicial <= 0) return false;
    c.deposito(depositoInicial);
    c.ativa(true);
    this.contas[n++] = c;
    return true;
  }

  boolean fechaConta(Conta c) {
    if (c.saldo() < 0) return false;
    c.saque(c.saldo());
    c.ativa(false);
    return true;
  }

  void cicloMensal() {
    for (Conta c : contas)
      if (c != null && c.ativa())
        c.cicloMensal();
  }
}
