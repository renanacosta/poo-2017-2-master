package polimorfismo;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		// polimorfismo paramétrico
		// é passar o Tipo como um parâmetro
		// na linguagem Java: se chama Generics
		
		// Box<Integer> b = new Box(); // não recomendado
		// Box<Integer> b = new Box<Integer>(); // completo
		Box<Integer> b = new Box<>(); // diamond: recomendado
		
		System.out.println(b.isEmpty() == true);
		System.out.println(b.get() == null);
		
		b.set(1);
		
		System.out.println(b.isEmpty() == false);
		System.out.println(b.get().equals(1));
		
		int v = b.get(); // sem cast!
		
		b.set(b.get() + 1); // incrementa
		
		System.out.println(b.get().equals(2));
		
		
		
		
		
		
		
		
		
		
	}
}

