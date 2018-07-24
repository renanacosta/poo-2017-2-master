class Imprimir { // MÓDULO: Imprimir (não tem main)

  // funções deste módulo:
  static void separador() {
    separador('-');
  }

  static void separador(char separador) {
    separador(separador, 40);
  }

  static void separador(char separador, int qtd) {
    System.out.println(repete(separador, qtd));
  }

  static String repete(char c, int q) {
    String s = "";
    for (int i = 0; i < q; i++) s += c;
    return s;
  }

  // sem main!





}
