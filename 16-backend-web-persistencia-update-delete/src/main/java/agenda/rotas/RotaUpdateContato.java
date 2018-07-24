package agenda.rotas;

import com.google.gson.Gson;

import agenda.modelo.Contato;
import agenda.persistencia.IContatoDAO;
import spark.Request;
import spark.Response;
import spark.Route;

public class RotaUpdateContato implements Route {

	private IContatoDAO dao;

	public RotaUpdateContato(IContatoDAO dao) {
		this.dao = dao;
	}

	public Object handle(Request req, Response resp) throws Exception {
		resp.header("Access-Control-Allow-Origin", "*");
		Gson gson = new Gson();
		Contato c = gson.fromJson(req.body(), Contato.class);
		int codigo = Integer.parseInt(req.params("codigo"));
		c.setCodigo(codigo);
		dao.update(c);
		resp.status(200);
		return "OK";
	}

	
	
	
	
	
	
	
	
	
	
}
