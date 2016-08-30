package idao;

import java.util.Collection;
import java.util.List;

import model.Funcionario;

public interface IDAOFuncionario 
{
	
	public void alterar(Funcionario funcionario);
	
	public void inserir(Funcionario funcionario);
	
	public void remover(Funcionario funcionario);
	
	public void inserirColecao(Collection<Funcionario> funcionario);
	
	public Funcionario consultarPorId(Integer chave);
	
	public List<Funcionario> consultarTodos();

}
