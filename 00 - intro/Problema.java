class Problema {
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

    int a = 7896;
    int b = 5654;
    mdc = 1;

    // algoritmo copiado/colado
    for (int i = 2; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        mdc = i;
      }
    }

    System.out.println(mdc); // 2

    int q = 9;
    int z = 6;
    mdc = 1;

    for (int i = 2; i <= q; i++) {
      if (q % i == 0 && z % i == 0) {
        mdc = i;
      }
    }

    System.out.println(mdc); // 3

  }
}
