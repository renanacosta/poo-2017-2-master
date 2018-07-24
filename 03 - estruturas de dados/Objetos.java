class Objetos {

	static Fracao multiplica(Fracao f1, Fracao f2) {
		Fracao r = new Fracao();
					//construir/criar/instanciar
		r.numerador = f1.numerador*f2.numerador;
		r.denominador = f1.denominador*f2.denominador;

		return r;
	}

	public static void main(String[] args) {
		
		Fracao fracao1 = new Fracao(); //Fracao()-> construtor
		
		System.out.println(fracao1.numerador);
		System.out.println(fracao1.denominador);

		fracao1.numerador = 2;
		fracao1.denominador = 3;

		System.out.println(fracao1);
		System.out.println(fracao1.numerador);
		System.out.println(fracao1.denominador);

		Fracao fracao2 = new Fracao();
		fracao2.numerador = 3;
		fracao2.denominador = 4;

		Fracao resp = multiplica(fracao1, fracao2);

		System.out.println(resp.numerador == 6);
		System.out.println(resp.denominador == 12);

	}
}