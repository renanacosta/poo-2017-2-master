class Data {
  final int dia, mes, ano;

  Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public String toString() {
    return (dia < 10 ? "0" : "") + dia
      + "/" + (mes < 10 ? "0" : "") + mes
      + "/" + ano;
  }
}
