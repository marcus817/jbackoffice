package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class IndexBean {

	public String formCadastraFuncionario() {
		return "funcionario?faces-redirect=true";
	}

	public String formCadastraGerente() {
		return "gerente?faces-redirect=true";
	}

	public String formCadastraSetor() {
		return "setor?faces-redirect=true";
	}
}
