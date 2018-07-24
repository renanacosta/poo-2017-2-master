class Main {
  public static void main(String[] args) {
    // ar-condicionado:
    // marca, potencia, inversor
    ArCondicionado ar =
      new ArCondicionado("Komeco", 8000, true);
    System.out.println(ar.marca);    // Komeco
    System.out.println(ar.potencia); // 8000
    System.out.println(ar.inversor); // true
    // ar.marca = "LG";
    // System.out.println(ar.marca);    // LG

    System.out.println(ar.temperatura()); // 19
    // método! -> operação/ação/comando
    ar.aumentarTemperatura();
    System.out.println(ar.temperatura()); // 20
    ar.aumentarTemperatura();
    ar.aumentarTemperatura();
    ar.aumentarTemperatura();
    ar.aumentarTemperatura();
    ar.aumentarTemperatura();
    System.out.println(ar.temperatura()); // 25
    ar.aumentarTemperatura();
    System.out.println(ar.temperatura()); // 25
    // ar.temperatura++; // proibido (private)
    System.out.println(ar.temperatura()); // 25
    ar.diminuirTemperatura();
    System.out.println(ar.temperatura()); // 24
    while (ar.temperatura() > 16) {
      ar.diminuirTemperatura();
    }
    System.out.println(ar.temperatura()); // 16
    ar.diminuirTemperatura();
    System.out.println(ar.temperatura()); // 16

    ar.alterarTemperatura(20);
    System.out.println(ar.temperatura()); // 20

    ar.alterarTemperatura(26);
    System.out.println(ar.temperatura()); // 20

    ar.alterarTemperatura(15);
    System.out.println(ar.temperatura()); // 20

    ArCondicionado outroar =
      new ArCondicionado("LG", 25000, false);
    System.out.println(outroar.temperatura());

    // `meuar` e `ar` são referências para o mesmo objeto!
    ArCondicionado meuar = ar;

    System.out.println(meuar.temperatura()); // 20
    meuar.aumentarTemperatura();
    System.out.println(meuar.temperatura()); // 21
    System.out.println(ar.temperatura()); // 21
    ar.aumentarTemperatura();
    System.out.println(ar.temperatura()); // 22
    System.out.println(meuar.temperatura()); // 22








  }
}
