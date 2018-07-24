class Main {

  static char charp(String s, int p) { // API é perene!!!
    if (s.length() == 0) return '\0';
    if (p < 0) p = s.length() + p; // conversão de índice
    if (p < 0 || p >= s.length()) return '\0'; // exceção
    return s.charAt(p);
  }
  // SOBRECARGA de método (um tipo POLIMORFISMO)
  // método com o mesmo nome mas parâmetros diferentes
  static char charp(int p, String s) {
    return charp(s, p);
  }

  static char last(String s) {
    return charp(s, -1);
  }

  public static void main(String[] args) {
    System.out.println("OK!");
             // 0123456
    String s = "palavra"; // tamanho - p
            //- 7654321
    char c = s.charAt(0);
    System.out.println(c); // p
    System.out.println(c == 'p'); // true

    char e = charp(s, 2);
    System.out.println(e); // l
    System.out.println(e == 'l');

    char q = charp(s, -1); // último caractere
    System.out.println(q); // a
    System.out.println(q == 'a');

    System.out.println(charp("tads", -2)); // d
    System.out.println(charp("tads", -2) == 'd');
    // Casos Excepcionais
    System.out.println(charp("tads", -5) == '\0');
    System.out.println(charp("tads", 4) == '\0');

    String t = "Tecnologia em Análise e Desenvolvimento de Sistemas";
    System.out.println("" + charp(t, 0) + charp(t, 80) + charp(t, 14) + charp(t, 24) + charp(t, 43));

    String r = "objeto"; // Qual é a API de last?
    System.out.println(last(r)); // o
    System.out.println(last(r) == 'o');
    System.out.println(last("teste") == 'e');

    System.out.println(charp(1, "aula")); // u
    System.out.println(charp(1, "aula") == 'u'); // u







  }
}
