class Main2 {
  public static void main(String[] args) {
    // ESPECIFICAÇÃO
    String teste = "  teste  ";
    String resp = Strings.trimRight(teste);
    System.out.println(resp.equals("  teste"));
    System.out.println("|" + resp + "|");
    System.out.println(
      Strings.trimRight("aula").equals("aula")
    );
    System.out.println(Strings.reverse("tads").equals("sdat"));
    System.out.println(Strings.reverse("tads"));
    System.out.println(Strings.trimLeft(teste).equals("teste  "));

    System.out.println(Strings.trim(teste).equals("teste"));



  }
}
