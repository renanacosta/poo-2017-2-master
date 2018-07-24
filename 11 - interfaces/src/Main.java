
public class Main {

	public static void main(String[] args) {
		// TipoAbstrato var = new TipoConcreto();		
		IData d1 = new Data();
		
		System.out.println(d1.getDia() == 1);
		System.out.println(d1.getMes() == 1);
		System.out.println(d1.getAno() == 2000);
		
		System.out.println(d1.getData()
				.equals("01/01/2000"));
		System.out.println(d1.toString()
				.equals(d1.getData()));
		
		d1.amanha();
		
		System.out.println(d1.getDia() == 2);
		
		d1.avanca(20, Parte.DIAS);
		
		System.out.println(d1.getDia() == 22);
		
		d1.avanca(20, Parte.DIAS);
		
		System.out.println(d1.getDia() == 11);
		System.out.println(d1.getMes() == 2);
		
		d1.avanca(30, Parte.DIAS);
		
		System.out.println(d1.getDia() == 12);
		System.out.println(d1.getMes() == 3);
		
		d1.avanca(2, Parte.MESES);
		
		System.out.println(d1.getData()
				.equals("12/05/2000"));
		
		d1.volta(11, Parte.DIAS);
		
		System.out.println(d1.getData()
				.equals("01/05/2000"));
		
		d1.ontem();
		
		System.out.println(d1.getData()
				.equals("30/04/2000"));
		

		IHora h1 = new Hora();
		
		System.out.println(h1.getHoras() == 0);
		System.out.println(h1.getMinutos() == 0);
		System.out.println(h1.getSegundos() == 0);
		
		// TODO: testes de hora
		
		IData d2 = new Instante();
		IHora h2 = new Instante();
		
		
	}

}
