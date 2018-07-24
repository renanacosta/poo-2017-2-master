class Metodos {
  // métodos "void" não têm retorno!
  static void imprimeSeparador() { // sem parâmetro
    System.out.println("*************************************");
  }

  public static void main(String[] args) {
    // PROBLEMA: imprimir separadores!
    // SOLUÇÃO: criar um método!
    // MANTRA: manter o que é constante e separar o que varia!
    System.out.println("IFRS");
    imprimeSeparador();
    System.out.println("Campus Rio Grande");
    imprimeSeparador();
    System.out.println("Divisão de Computação");
    imprimeSeparador();
    System.out.println("Análise e Desenvolvimento de Sistemas");
    imprimeSeparador();
  }
}
