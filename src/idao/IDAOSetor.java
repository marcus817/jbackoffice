package idao;


import java.util.List;

import model.Setor;

public interface IDAOSetor 
{
	public void adicionar(Setor setor);
	
	public void remove(Setor setor);
	
	public void atualiza(Setor setor);
		
	public Setor buscaPorId(Integer chave);
	
	public List<Setor> listaTodos();
}
