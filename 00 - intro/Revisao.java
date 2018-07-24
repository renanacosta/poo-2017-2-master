class Revisao {
  public static void main(String[] args) {
    int x = 8;
    int y = 12;
    int mdc = 1;
    for (int i = 2; i <= x; i++) {
      if (x % i == 0 && y % i == 0) {
        mdc = i;
      }
    }

    System.out.println(mdc); // 4

    // confiável
    // eficiência
    // usabilidade
    // flexível (fácil de alterar)
  }
}
