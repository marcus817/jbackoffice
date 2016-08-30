package fachada;

import Regras.RNGerente;
import dao.DAOCompra;
import model.Compra;
import model.Setor;

public class fachada {
		

	
	public String buscaCompra(int compra){
			if (new DAOCompra(Compra.class).buscaPorId(compra) != null) {

				System.out.println("Achou, Mas não exibiu");
				return "pedidoCotacao";
			}else {
				System.out.println("N�o Localizado");
				return "cotacao";
			}
			
		}
		
		
		
}
