
public class Euro implements IFormatador {

	@Override
	public String formataISO(int inteiro, int centavos) {		
		return "EUR " + inteiro + ","
				+ (centavos < 10 ? "0" : "") + centavos;
	}

	@Override
	public String formata(int inteiro, int centavos) {
		return "€ " + inteiro + ","
				+ (centavos < 10 ? "0" : "") + centavos;
	}
}
