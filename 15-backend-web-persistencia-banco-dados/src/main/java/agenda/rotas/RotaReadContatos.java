package agenda.rotas;

import agenda.modelo.Contato;
import agenda.persistencia.IContatoDAO;
import spark.Request;
import spark.Response;
import spark.Route;

public class RotaReadContatos implements Route {

	private IContatoDAO dao;

	public RotaReadContatos(IContatoDAO dao) {
		this.dao = dao;
	}

	public Object handle(Request arg0, Response resp) throws Exception {
		resp.header("Content-Type", "application/json"); // mime-type
		resp.header("Access-Control-Allow-Origin", "*");
		return dao.read();
	}

	
	
	
	
	
	
	
	
	
	
}
