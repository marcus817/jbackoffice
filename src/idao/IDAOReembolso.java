package idao;

import java.util.Collection;
import java.util.List;

import model.Reembolso;

public interface IDAOReembolso 
{
	public void alterar(Reembolso reembolso);
	
	public void inserir(Reembolso reembolso);
	
	public void remover(Reembolso reembolso);
	
	public void inserirColecao(Collection<Reembolso> reembolso);
	
	public Reembolso consultarPorId(Integer chave);
	
	public List<Reembolso> consultarTodos();
}
