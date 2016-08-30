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
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Calendar dataSolicitacao = Calendar.getInstance();
	private String descricao;
	private int quantidade;
	@Enumerated(EnumType.STRING)
	private StatusAutorizacao status;
	@ManyToOne
	private Funcionario funcionario;
	@ManyToOne
	private Setor setor;
	@OneToOne(mappedBy ="compra")
	private Cotacao cotacao;
	@OneToOne(mappedBy="compra")
	private Reembolso reembolso;
	
	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
/*------------------------------------------------------------*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(Calendar dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
	public Cotacao getCotacao() {
		return cotacao;
	}
	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}
	public Reembolso getReembolso() {
		return reembolso;
	}
	public void setReembolso(Reembolso reembolso) {
		this.reembolso = reembolso;
	}
	/*------------------------------------------------------------*/
	
}
