package bean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import fachada.*;
import javassist.expr.NewArray;
import dao.DAOCompra;
import model.Compra;
import model.Cotacao;

@ManagedBean
@ViewScoped
public class CotacaoBean {
	
	
	private Integer idCompra;
	private Compra compra;
	private Cotacao cotacao;
	fachada f = new fachada();
	DAOCompra dc = new DAOCompra(Compra.class);
	public String buscar() {
		
		
		return  f.buscaCompra(this.idCompra);
		
	}

	public void find() throws IOException, InterruptedException{
		FacesMessage msg = null;
		Thread.sleep(2000);
		if(dc.buscaPorId(this.idCompra) != null){
			msg = new FacesMessage("Compra Cadastrada. ");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
			FacesContext.getCurrentInstance().getExternalContext().redirect("pedidoCotacao.xhtml");
		}else{
			msg = new FacesMessage("Compra Inexistente");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Cotacao getCotacao() {
		return cotacao;
	}

	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}

}
