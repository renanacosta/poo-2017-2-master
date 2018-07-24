package agenda.rotas;

import spark.Request;
import spark.Response;
import spark.Route;

public class RotaOi implements Route {

	public Object handle(Request requisicao, Response resposta) throws Exception {		
		return "Oi, tudo bem? Servidor do Márcio!";
	}

}
