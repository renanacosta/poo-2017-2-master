class Leasing extends Financiamento {
  final String banco;

  Leasing(String banco, String nomeTitular,
    String cpfTitular, String bem, double valor, int parcelas) {

    super(nomeTitular, cpfTitular, bem, valor, parcelas);

    this.banco = banco;

  }
}
