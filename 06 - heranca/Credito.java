// declarar a classe como abstrata
// é assumir que ela é incompleta
// não pode ser instancia (não gera objetos)
abstract class Credito {
  final String nomeTitular;
  final String cpfTitular;
  final double valor;

  Credito(String nomeTitular,
    String cpfTitular, double valor) {

    if (nomeTitular.split(" ").length < 2) {
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
