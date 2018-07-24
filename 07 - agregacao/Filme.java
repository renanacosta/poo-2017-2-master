class Filme {
  // private: somente o próprio objeto pode acessar
  private final String titulo;
  private final int duracao;
  private final Genero[] generos; // filme agrega gêneros
  private final Ator[] elenco = new Ator[300];
  // não faz parte das propriedades do filme
  private int posicao = 0;

  // métodos acessores! (consulta/getter)
  String titulo() {
    return titulo;
  }

  int duracao() {
    return duracao;
  }

  Genero generos(int p) {
    if (p >= 0 && p < generos.length) return generos[p];
    return null;
  }

  Ator[] elenco() {
    Ator[] retorno = new Ator[posicao];
    for (int i = 0; i < posicao; i++) {
      retorno[i] = elenco[i];
    }
    return retorno;
  }



  // Genero... -> varargs -> argumentos variáveis
  Filme(String titulo, int duracao, Genero... generos) {
    this.titulo = titulo;
    this.duracao = duracao;
    this.generos = generos;
  }

  void escalar(Ator ator) {
    elenco[posicao++] = ator;
  }

  public String toString() {
    return titulo + " " + duracao + "min";
  }
}
