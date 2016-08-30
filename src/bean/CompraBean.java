package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOCompra;
import dao.DAOFuncionario;
import dao.DAOSetor;
import model.Compra;
import model.Funcionario;
import model.Setor;
import model.StatusAutorizacao;

@ManagedBean
@ViewScoped
public class CompraBean {

	private Compra compra = new Compra();
	private Integer setorId;
	private Integer funId;
	@SuppressWarnings("unused")
	private List<Funcionario> funcionarios;
	private Setor setor;
	
	
	
	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Integer getSetorId() {
		return setorId;
	}

	public void setSetorId(Integer setorId) {
		this.setorId = setorId;
	}

	 

	public Integer getFunId() {
		return funId;
	}

	public void setFunId(Integer funId) {
		this.funId = funId;
	}

	public List<Funcionario> getFuncionarios() {
		return new DAOFuncionario(Funcionario.class).listaSetor(setor);
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Setor> getSetores() {
		return new DAOSetor(Setor.class).listaTodos();
	}

	public void onSetorChange() {
		if (setorId != null && !setorId.equals(""))
			setor = new DAOSetor(Setor.class).buscaPorId(setorId);
	}
	
	public void gravar(){
			Setor setor = new DAOSetor(Setor.class).buscaPorId(this.setorId);
			Funcionario funcionario = new DAOFuncionario(Funcionario.class).buscaPorId(this.funId);
			this.compra.setFuncionario(funcionario);
			this.compra.setSetor(setor);
			this.compra.setStatus(StatusAutorizacao.PENDENTE);
			new DAOCompra(Compra.class).adicionar(compra);
			this.compra =  new Compra();
	}

}
