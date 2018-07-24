class FormatadorPadrao implements IFormatador {

	@Override
	public String formataISO(int inteiro, int centavos) {
		return formata(inteiro, centavos);
	}

	@Override
	public String formata(int inteiro, int centavos) {
		return inteiro + ","
				+ (centavos < 10 ? "0" : "") + centavos;
	}

}
