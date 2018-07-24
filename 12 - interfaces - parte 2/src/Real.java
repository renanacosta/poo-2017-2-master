
public class Real implements IFormatador {

	@Override
	public String formataISO(int inteiro, int centavos) {		
		return "BRL " + inteiro + ","
				+ (centavos < 10 ? "0" : "") + centavos;
	}

	@Override
	public String formata(int inteiro, int centavos) {
		return "R$ " + inteiro + ","
				+ (centavos < 10 ? "0" : "") + centavos;
	}

}
