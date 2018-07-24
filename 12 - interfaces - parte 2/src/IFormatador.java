// serve de base para o algoritmo de formato
// do dinheiro

public interface IFormatador {

	String formataISO(int inteiro, int centavos);

	String formata(int inteiro, int centavos);

}
