package model;

import java.math.BigDecimal;
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
public class Reembolso {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Calendar dataRembolso;
	@Enumerated(EnumType.STRING)
	private StatusAutorizacao status;
	@ManyToOne
	private Funcionario funcionario;
	@OneToOne
	private Compra compra;
	private BigDecimal valor;
	private String observacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDataRembolso() {
		return dataRembolso;
	}
	public void setDataRembolso(Calendar dataRembolso) {
		this.dataRembolso = dataRembolso;
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
