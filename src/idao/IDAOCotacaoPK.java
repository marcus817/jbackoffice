package idao;

import java.util.Collection;
import java.util.List;

import model.CotacaoPK;

public interface IDAOCotacaoPK {
	
	public void alterar(CotacaoPK cotacaoPK);
	
	public void inserir(CotacaoPK cotacaoPK);
	
	public void remover(CotacaoPK cotacaoPK);
	
	public void inserirColecao(Collection<CotacaoPK> cotacaoPK);
	
	public CotacaoPK consultarPorId(Integer chave);
	
	public List<CotacaoPK> consultarTodos();
}
