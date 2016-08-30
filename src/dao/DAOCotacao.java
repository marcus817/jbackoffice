package dao;

import idao.IDAOCotacao;
import model.Cotacao;

import javax.persistence.EntityManager;

public class DAOCotacao extends DAOGenerico<Cotacao> implements IDAOCotacao {
	
	public DAOCotacao(EntityManager em) { super(em);}

}