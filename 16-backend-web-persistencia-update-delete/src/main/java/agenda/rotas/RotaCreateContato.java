package agenda.rotas;

import org.eclipse.jetty.http.HttpStatus;

import com.google.gson.Gson;

import agenda.modelo.Contato;
import agenda.persistencia.IContatoDAO;
import spark.Request;
import spark.Response;
import spark.Route;

public class RotaCreateContato implements Route {

	private IContatoDAO dao;

	public RotaCreateContato(IContatoDAO dao) {
		this.dao = dao;
	}

	public Object handle(Request req, Response resp) throws Exception {
		resp.header("Access-Control-Allow-Origin", "*");		
		String json = req.body(); // pega o json da request
		System.out.println("post: " + json);
		Gson gson = new Gson(); // conversor
		Contato contato = gson.fromJson(json, Contato.class); // converte json para java
		dao.create(contato); // invoca create no dao
		resp.status(HttpStatus.CREATED_201);
		return "OK"; // resposta
	}

	
	
	
	
	
}
