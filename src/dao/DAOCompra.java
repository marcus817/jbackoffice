package dao;

import idao.IDAOCompra;
import model.Compra;




public class DAOCompra extends DAO<Compra> implements IDAOCompra {

	public DAOCompra(Class<Compra> classe) {
		super(classe);
		// TODO Auto-generated constructor stub
	}

	public void compraPendente(){
		
	}
	
	public boolean compraValida(Integer ids){
		if(buscaPorId(ids) != null){
			return true;
		}
		return false;
	}
}
