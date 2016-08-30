package service;

import dao.DAOCompra;
import idao.IDAOCompra;
import model.Compra;

public class PurchaseService {
	
	IDAOCompra purchase;
	
		
	public PurchaseService(){
		
		purchase = new DAOCompra(Compra.class);
	}

	public void validatePurchase (Compra c) throws Exception   {
		
		if(c.getFuncionario() == null){
			throw new Exception("Erro ao definir usuario");
		}
		if(c.getDataSolicitacao() == null){
			throw new Exception("Favor Verificar a Data");
		}
		
	}
}
