class Texto {
  // 012345
  // trator

  // plural recebe palavra como parâmetro
  static String plural(String palavra) {
    if (palavra.charAt(palavra.length() - 1) == 'r') {
      return palavra + "es";
    }
    return palavra + "s";
  }

  public static void main(String[] args) {

    // entra singular sai plural
    // Caso de Teste:
    String s = "bolacha";
    String p = plural(s);
    System.out.println(p.equals("bolachas"));
    // ESPECIFICAÇÃO
    System.out.println(plural("biscoito").equals("biscoitos"));
    // chamar/invocar o método plural
    System.out.println(plural("código").equals("códigos"));
    // termina em r adiciona es
    System.out.println(plural("trator").equals("tratores"));
    // passando "pão" como argumento para o método plural
    System.out.println(plural("pão").equals("pães"));
    System.out.println(plural("pão"));
    System.out.println(plural("avião").equals("aviões"));
    // Casos Excepcionais!!!
    // se entra plural se mantém no plural
    System.out.println(plural("bolachas").equals("bolachas"));
    System.out.println(plural("bolachas"));
    // invariante
    System.out.println(plural("óculos").equals("óculos"));







  }
}
