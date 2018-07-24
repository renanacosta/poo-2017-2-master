class Adiantamento13roSalario {
  final String nomeTitular;
  final String cpfTitular;
  final double valor;

  Adiantamento13roSalario(String nomeTitular,
    String cpfTitular, double valor) {

    if (nomeTitular.split(" ").length < 3) {
      throw new IllegalArgumentException("nome inválido");
    }

    if ( ! cpfTitular.matches("^\\d{11}$")) { // REGEX
      throw new IllegalArgumentException("cpf inválido");
    }

    this.nomeTitular = nomeTitular;
    this.cpfTitular  = cpfTitular;
    this.valor       = valor;

  }
}
