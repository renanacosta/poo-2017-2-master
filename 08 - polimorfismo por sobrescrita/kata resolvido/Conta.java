class Conta {

  private final String cpf;
  private final char tipo;
  private boolean ativa = false;
  private int saldo = 0;
  private int limite = 0;

  Conta(String cpf, char tipo) {
    this.cpf = cpf;
    this.tipo = tipo;
  }

  Conta(String cpf, char tipo, int limite) {
    this(cpf, tipo);
    this.limite = limite;
  }

  void fecha() {
    if (this.saldo < 0) return;
    this.saldo = 0;
    this.ativa = false;
  }

  String tipo() {
    if (this.tipo == 'C') return "Corrente";
    if (this.tipo == 'E') return "Especial";
    if (this.tipo == 'P') return "Poupanca";
    return null;
  }

  boolean depositoDinheiro(int v) {
    if (!ativa) return false;
    this.saldo += v;
    return true;
  }

  boolean depositoCheque(int v) {
    if (this.tipo == 'C' && v > 1000) return false;
    if (this.tipo == 'E' && v > 2000) return false;
    this.saldo += v;
    return true;
  }

  boolean saque(int v) {
    if (!ativa) return false;
    if (v > this.saldoDisponivelSaque()) return false;
    if (this.tipo == 'C' && v > 1000) return false;
    if (this.tipo == 'E' && v > 2000) return false;
    this.saldo -= v;
    return true;
  }

  void deposito(int v) {
    this.saldo += v;
  }

  void ativa(boolean a) {
    this.ativa = a;
  }
  // sobrecarga do método ativa
  boolean ativa() {
    return this.ativa;
  }

  int saldo() {
    return this.saldo;
  }

  int limite() {
    return this.limite;
  }

  int limiteUsado() {
    if (this.saldo < 0) return this.saldo * -1;
    return 0;
  }

  int saldoDisponivelSaque() {
    return this.saldo + this.limite;
  }

  void cicloMensal() {
    if ( ! this.ativa) return;
    if (this.tipo == 'C') {
      this.saldo -= 15;
    }
    if (this.tipo == 'E') {
      this.saldo -= this.limiteUsado() * 0.1 + 20;
    }
    if (this.tipo == 'P') {
      this.saldo *= 1.01;
    }
  }








}
