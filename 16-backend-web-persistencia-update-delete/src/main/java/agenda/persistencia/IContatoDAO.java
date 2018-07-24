package agenda.persistencia;

import agenda.modelo.Contato;

public interface IContatoDAO {
	
	// CRUD
	// Create (criar, insert, salvar)
	// Read   (ler, select, load, carregar)
	// Update (atualizar, update)
	// Delete (excluir, delete, remover)
	
	void create(Contato c);
	
	Contato[] read();
	
	void update(Contato c);
	
	void delete(Contato c);
	

}
