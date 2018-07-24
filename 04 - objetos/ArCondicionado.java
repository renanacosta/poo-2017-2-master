// CLASSE ("molde")
class ArCondicionado {
  // características constantes!!! (imutáveis)
  // ATRIBUTO
  final String  marca;
  final int     potencia;
  final boolean inversor;
  // final String  cor; // implica numa obrigação
  // caracterísicas mutáveis!
  // ESTADO!!!
  private int temperatura = 19; // privado!
  // constante da classe
  private static final int TEMP_MIN = 16;
  private static final int TEMP_MAX = 25;

  // CONSTRUTOR (inicializar o objeto)
  // NomeDaClasse(parâmetros)
  ArCondicionado(String m, int p, boolean i) {
    marca    = m;
    potencia = p;
    inversor = i;
  }
  // OPERAÇÃO/COMANDO
  // método comando!
  void aumentarTemperatura() {
    if (temperatura == TEMP_MAX) return;
    temperatura = temperatura + 1;
  }
  // CONSULTA
  // método consulta!
  int temperatura() {
    return temperatura;
  }

  void diminuirTemperatura() {
    if (temperatura == TEMP_MIN) return;
    temperatura--;
  }

  void alterarTemperatura(int t) {
    if (t < TEMP_MIN || t > TEMP_MAX) return;
    temperatura = t;
  }







}
