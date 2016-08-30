package idao;

import java.util.Collection;
import java.util.List;

import model.CotacaoFornecedor;

public interface IDAOCotacaoFornecedor {

	public void alterar(CotacaoFornecedor cotacaoFornecedor);
	
	public void inserir(CotacaoFornecedor cotacaoFornecedor);
	
	public void remover(CotacaoFornecedor cotacaoFornecedor);
	
	public void inserirColecao(Collection<CotacaoFornecedor> cotacaoFornecedor);
	
	public CotacaoFornecedor consultarPorId(Integer chave);
	
	public List<CotacaoFornecedor> consultarTodos();
}
