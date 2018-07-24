class Main {
  public static void main(String[] args) {

    System.out.println("ok!");
    // OBJETOS DE VALOR
    // Ex.: HORA!
    Hora h1 = new Hora();
    System.out.println(h1.horas);
    System.out.println(h1); // 00:00:00
    Hora h2 = new Hora(19, 37, 11);
    System.out.println(h2.horas);
    System.out.println(h2); // 19:37:11
    System.out.println(h2.toString());

    // PROIBIDO
    // Hora h3 = new Hora(25, 0, 0); // ?

    Hora h4 = new Hora(12); // 12:00:00
    System.out.println(h4); // 12:00:00

    Hora h5 = new Hora(13, 22, 54);
    // adicionar 1h ao h5
    h5 = h5.somaHoras(1); // reatribuição!
    System.out.println(h5); // 14:22:54

    h5 = h5.somaHoras(12);
    System.out.println(h5); // 02:22:54

    // IMUTABILIDADE: GARANTE O ESTADO!
    Hora h6 = h5;
    System.out.println(h6); // 02:22:54
    h5 = h5.somaHoras(1);
    System.out.println(h5); // 03:22:54
    System.out.println(h6); // 02:22:54

    Hora h7 = new Hora(21, 25, 23);
    Hora h8 = new Hora(21, 25, 23);
    System.out.println(h7); // 21:25:23
    System.out.println(h8); // 21:25:23
    System.out.println(h7 == h8); // false
    System.out.println(h8.equals(h7)); // TRUE
    Hora h9 = new Hora(21, 25, 23);
    System.out.println(h9.equals(h8)); // TRUE
    System.out.println(h9.equals(h9));

    h9 = h9.somaMinutos(10);
    System.out.println(h9); // 21:35:23

    h9 = h9.somaMinutos(30);
    System.out.println(h9); // 22:05:23

    Hora h10 = h9.somaHoras(1).somaMinutos(10);
    System.out.println(h10); // 23:15:23

    System.out.println(h10.ehMeiaNoite()); // false

    Hora h11 = new Hora(0, 0, 0);
    System.out.println(h11.ehMeiaNoite()); // true






  }
}
