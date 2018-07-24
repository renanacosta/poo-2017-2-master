package agenda.persistencia;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import agenda.modelo.Contato;

public class CSVContatoDAO implements IContatoDAO {

	public void create(Contato c) {
		String csv = c.getNome() + ";" + c.getTelefone() 
			+ ";" + c.getEmail();
		// IO (E/S) entrada e saída		
		try {
			
			FileOutputStream file = 
					new FileOutputStream("contatos.csv", true);
			PrintStream printer = new PrintStream(file);
			printer.println(csv);
			printer.flush();
			printer.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Contato[] read() {
		Contato[] contatos = new Contato[50];
		int i = 0;
		try {			
			Scanner scan = new Scanner(new File("contatos.csv"));
			while (scan.hasNextLine()) {
				String linha = scan.nextLine();
				System.out.println(linha);
				if (linha.indexOf(";") < 0) break;
				String[] colunas = linha.split(";");
				Contato contato = 
						new Contato(colunas[0], colunas[1], colunas[2]);
				contatos[i++] = contato;
			}
			scan.close();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
		return Arrays.copyOfRange(contatos, 0, i);
	}

	public void update(Contato c) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Contato c) {
		// TODO Auto-generated method stub
		
	}

}
