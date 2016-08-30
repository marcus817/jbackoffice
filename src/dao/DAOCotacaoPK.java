package dao;
 
import idao.IDAOCotacaoPK;
import model.CotacaoPK;

import javax.persistence.EntityManager;

public class DAOCotacaoPK  extends DAOGenerico<CotacaoPK> implements IDAOCotacaoPK {

	public DAOCotacaoPK(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}