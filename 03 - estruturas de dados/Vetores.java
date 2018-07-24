class Vetores {

	/*
	//recebe duas frações e devolve a fração resultante
	static int multiplica(num1, den1, num2, den2) {
		//recebe quatro parametros, mas somente duas informações (duas frações)
		int numr = num1*num2;
		int denr = den1*den2;
		//não dá para retornar dois resultados
	}

	public static void main(String[] args) {
		
		//frações - numerador e denominador
		int num1 = 2;
		int den1 = 3;
		int num2 = 3;
		int den2 = 4;

	}*/

	static int[] multiplica(int[] fracao1, int[] fracao2) {
		//rejeitar vetores que não vem no formato esperado
		/*
		if (fracao1.length != 2 || fracao2.length != 2) {
			throw new IllegalArgumentException("A fração deve ter numerador e denominador");
		}*/
		//considerar denominador 1 no caso de só vir o numerador
		int[] r = {fracao1[0]*fracao2[0], (fracao1.length == 2 ? fracao1[1] : 1) * (fracao2.length == 2 ? fracao2[1] : 1)};
		return r;
	}

	public static void main(String[] args) {
		
		//int[] = int vetor, vetor de inteiros, arranjo de int, int array
		int[] fracao1 = {2, 3}; //fração dois terços

		System.out.println(fracao1); //id do objeto vetor na memoria 
		System.out.println(fracao1[0]); //2
		System.out.println(fracao1[1]); //3
		//System.out.println(fracao1[2]); //index out of bounds
		System.out.println(fracao1[0] + "/" + fracao1[1]);

		int[] fracao2 = {3, 4};

		int[] fracaor = multiplica(fracao1, fracao2);

		System.out.println(fracaor[0] + "/" + fracaor[1]);

		int[] fracao3 = {3};

		fracaor = multiplica(fracao1, fracao3);

		System.out.println(fracaor[0] + "/" + fracaor[1]);		

	}
}