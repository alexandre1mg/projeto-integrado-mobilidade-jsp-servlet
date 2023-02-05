package br.com.mobilidade.model;

public class TipoCartao {
	
	protected Integer id_tipo;
	protected String tipo;
	protected Integer num_identificacao;
	
	
	public Integer getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(Integer id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getNum_identificacao() {
		return num_identificacao;
	}
	public void setNum_identificacao(Integer num_identificacao) {
		this.num_identificacao = num_identificacao;
	}	
}
