package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Gerente extends Pessoa{
	
	public Gerente(){
		
	}

	public Gerente(String nome, String email, Setor setor, String locacao) {
		super(nome, email);
		this.locacao = locacao;
		this.setor = setor;
	}

	private String locacao;
	@OneToOne
	private Setor setor;
	

	public String getLocacao() {
		return locacao;
	}

	public void setLocacao(String locacao) {
		this.locacao = locacao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	
	
}
