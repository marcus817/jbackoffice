package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class CotacaoPK implements Serializable {
	
	private static final long serialVersionUID = -7775582370899276501L;
	
	@ManyToOne
	private Cotacao cotacao;
	@ManyToOne
	private Fornecedor fornecedor;
/*------------------------------------------------------------------*/
	public CotacaoPK() {
		
	}
	public CotacaoPK(Cotacao cotacao, Fornecedor fornecedor) {
		super();
		this.cotacao = cotacao;
		this.fornecedor = fornecedor;
	}
	/*------------------------------------------------------------*/
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof CotacaoPK)){
			CotacaoPK cotacaoPK = (CotacaoPK) obj;
			if(!cotacaoPK.getCotacao().equals(cotacao)){
				return false;
			}
			if(!cotacaoPK.getFornecedor().equals(fornecedor)){
				return false;
			}
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		return cotacao.hashCode()+fornecedor.hashCode();
	}
	
	public Cotacao getCotacao() {
		return cotacao;
	}
	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	/*------------------------------------------------------------------*/
	
	
}
