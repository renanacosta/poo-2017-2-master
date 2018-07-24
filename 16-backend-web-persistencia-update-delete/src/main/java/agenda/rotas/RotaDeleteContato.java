package agenda.rotas;

import agenda.modelo.Contato;
import agenda.persistencia.IContatoDAO;
import spark.Request;
import spark.Response;
import spark.Route;

public class RotaDeleteContato implements Route {

	private IContatoDAO dao;

	public RotaDeleteContato(IContatoDAO dao) {
		this.dao = dao;
	}

	public Object handle(Request req, Response resp) throws Exception {
		resp.header("Access-Control-Allow-Origin", "*");
		int codigo = Integer.parseInt(req.params("codigo"));
		Contato c = new Contato();
		c.setCodigo(codigo);
		dao.delete(c);
		resp.status(200);
		return "OK";
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
