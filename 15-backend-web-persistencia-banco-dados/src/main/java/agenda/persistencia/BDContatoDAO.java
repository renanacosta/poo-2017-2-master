package agenda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.Arrays;

import agenda.modelo.Contato;

public class BDContatoDAO implements IContatoDAO {

	private static final String USUARIO = "aluno";
	private static final String SENHA = "aluno";
	private static final String URL = 
			"jdbc:postgresql://10.132.214.1/poo20172agendamarcio";
 // nome: '); DROP TABLE contatos; 
	public void create(Contato c) {
		
		try {
			// abre a conexão ao banco
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);

			// NÃO SE CONCATENA SQL!!!
			String sql = "INSERT INTO contatos "
					+ "VALUES (DEFAULT, ?, ?, ?)"; // ? => placeholder
			
			// criando um comando/instrução
			PreparedStatement comando = 
					conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			// popular os placeholders
			if (c.getNome() == null) { // se nulo
				comando.setNull(1, Types.VARCHAR); // seta null no bd
			} else {  // senão
				comando.setString(1, c.getNome()); // seta o conteúdo
			}
			
			if (c.getTelefone() == null) {
				comando.setNull(2, Types.VARCHAR);
			} else {
				comando.setString(2, c.getTelefone());
			}
		
			if (c.getEmail() == null) {
				comando.setNull(3, Types.VARCHAR);
			} else {				
				comando.setString(3, c.getEmail());
			}
			
			// invoca o comando no banco!
			comando.execute();
			
			// obtém a chave gerada
			ResultSet chaves = comando.getGeneratedKeys();
			
			// têm uma chave?
			if (chaves.next()) {
				// seta a chave no contato
				c.setCodigo(chaves.getInt(1));
			}
			
			// fecha a conexão
			conexao.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}		
	}

	public Contato[] read() {
		
		Contato[] contatos = new Contato[10000];
		int i = 0;
		
		try {
			// abre a conexão ao banco
			Connection conexao = 
					DriverManager.getConnection(URL, USUARIO, SENHA);

			String sql = "SELECT * FROM contatos";
			
			// comando
			Statement comando = conexao.createStatement();
			
			// pesquisa (query)
			ResultSet resultados = comando.executeQuery(sql);
			
			
			// enquanto houver tuplas
			while (resultados.next()) {
				Contato c = new Contato();
				c.setCodigo(resultados.getInt("codigo"));
				c.setNome(resultados.getString("nome"));
				c.setTelefone(resultados.getString("telefone"));
				c.setEmail(resultados.getString("email"));
				contatos[i++] = c;
			}
			
			// fecha a conexão
			conexao.close();
			
		} catch (Exception e) {
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
