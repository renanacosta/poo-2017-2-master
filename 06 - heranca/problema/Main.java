class Main {
  public static void main(String[] args) {
    System.out.println("OK!");

    EmprestimoConsignado emp =
      new EmprestimoConsignado("Márcio Torres", "44488822233", 5000.0, 10);

    System.out.println(emp.nomeTitular); // Márcio Torres
    System.out.println(emp.cpfTitular); // 44488822233
    System.out.println(emp.valor); // 5000.0
    System.out.println(emp.parcelas); // 10

    Adiantamento13roSalario a13s =
      new Adiantamento13roSalario("Rafael Betito",
      "77733366644", 5000.0);

    System.out.println(a13s.nomeTitular); // Rafael Betito

    Financiamento fin =
      new Financiamento("Tiago Moraes", "77788899922",
        "Gol bolinha", 8000.0, 48);

    System.out.println(fin.nomeTitular); // Tiago Moraes
    System.out.println(fin.bem); // Gol bolinha


  }
}
