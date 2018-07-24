class Exercicio {
  public static void main(String[] args) {
    System.out.println(Strings.takeFirst("objetos", 3)); // obj
    System.out.println(Strings.takeLast("objetos", 3)); // tos
    System.out.println(
      Strings.takeFirst("objetos", 3).equals("obj")
    );
    System.out.println(
      Strings.takeLast("objetos", 3).equals("tos")
    );
  }
}
