class Financiamento extends Credito {
  // herda de Crédito
  // subclasse de Crédito (filha de Crédito)
  final String bem;
  final int    parcelas;

  Financiamento(String nomeTitular,
    String cpfTitular, String bem, double valor, int parcelas) {

    super(nomeTitular, cpfTitular, valor);

    this.parcelas    = parcelas;
    this.bem         = bem;

  }
}
