package dao;

import idao.IDAOReembolso;
import model.*;
import dao.DAOGenerico;
import javax.persistence.EntityManager;

public class DAOReembolso extends DAOGenerico<Reembolso> implements IDAOReembolso {
	
	public DAOReembolso(EntityManager em) { super(em);}

}