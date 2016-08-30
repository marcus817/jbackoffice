package bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import dao.DAOGerente;
import dao.DAOSetor;

import model.Gerente;
import model.Setor;

@ManagedBean
@ViewScoped
public class GerenteBean {
	
	private Gerente gerente =  new Gerente();
	private Integer setorId;

	
	public Gerente getGerente() {
		return gerente;
	}



	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}



	public Integer getSetorId() {
		return setorId;
	}



	public void setSetorId(Integer setorId) {
		this.setorId = setorId;
	}



	public void gravar(){
		Setor setor = new DAOSetor(Setor.class).buscaPorId(setorId);
		if(setor.getGerente()!= null){
			//throw new RuntimeException("Setor Já Possui Gerente");
			FacesContext.getCurrentInstance().addMessage("gerente", new FacesMessage("Setor Já Possui Gerente"));
			return;
		}
		this.gerente.setSetor(setor);
		new DAOGerente(Gerente.class).adicionar(this.gerente);
		System.out.println("Gerente Adicionado com Sucesso");
	}
	
	public List<Setor> getSetores(){
		return new DAOSetor(Setor.class).listaTodos();
	}
}
