package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Setor {
	
	public Setor(){
		
	}
	
	public Setor(String descricao){
		this.descricao = descricao;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descricao;
	private String sigla;
	@OneToOne(mappedBy="setor", fetch = FetchType.LAZY)
	private Gerente gerente;
	@OneToMany(mappedBy = "setor", fetch =FetchType.LAZY)
	private List<Funcionario> funcionarios;
	@OneToMany(mappedBy = "setor", fetch = FetchType.LAZY)
	private List<Cotacao> contacoes;
	@OneToMany(mappedBy = "setor", fetch = FetchType.LAZY)
	private List<Compra> compras;
	
	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Cotacao> getContacoes() {
		return contacoes;
	}

	public void setContacoes(List<Cotacao> contacoes) {
		this.contacoes = contacoes;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
	
}
