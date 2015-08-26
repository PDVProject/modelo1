package dao.generico;

import java.util.List;

import erros.DaoException;

public interface IDAOGenerico<Entidade> {

	public void inserir(Entidade entidade);
	
	public void alterar(Entidade entidade);
	
	public void remover(Entidade entidade);
	
	public Entidade consultarPorId(Integer id);
	
	public List<Entidade> consultarTodos() throws DaoException;
	
	public List<Entidade> consultarTodos(Integer indiceInicial,	Integer quantidade);	

}
