package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class CotacaoFornecedor implements Serializable {

	private static final long serialVersionUID = -8527597192682981779L;

	public CotacaoFornecedor(){
		
	}
	
	public CotacaoFornecedor(CotacaoPK cotacaoPK, BigDecimal valor) {
		this.cotacaoPK = cotacaoPK;
		this.valor = valor;
		this.status = StatusCotacaoFornecedor.PENDENTE;
	}
	/*------------------------------------------------------------*/
	@EmbeddedId
	private CotacaoPK cotacaoPK;
	
	private BigDecimal valor;
	@Enumerated(EnumType.STRING)
	private StatusCotacaoFornecedor status;
	/*------------------------------------------------------------*/
	public CotacaoPK getCotacaoPK() {
		return cotacaoPK;
	}
	public void setCotacaoPK(CotacaoPK cotacaoPK) {
		this.cotacaoPK = cotacaoPK;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public StatusCotacaoFornecedor getStatus() {
		return status;
	}
	public void setStatus(StatusCotacaoFornecedor status) {
		this.status = status;
	}
	
	
	
}
