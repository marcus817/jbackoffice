package idao;

import java.util.Collection;
import java.util.List;

import model.Cotacao;

public interface IDAOCotacao 
{
	public void alterar(Cotacao cotacao);
	
	public void inserir(Cotacao cotacao);
	
	public void remover(Cotacao cotacao);
	
	public void inserirColecao(Collection<Cotacao> cotacao);
	
	public Cotacao consultarPorId(Integer chave);
	
	public List<Cotacao> consultarTodos();
}
