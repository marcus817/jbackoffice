package dao;

import idao.IDAOCotacaoFornecedor;
import model.CotacaoFornecedor;

import javax.persistence.EntityManager;

public class DAOCotacaoFornecedor extends DAOGenerico<CotacaoFornecedor> implements IDAOCotacaoFornecedor {
	
	public DAOCotacaoFornecedor(EntityManager em) { super(em);}

}