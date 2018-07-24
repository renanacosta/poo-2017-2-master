class Texto {

  static String maiusculas(String s) {
    String r = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        r += (char) (s.charAt(i) - 32);
      } else {
        r += s.charAt(i);
      }
    }
    return r;
  }

  public static void main(String[] args) {
    //for (int i = 256; i < 8000 ; i++) {
    //  System.out.print((char) i);
    //}
    String s = "tads";
    s = maiusculas(s);
    System.out.println(s);
    System.out.println(s.equals("TADS"));
    System.out.println(maiusculas("aula"));
    System.out.println(maiusculas("POO").equals("POO"));
    System.out.println(maiusculas("123").equals("123"));
    System.out.println(maiusculas("POO101t").equals("POO101T"));







  }
}
