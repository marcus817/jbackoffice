package bean;




import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.DAOSetor;
import model.Setor;

@ManagedBean
public class SetorBean {
	
	public Setor setor =  new Setor();
	

	public Setor getSetor() {
		return setor;
	}
	
	
	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	/*public List<Setor> getFunciorarios(){
		return new DAOSetor(Setor.class).
	}*/
	
	public void gravar(){
		
		new DAOSetor(Setor.class).adicionar(this.setor);
		System.out.println("Setor Gravado");
		this.setor = new Setor();
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso","Setor Salvo Com Sucesso"));
		
		//return "index";
	
	}
}
