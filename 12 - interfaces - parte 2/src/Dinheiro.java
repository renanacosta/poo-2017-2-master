
public class Dinheiro {

	private final int inteiro, centavos;
	private final IFormatador formatador;

	public Dinheiro(int inteiro, int centavos,
			IFormatador formatador) {
		this.inteiro = inteiro;
		this.centavos = centavos;
		this.formatador = formatador;
	}
	
	public Dinheiro(int inteiro, int centavos) {
		this(inteiro, centavos, new FormatadorPadrao());
	}
	
	public Dinheiro() { this(0, 0); }

	public Dinheiro(int inteiro) { this(inteiro, 0); }
	
	// método fábrica
	public static Dinheiro centavos(int centavos) {
		return new Dinheiro(0, centavos);
	}
	
	public String getISO() {
		// delegando o formato para outro objeto
		return formatador.formataISO(inteiro, centavos);
	}

	public String getValor() {
		return formatador.formata(inteiro, centavos);
	}
	

	@Override
	public String toString() {		
		return getValor();
	}

	public String toString(IFormatador f) {
		return f.formata(inteiro, centavos);
	}
	
	
	
	
	
	
	
	
	
	

}
