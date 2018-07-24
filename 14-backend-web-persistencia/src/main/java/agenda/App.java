package agenda;

import agenda.modelo.Contato;
import agenda.persistencia.CSVContatoDAO;
import agenda.persistencia.IContatoDAO;
import agenda.persistencia.TransientContatoDAO;
import agenda.rotas.RotaReadContatos;
import agenda.rotas.RotaCreateContato;
import agenda.rotas.RotaOi;
import spark.*;

public class App {
	public static void main(String[] args) {
		
		
		
		ResponseTransformer json = new JsonTransformer();
		
		IContatoDAO dao = new CSVContatoDAO();
		
		Route rotaContatos = new RotaReadContatos(dao);
		
		Spark.get("/contatos", rotaContatos, json);
		
		Route rotaCreateContato = new RotaCreateContato(dao);
		
		Spark.post("/contato", rotaCreateContato);
		
		
		
		
		
		
		
		
		
	}
}
