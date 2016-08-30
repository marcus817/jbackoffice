package model;


import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa {
	
	private String cpnj;
	
	public Fornecedor(){
		
	}

	public Fornecedor(String nome, String email, String cpnj) {
		super(nome, email);
		this.cpnj = cpnj;
	}
	
		
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	
	
}
