class Financiamento {
  final String nomeTitular;
  final String cpfTitular;
  final String bem;
  final double valor;
  final int    parcelas;

  Financiamento(String nomeTitular,
    String cpfTitular, String bem, double valor, int parcelas) {

    if (nomeTitular.split(" ").length < 3) {
      throw new IllegalArgumentException("nome inválido");
    }

    if ( ! cpfTitular.matches("^\\d{11}$")) { // REGEX
      throw new IllegalArgumentException("cpf inválido");
    }

    this.nomeTitular = nomeTitular;
    this.cpfTitular  = cpfTitular;
    this.valor       = valor;
    this.parcelas    = parcelas;
    this.bem         = bem;

  }
}
