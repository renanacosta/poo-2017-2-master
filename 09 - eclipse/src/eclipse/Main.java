package eclipse;

public class Main {

	public static void main(String[] args) {
		System.out.println("Eclipse!!!");			
		String v = "teste";
		System.out.println(v);
		
		Dinheiro d1 = new Dinheiro(5, 25);
		System.out.println(d1); // R$ 5,25
		d1.maisReais(4);
		System.out.println(d1); // R$ 9,25
		
		Dinheiro d2 = new Dinheiro(9, 25);
		System.out.println(d1.equals(d2));
		
		
		
	}

}
