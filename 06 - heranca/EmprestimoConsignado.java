class EmprestimoConsignado extends Credito {
  final int parcelas;

  EmprestimoConsignado(String nomeTitular,
    String cpfTitular, double valor, int parcelas) {

    super(nomeTitular, cpfTitular, valor);

    this.parcelas    = parcelas;

  }
}
