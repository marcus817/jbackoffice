package idao;


import java.util.List;
import model.Gerente;


public interface IDAOGerente 
{
	public void adicionar(Gerente gerente);
	
	public void remove(Gerente gerente);
	
	public void atualiza(Gerente gerente);
		
	public Gerente buscaPorId(Integer chave);
	
	public List<Gerente> listaTodos();
}
