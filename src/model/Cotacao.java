package model;


import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Cotacao {
	
	public Cotacao(){
		
	}
	
	public Cotacao(Funcionario funcionario, Compra compra ){
		this.dataCotacao = Calendar.getInstance();
		this.funcionario = funcionario;
		this.compra = compra;
		this.status = StatusAutorizacao.PENDENTE;
		this.setor = funcionario.getSetor();
	}
	/*------------------------------------------------------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Calendar dataCotacao;
	@Enumerated(EnumType.STRING)
	private StatusAutorizacao status;
	@ManyToOne
	private Funcionario funcionario;
	@OneToOne
	private Compra compra;
	@ManyToOne
	private Setor setor;
	/*------------------------------------------------------------*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDataCotacao() {
		return dataCotacao;
	}
	public void setDataCotacao(Calendar dataCotacao) {
		this.dataCotacao = dataCotacao;
	}
	public StatusAutorizacao getStatus() {
		return status;
	}
	public void setStatus(StatusAutorizacao status) {
		this.status = status;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	/*------------------------------------------------------------*/
	
}
