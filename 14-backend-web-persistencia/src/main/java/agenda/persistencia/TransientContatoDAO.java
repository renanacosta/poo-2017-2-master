package agenda.persistencia;

import agenda.modelo.Contato;

public class TransientContatoDAO
	implements IContatoDAO {

	public void create(Contato c) {
		// TODO Auto-generated method stub
		
	}

	public Contato[] read() {
		Contato c1 = new Contato("Kalleo", "77338833", "k@k.com");
		Contato c2 = new Contato("Bernardo", "99882233", "b@b.com");
		Contato c3 = new Contato("Myreli", "88334411", "m@m.com");
		Contato c4 = new Contato("Jonathan", "77334411", "j@j.com");
		
		Contato[] contatos = {c1, c2, c3, c4};
		
		return contatos;
	}

	public void update(Contato c) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Contato c) {
		// TODO Auto-generated method stub
		
	}

}
