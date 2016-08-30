package idao;

import java.util.Collection;
import java.util.List;

import model.Fornecedor;

public interface IDAOFornecedor 
{
	public void alterar(Fornecedor fornecedor);
	
	public void inserir(Fornecedor fornecedor);
	
	public void remover(Fornecedor fornecedor);
	
	public void inserirColecao(Collection<Fornecedor> fornecedor);
	
	public Fornecedor consultarPorId(Integer chave);
	
	public List<Fornecedor> consultarTodos();
}
