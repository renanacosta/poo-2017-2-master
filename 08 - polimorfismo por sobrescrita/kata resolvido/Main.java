class Main {
  public static void main(String[] args) {

    Banco banco = new Banco();

    Conta c1 = new Conta("22288833322", 'C'); // [C]orrente

    System.out.println(c1.tipo().equals("Corrente"));


    System.out.println(c1.ativa() == false);
    // nada pode ser feito se não estiver ativa
    System.out.println(c1.depositoDinheiro(100) == false);

    System.out.println(banco.abreConta(c1, 200) == true); // precisa depósito inicial

    System.out.println(c1.ativa() == true);

    System.out.println(c1.limite() == 0);
    System.out.println(c1.saldo() == 200);
    System.out.println(c1.saldoDisponivelSaque() == 200);

    System.out.println(c1.saque(10) == true);
    System.out.println(c1.saldo() == 190);
    System.out.println(c1.saldoDisponivelSaque() == 190);

    System.out.println(c1.saque(200) == false); // sem saldo disponível para saque
    System.out.println(c1.saldo() == 190);
    System.out.println(c1.saldoDisponivelSaque() == 190);

    System.out.println(c1.depositoDinheiro(4810));
    System.out.println(c1.saldo() == 5000);
    System.out.println(c1.saldoDisponivelSaque() == 5000);

    System.out.println(c1.saque(1001) == false); // CC máximo 1000 saque
    System.out.println(c1.depositoCheque(1001) == false); // CC máximo 1000 dep cheque

    System.out.println(c1.saldo() == 5000);
    System.out.println(c1.saldoDisponivelSaque() == 5000);

    System.out.println(c1.saque(1000) == true);
    System.out.println(c1.depositoCheque(900) == true);
    System.out.println(c1.saldo() == 4900);
    System.out.println(c1.saldoDisponivelSaque() == 4900);


    Conta c2 = new Conta("33344455533", 'E', 700); // [E]special

    System.out.println(c2.tipo().equals("Especial"));

    System.out.println(c2.ativa() == false);
    System.out.println(banco.abreConta(c2, 300) == true);
    System.out.println(c2.ativa() == true);

    System.out.println(c2.saldo() == 300);
    System.out.println(c2.limite() == 700);

    System.out.println(c2.limiteUsado() == 0);
    System.out.println(c2.saldoDisponivelSaque() == 1000);

    System.out.println(c2.saque(200) == true);
    System.out.println(c2.saldo() == 100);
    System.out.println(c2.limite() == 700);
    System.out.println(c2.limiteUsado() == 0);

    System.out.println(c2.saldoDisponivelSaque() == 800);

    System.out.println(c2.saque(300) == true);
    System.out.println(c2.saldo() == -200);
    System.out.println(c2.limite() == 700);
    System.out.println(c2.limiteUsado() == 200);
    System.out.println(c2.saldoDisponivelSaque() == 500);

    System.out.println(c2.depositoCheque(2000) == true); // Especial tem tudo no dobro da Corrente
    System.out.println(c2.saque(2000) == true);
    System.out.println(c2.saldoDisponivelSaque() == 500);

    System.out.println(c2.saque(2001) == false);

    System.out.println(c2.saldo() == -200);
    System.out.println(c2.limite() == 700);
    System.out.println(c2.limiteUsado() == 200);
    System.out.println(c2.saldoDisponivelSaque() == 500);


    Conta c3 = new Conta("22233399944", 'P'); // [P]oupança

    System.out.println(c3.tipo().equals("Poupanca"));

    System.out.println(c3.ativa() == false);
    System.out.println(banco.abreConta(c3, 1000) == true);
    System.out.println(c3.ativa() == true);

    System.out.println(c3.saldo() == 1000);
    System.out.println(c3.saldoDisponivelSaque() == 1000);
    System.out.println(c3.limite() == 0);

    System.out.println(c3.saque(100) == true);
    System.out.println(c3.saldo() == 900);
    System.out.println(c3.saldoDisponivelSaque() == 900);

    System.out.println(c3.depositoDinheiro(600) == true);
    System.out.println(c3.saldo() == 1500);

    System.out.println(c3.saldoDisponivelSaque() == 1500);
    System.out.println(c3.saque(1400) == true);
    System.out.println(c3.saldo() == 100);
    System.out.println(c3.saldoDisponivelSaque() == 100);

    Conta c4 = new Conta("77733399944", 'S');

    banco.abreConta(c4, 0);
    System.out.println("<Conta Salario>");
    System.out.println(c4.tipo().equals("Salario"));
    System.out.println(c4.saldo() == 0);
    System.out.println(c4.saldoDisponivelSaque() == 0);
    // sem limite para deposito
    System.out.println(c4.depositoDinheiro(4000) == true);
    System.out.println(c4.depositoCheque(4000) == true);
    System.out.println(c4.saldoDisponivelSaque() == 8000);
    // saque sem limite de valor
    // ate 3 saques sem tarifas
    // apos R$ 5 por saque
    System.out.println(c4.saque(6000) == true);
    System.out.println(c4.saldoDisponivelSaque() == 2000);
    System.out.println(c4.saque(500) == true);
    System.out.println(c4.saque(500) == true);
    System.out.println(c4.saque(500) == true); // R$ 5
    System.out.println("</Conta Salario>");
    // roda as taxas, tarifas e rendimentos em todas as contas ativas
    banco.cicloMensal();

    // conta comum desconta tarifa R$ 15
    System.out.println(c1.saldo() == 4885);
    System.out.println(c1.saldoDisponivelSaque() == 4885);
    // especial desconta a tarifa básica R$ 20 + 10% do limite usado
    System.out.println(c2.saldo() == -240);
    System.out.println(c2.limite() == 700);
    System.out.println(c2.limiteUsado() == 240);
    System.out.println(c2.saldoDisponivelSaque() == 460);
    // poupança rende 1%
    System.out.println(c3.saldo() == 101);
    System.out.println(c3.saldoDisponivelSaque() == 101);

    // implica em sacar tudo e inativar
    System.out.println(banco.fechaConta(c1) == true);
    System.out.println(c1.ativa() == false);
    System.out.println(c1.saldo() == 0);
    System.out.println(c1.saldoDisponivelSaque() == 0);

    // não pode fechar se tiver saldo negativo
    System.out.println(banco.fechaConta(c2) == false);
    System.out.println(c2.saldo() == -240);
    System.out.println(c2.limite() == 700);
    System.out.println(c2.limiteUsado() == 240);
    System.out.println(c2.saldoDisponivelSaque() == 460);

  }
}
