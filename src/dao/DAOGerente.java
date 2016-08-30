package dao;

import idao.IDAOGerente;
import model.Gerente;


public class DAOGerente extends DAO<Gerente> implements IDAOGerente {
	
	public DAOGerente(Class<Gerente> classe) {
		super(classe);
		// TODO Auto-generated constructor stub
	}
}