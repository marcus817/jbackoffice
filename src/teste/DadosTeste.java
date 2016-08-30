package teste;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.EntityManager;

import dao.DAOFuncionario;
import dao.DAOSetor;
import model.Compra;
import model.Funcionario;
import model.Setor;
import service.PurchaseService;
import util.JPAUtil;

public class DadosTeste {

	public static void main(String[] args) {
		
		
		Setor setor = new DAOSetor(Setor.class).buscaPorId(1);
		List<Funcionario> list =  new DAOFuncionario(Funcionario.class).listaSetor(setor);
		for (Funcionario funcionario : list) {
			System.out.println("Nome: "+funcionario.getNome()+"\n"+
					"Função:  "+funcionario.getCargo()+"\n"+
					"Setor:  "+funcionario.getSetor().getDescricao());
		} 
		
	
			
	
	
}
	
	
	
}
	
	
