package br.com.mobilidade.model;

public class Movimentacao {
	
	protected Integer id_movimento;
	protected String tipo;
	protected Double valor;
	protected String descricao;
	
	
	public Integer getId_movimento() {
		return id_movimento;
	}
	public void setId_movimento(Integer id_movimento) {
		this.id_movimento = id_movimento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
