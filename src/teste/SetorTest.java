package teste;

import org.junit.Before;
import org.junit.Test;

import dao.DAOCompra;
import junit.framework.TestCase;
import model.Compra;
import model.Gerente;
import model.Setor;
public class SetorTest extends TestCase{
	private Setor setor;
	private Gerente gerente;
	private boolean compra;
	
	@Before
	public void setUp() throws Exception{
		this.setor = new Setor("TI");
		this.gerente = new Gerente("André Rotílio", "rotiliob@gmail.com",this.setor, "Nordeste");
		
	}
	

	@Test
	public void testVerificaNomeGerente() throws Exception {
		this.gerente.setNome("Paulo Ricardo");
		String retorno = this.gerente.verificarNome();
		assertEquals("Testa Nome","Paulo Ricardo", retorno);
	}

	@Test
	public void testeVerificaSetor() throws Exception{
		this.gerente.setSetor(setor);
		assertFalse(false);
	}
	
	@Test
	public void testaBuscaCompra(){
		this.compra = new DAOCompra(Compra.class).compraValida(6);
		assertTrue(compra);
	}
}

