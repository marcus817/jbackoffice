package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAO;
import dao.DAOFuncionario;
import dao.DAOSetor;
import model.Funcionario;
import model.Setor;

@ManagedBean
@ViewScoped
public class FuncionarioBean {

	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> funsetor;
	private Integer setorId;
	private Integer setorIdBusca;


	public Integer getSetorIdBusca() {
		return setorIdBusca;
	}

	public void setSetorIdBusca(Integer setorIdBusca) {
		this.setorIdBusca = setorIdBusca;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Integer getSetorId() {
		return setorId;
	}

	public void setSetorId(Integer setorId) {
		this.setorId = setorId; 
	}
	
	public List<Setor>getSetores(){
		return new DAOSetor(Setor.class).listaTodos();
	}
	
	
	public List<Funcionario> getFunsetor() {
		return funsetor;
	}

	public void setFunsetor(List<Funcionario> funsetor) {
		this.funsetor = funsetor;
	}

	public void gravarSetor(){
		Setor SetorBusca = new DAO<Setor>(Setor.class).buscaPorId(this.setorIdBusca);
		
		
		setFunsetor(new DAOFuncionario(Funcionario.class).listaSetor(SetorBusca));

		
		
	}
	
	/*public List<Funcionario> getFuncionariosSetor(){
		//Setor setor = new DAOSetor(Setor.class).buscaPorId(this.setorIdBusca);
		//return new DAOFuncionario(Funcionario.class).listaSetor(SetorBusca);
	}
	*/
	public void gravar(){
		/*if(funcionario.getSetor() == null){
			throw new RuntimeException("É necessario definir um setor para o funcionario!");
		}*/
		Setor setor = new DAO<Setor>(Setor.class).buscaPorId(this.setorId);
		this.funcionario.setSetor(setor);
		new DAO<Funcionario>(Funcionario.class).adicionar(this.funcionario);
		System.out.println("Funcionario Inserido com Sucesso!");
		this.funcionario = new Funcionario();
	}
}
