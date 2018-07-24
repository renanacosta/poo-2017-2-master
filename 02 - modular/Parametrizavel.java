class Parametrizavel {
  // sobrecarga:
  // métodos com o mesmo nome, mas com
  // parâmetros diferentes
  static void imprimeSeparador() { // subrotina
    imprimeSeparador('-'); // delegando
  }

  static void imprimeSeparador(char separador) {
    for (int i = 0; i < 40; i++) System.out.print(separador);
    System.out.println();
  }

  public static void main(String[] args) {
    // PROBLEMA: imprimir separadores!
    // SOLUÇÃO: criar um método!
    // MANTRA: manter o que é constante e separar o que varia!
    System.out.println("IFRS");
    imprimeSeparador();
    System.out.println("Campus Rio Grande");
    imprimeSeparador('*');
    System.out.println("Divisão de Computação");
    imprimeSeparador('_');
    System.out.println("Análise e Desenvolvimento de Sistemas");
    imprimeSeparador('#');
  }
}
