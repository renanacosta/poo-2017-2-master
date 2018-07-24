class Ator {
  final String nome;
  final Data dataNascimento;

  Ator(String nome, Data dataNascimento) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
  }

  public String toString() {
    return nome + " " + dataNascimento;
  }
}
