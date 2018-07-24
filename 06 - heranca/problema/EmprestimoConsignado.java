class EmprestimoConsignado {
  final String nomeTitular;
  final String cpfTitular;
  final double valor;
  final int    parcelas;

  EmprestimoConsignado(String nomeTitular,
    String cpfTitular, double valor, int parcelas) {

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

  }
}
