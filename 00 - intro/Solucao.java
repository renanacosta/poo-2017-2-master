class Solucao {
  // método mdc (ou função)
  // static tiporetorno  nome(tipoentrada, tipoentrada) {
  static int mdc(int n1, int n2) {
    int r = 1;
    // algoritmo
    for (int i = 2; i <= n1 && i <= n2; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        r = i;
      }
    }
    return r;
  }

  public static void main(String[] args) {
    // MDC
    // entrada dois inteiros
    int x = 8;
    int y = 12;
    // entram dois inteiros e sai um inteiro
    int resp = mdc(x, y); // chamar o método mdc

    // como testar? assertiva!
    System.out.println(resp == 4); // true

    resp = mdc(9, 6); // literal

    System.out.println(resp == 3);
    // Casos de Teste
    System.out.println(mdc(12, 6) == 6);
    System.out.println(mdc(12, 12) == 12);
    System.out.println(mdc(7896, 5654) == 2);
    System.out.println(mdc(11, 7) == 1);


  }
}
