package agenda;

import spark.Request;
import spark.Response;
import spark.Route;

public class RotaContatos implements Route {

	private Contato[] contatos;

	public RotaContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public Object handle(Request arg0, Response resp) throws Exception {
		resp.header("Content-Type", "application/json"); // mime-type
		resp.header("Access-Control-Allow-Origin", "*");
		return contatos;
	}

	
	
	
	
	
	
	
	
	
	
}
