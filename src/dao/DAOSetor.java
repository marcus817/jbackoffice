package dao;
 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;

import idao.IDAOSetor;
import model.*;
import util.JPAUtil;


public class DAOSetor extends DAO<Setor> implements IDAOSetor {

	public DAOSetor(Class<Setor> classe) {
		super(classe);
		// TODO Auto-generated constructor stub
	}
	
	/*public List <Setor> listarFuncionarios {
		EntityManager em = new JPAUtil().getEntityManager();
		Session session = em.unwrap(Session.class);
		Criteria crit = session.createCriteria(Setor.class);
		crit.createAlias("funcionarios", fm)
		
		//CriteriaQuery<Setor> query = em.getCriteriaBuilder().createQuery(Setor.class);
		
	}*/

}