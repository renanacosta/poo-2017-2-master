class Hora {
  // final em todos os atributos torna
  // os objetos IMUTÁVEIS!
  final int horas;
  final int minutos;
  final int segundos;

  Hora(int horas, int minutos, int segundos) {
    if (horas < 0 || horas > 23) {
      throw new IllegalArgumentException("hora invalida");
    }
    if (minutos < 0 || minutos > 59) {
      throw new IllegalArgumentException("minuto invalido");
    }
    if (segundos < 0 || segundos > 59) {
      throw new IllegalArgumentException("seg invalido");
    }
    this.horas    = horas;
    this.minutos  = minutos;
    this.segundos = segundos;
  }
  // CONSTRUTOR SOBRECARREGADO:
  // dois ou mais construtores com parâmetros
  // diferentes
  Hora() {
    this.horas    = 0;
    this.minutos  = 0;
    this.segundos = 0;
  }

  Hora(int horas) {
    this(horas, 0, 0);
  }

  // REPRESENTAÇÃO STRING DO OBJETO
  // SOBRESCREVER O MÉTODO toString()
  @Override
  public String toString() {
    // TODO: imprimir os zeros à esquerda
    return this.horas + ":"
      + this.minutos + ":" + this.segundos;
  }
  // método de ação/comando para um objeto imutável
  Hora somaHoras(int horas) {
    return new Hora((this.horas + horas) % 24,
                    this.minutos,
                    this.segundos);
  }

  // SOBRESCREVER O EQUALS
  @Override
  public boolean equals(Object o) {
    Hora h = (Hora) o; // cast
    // TODO: precisa melhorar esse equals!
    return this.horas    == h.horas
        && this.minutos  == h.minutos
        && this.segundos == h.segundos;
  }

  Hora somaMinutos(int minutos) {
    return new Hora(
      (this.horas + ((this.minutos + minutos) / 60)) % 24,
      (this.minutos + minutos) % 60,
      this.segundos);
  }

  boolean ehMeiaNoite() {
    return this.horas == 0
        && this.minutos == 0
        && this.segundos == 0;
  }





}
