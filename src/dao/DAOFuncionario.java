package dao;

import idao.IDAOFuncionario;
import model.Funcionario;
import model.Gerente;
import model.Setor;
import util.JPAUtil;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DAOFuncionario extends DAO<Funcionario>  {
	
	public DAOFuncionario(Class<Funcionario> classe) { 
		super(classe);
		
	}

	

	public List<Funcionario> listaSetor (Setor setor){
		EntityManager em = new JPAUtil().getEntityManager();
		Session session = em.unwrap(Session.class);
		Criteria crit = session.createCriteria(Funcionario.class);
		crit.add(Restrictions.eq("setor", setor));
		List<Funcionario> lista = crit.list();
		return lista;
	}
}
