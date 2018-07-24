class Main {
  public static void main(String[] args) {
    // Métodos que aproveitam outros métodos auxiliares
    System.out.println("subproblema");
    System.out.print("Nome: ");
    Imprimir.separador('_', 20);
    // o método separador (porque é void)
    // não é testável automaticamente
    // (só no olho)
    System.out.println("Cidade: " + Imprimir.repete('_', 15));
    // ASSERTIVA: afirmação (sempre verdadeira)
    System.out.println(
      Imprimir.repete('_', 15).equals("_______________")
    ); // true!
    // Casos excepcionais:
    System.out.println(Imprimir.repete('_', 0).equals(""));
    System.out.println(Imprimir.repete('_', -20).equals(""));
  }
}
