package dao;

import idao.IDAOFornecedor;
import model.Fornecedor;

import javax.persistence.EntityManager;

public class DAOFornecedor extends DAOGenerico<Fornecedor> implements IDAOFornecedor {
	
	public DAOFornecedor(EntityManager em) { super(em);}

}
