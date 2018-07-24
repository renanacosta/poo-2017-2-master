package agenda;

import agenda.modelo.Contato;
import agenda.persistencia.BDContatoDAO;
import agenda.persistencia.CSVContatoDAO;
import agenda.persistencia.IContatoDAO;
import agenda.persistencia.TransientContatoDAO;
import agenda.rotas.RotaReadContatos;
import agenda.rotas.RotaUpdateContato;
import agenda.rotas.RotaCreateContato;
import agenda.rotas.RotaDeleteContato;
import agenda.rotas.RotaOi;
import spark.*;

public class App {
	public static void main(String[] args) {
		
		
		
		ResponseTransformer json = new JsonTransformer();
		
		IContatoDAO dao = new BDContatoDAO();
		
		Route rotaContatos = new RotaReadContatos(dao);
		
		Spark.get("/contatos", rotaContatos, json);
		
		Route rotaCreateContato = new RotaCreateContato(dao);
		
		Spark.post("/contato", rotaCreateContato);
		
		Route rotaDeleteContato = new RotaDeleteContato(dao);
		
		// USE a extensão POSTMAN do Chrome para testar as rotas
		// ver vídeo!
		
		Spark.delete("/contato/:codigo", rotaDeleteContato);
		
		Route rotaUpdateContato = new RotaUpdateContato(dao);
		
		Spark.put("/contato/:codigo", rotaUpdateContato);
		
		
		/*
		Contato teste = new Contato("teste","99999999","e@mail.me");
		
		// TRANSITÓRIO (transient)
		System.out.println(teste.getCodigo()); // null
		System.out.println(teste.getCodigo() == null);
		System.out.println(teste.isPersistente() == false);
		
		dao.create(teste);
		
		// PERSISTENTE
		System.out.println(teste.getCodigo());
		System.out.println(teste.getCodigo() != null);
		System.out.println(teste.isPersistente() == true);
	
		Contato[] todos = dao.read();
		
		for (Contato um : todos) System.out.println(um);
		
		System.out.println("feitooooo");
		
		Contato c1 = dao.read()[3];
		
		System.out.println(c1);
		
		c1.setNome("cobaia");
		
		dao.update(c1);
		// dao.delete(c1);
		
		System.out.println(c1);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
