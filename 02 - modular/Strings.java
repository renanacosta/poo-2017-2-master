class Strings { // é um módulo (não tem main)

  static String trimRight(String s) {
    String r = "";
    boolean podeCopiar = false; // flag!
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) != ' ') podeCopiar = true;
      if (podeCopiar) r = s.charAt(i) + r;
    }
    return r;
  }

  static String reverse(String s) {
    String r = "";
    for (int i = 0; i < s.length(); i++) r = s.charAt(i) + r;
    return r;
  }

  static String trimLeft(String s) {
    return reverse(trimRight(reverse(s)));
  }

  static String trim(String s) {
    return trimLeft(trimRight(s));
  }













}
