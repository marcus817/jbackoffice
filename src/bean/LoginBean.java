package bean;



import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class LoginBean {
	
	private String usuario;
	private String senha;
	
	public String logar() throws ServletException{
		
		try {
			this.getRequest().login(this.usuario, this.senha);
			return "index?face-redirect=true";
		} catch (ServletException e) {
			this.getRequest().logout();
			System.out.println(e);
			return null;
		}
		
	}
	
	public String sair() throws ServletException {
		this.getRequest().logout();
		return "login?faces-redirect=true";
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	private HttpServletRequest getRequest() {
		FacesContext context = FacesContext.getCurrentInstance();
		return (HttpServletRequest) context.getExternalContext().getRequest();
	}
 
}
