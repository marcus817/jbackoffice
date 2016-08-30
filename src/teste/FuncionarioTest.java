package teste;

import org.junit.Before;
import org.junit.Test;

import dao.DAOCompra;
import junit.framework.TestCase;
import model.Compra;
import model.Funcionario;
import model.Setor;

public class FuncionarioTest extends TestCase{

	private Funcionario funcionario;
	private Setor setorfun;
	private boolean compra;
	
	@Before
	public void setUp() throws Exception{
		this.setorfun = new Setor("TI");
		this.funcionario = new Funcionario("Marcus Santos", "marcus817@gmail.com", "123456", "Analista", this.setorfun);
		
	}

	@Test
	public void testVerificaNomeFuncinario() throws Exception {
		this.funcionario.setNome("Paulo Ricardo");
		String retorno = this.funcionario.verificarNome();
		assertEquals("Testa Nome","Paulo Ricardo", retorno);
	}

	@Test
	public void testeVerificaSetor() throws Exception{
		this.funcionario.setSetor(setorfun);
		assertFalse(false);
	}
	
	@Test
	public void testaBuscaCompra(){
		this.compra = new DAOCompra(Compra.class).compraValida(6);
		assertTrue(compra);
	}	
	
	
	
}
