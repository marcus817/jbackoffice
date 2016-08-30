package idao;


import java.util.List;

import model.Compra;

public interface IDAOCompra {

	public void adicionar(Compra compra);
	
	public void remove(Compra compra);
	
	public void atualiza(Compra compra);
	
	public Compra buscaPorId(Integer chave);
	
	public List<Compra> listaTodos();	
	
}
