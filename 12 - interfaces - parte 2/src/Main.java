
public class Main {

	public static void main(String[] args) {
		System.out.println("OK");
		
		System.out.println(0.1 + 0.1 + 0.1);
		
		IFormatador real = new Real();
		IFormatador euro = new Euro();
		IFormatador dolar = new Dolar();
		
		Dinheiro d1 = new Dinheiro(3, 50, real); // REAIS
		System.out.println(d1); // 3,50
		System.out.println(d1.toString().equals("R$ 3,50"));
		System.out.println(d1.getISO().equals("BRL 3,50"));
		System.out.println(d1.getValor().equals("R$ 3,50"));
		
		Dinheiro d2 = new Dinheiro();
		System.out.println(d2); // 0,00
		System.out.println(d2.toString().equals("R$ 0,00"));
		
		Dinheiro d3 = new Dinheiro(15);
		System.out.println(d3); // 15,00
		System.out.println(d3.toString().equals("R$ 15,00"));
		
		// método de classe (método estático)
		Dinheiro d4 = Dinheiro.centavos(70);
		System.out.println(d4); // 0,70
		System.out.println(d4.toString().equals("R$ 0,70"));
		
		Dinheiro d5 = new Dinheiro(3, 45, euro); // EURO
		System.out.println(d5); // 3,45
		System.out.println(d5.toString().equals("€ 3,45"));
		System.out.println(d5.getISO().equals("EUR 3,45"));
		
		Dinheiro d6 = new Dinheiro(7, 99, dolar); // USD
		System.out.println(d6); // $ 7.99
		System.out.println(d6.getISO());
		
		Dinheiro d7 = new Dinheiro(5790120, 13); // R$
		System.out.println(d7); // R$ 5.790.120,13
		
		Dinheiro d8 = new Dinheiro(5790120, 13); // US$
		System.out.println(d8); // $ 5,790,120.13
		System.out.println(d8.getISO()); // USD 5,790,120.13 
		
		IFormatador yen = new IFormatador() { // classe anônima
			@Override
			public String formataISO(int inteiro, int centavos) {
				return "JPY " + inteiro + ","
						+ (centavos < 10 ? "0" : "") + centavos;
			}
			
			@Override
			public String formata(int inteiro, int centavos) {
				return "¥ " + inteiro + ","
						+ (centavos < 10 ? "0" : "") + centavos;
			}
		};
		
		System.out.println(yen.formata(1, 30));
		System.out.println(yen.formata(1, 30).equals("¥ 1,30"));
		
		Dinheiro d9 = new Dinheiro(5, 25);
		System.out.println(d9.toString()); // 5,25
		System.out.println(d9.toString(dolar));
		System.out.println(d9.toString(yen));
		System.out.println(d9.toString(euro));
		
		
		
		
		
		
		
		
		
		
	}
}
