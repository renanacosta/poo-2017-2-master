class Main {
  public static void main(String[] args) {
    System.out.println("pronto");
    // ENCAPSULAMENTO/OCULTAMENTO
    Filme f1 = new Filme("Todo poderoso",
      101, Genero.COMEDIA, Genero.DRAMA);

    System.out.println(f1.titulo());
    System.out.println(f1.generos(0)); // COMEDIA
    System.out.println(f1.generos(1)); // DRAMA
    System.out.println(f1.generos(2)); // NULL

    for (int i = 0; f1.generos(i) != null; i++) {
      System.out.println(f1.generos(i));
    }

    Ator a1 =
      new Ator("Jim Carrey", new Data(17, 1, 1962));
    Ator a2 =
      new Ator("Jennifer Aniston", new Data(11, 2, 1969));

    f1.escalar(a1);
    f1.escalar(a2);

    System.out.println(f1.elenco().length); // 2
    for (int i = 0; i < f1.elenco().length; i++) {
      System.out.println(f1.elenco()[i]);
    }
  }
}


// Ator
// Filme
// Gênero
