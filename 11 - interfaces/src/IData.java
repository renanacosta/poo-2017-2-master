/**
 * Interface para tipos Data
 * 
 * @author Márcio Torres
 * @version 0.1beta
 */
interface IData {

	/**
	 * Dia do mês
	 * 
	 * @return dia do mês, um valor entre 1~31
	 */
	int getDia();

	/**
	 * Mês do ano
	 * 
	 * @return mês, um valor entre 1~12
	 */
	int getMes();

	/**
	 * Ano (padrão 2000)
	 * 
	 * @return ano
	 */
	int getAno();

	/**
	 * Data no formado dd/mm/aaaa
	 * 
	 * @return a data no formato brasileiro (dd/mm/aaaa)
	 */
	String getData();

	/**
	 * Adiciona 1 dia à data
	 */
	void amanha();

	/**
	 * Avança um número positivo de dias ou
	 * meses ou anos.
	 * 
	 * @param n quanto avança
	 * @param parte Parte.DIAS, Parte.MESES ou Parte.ANOS
	 * @throws IllegalArgumentException se o número não for positivo 
	 */
	void avanca(int n, Parte parte);

	/**
	 * Volta um número positivo de dias ou
	 * meses ou anos.
	 * 
	 * @param n quanto volta
	 * @param parte Parte.DIAS, Parte.MESES ou Parte.ANOS
	 * @throws IllegalArgumentException se o número não for positivo 
	 */
	void volta(int n, Parte parte);

	/**
	 * Volta um dia 
	 */
	void ontem();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
