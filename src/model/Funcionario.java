package model;

import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Funcionario extends Pessoa {
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nome, String email, String senha, String cargo, Setor setor) {
		super(nome, email);
		this.setor = setor;
		this.cargo = cargo;
		this.senha = senha;
	}

		public Setor validaSetor() throws Exception{
		
		if(setor != null){
			this.setor = setor;
		}else {
			throw new Exception("Setor deve ser Selecionado");
		}
		return setor;
	}
	
	

	private String senha;
	private String cargo;
	@ManyToOne
	private Setor setor;
	@Temporal(TemporalType.DATE)
	private Calendar dataAdmissao = Calendar.getInstance();
	@OneToMany(mappedBy="funcionario")
	private List<Compra> compras;
	@OneToMany(mappedBy="funcionario")
	private List<Cotacao> cotacao;
	@OneToMany(mappedBy="funcionario")
	private List<Reembolso> reembolsos;
	
	
	
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<Cotacao> getCotacao() {
		return cotacao;
	}

	public void setCotacao(List<Cotacao> cotacao) {
		this.cotacao = cotacao;
	}

	public List<Reembolso> getReembolsos() {
		return reembolsos;
	}

	public void setReembolsos(List<Reembolso> reembolsos) {
		this.reembolsos = reembolsos;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		
		return "Funcionario [Nome="+getNome();
	}

	
	
	
}
