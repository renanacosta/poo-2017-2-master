package agenda;

import spark.*;

public class App {
	public static void main(String[] args) {
		// rota: URL: /oi
		// ex:
		// /produto/venda/estado/rs/fretegratis
		
		Route oi = new RotaOi();		
		Spark.get("/oi", oi); // endpoint da rota: /oi
		
		Contato c1 = new Contato("Kalleo", "77338833", "k@k.com");
		Contato c2 = new Contato("Bernardo", "99882233", "b@b.com");
		Contato c3 = new Contato("Myreli", "88334411", "m@m.com");
		Contato c4 = new Contato("Jonathan", "77334411", "j@j.com");
		
		Contato[] contatos = {c1, c2, c3, c4};
		
		ResponseTransformer json = new JsonTransformer();
		
		Route rotaContatos = new RotaContatos(contatos);
		
		Spark.get("/contatos", rotaContatos, json);
		
		
		
		
		
		
		
		
		
		
	}
}
