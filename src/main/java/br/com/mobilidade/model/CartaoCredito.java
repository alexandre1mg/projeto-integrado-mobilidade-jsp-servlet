package br.com.mobilidade.model;

import java.time.LocalDateTime;
import java.util.Date;

public class CartaoCredito {
	protected Integer id_cartao;
	protected String nome;
	protected String num_cartao;
	protected Integer cod_seg;
	protected String data;
	
	public Integer getId_cartao() {
		return id_cartao;
	}
	public void setId_cartao(Integer id_cartao) {
		this.id_cartao = id_cartao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNum_cartao() {
		return num_cartao;
	}
	public void setNum_cartao(String num_cartao) {
		this.num_cartao = num_cartao;
	}
	public Integer getCod_seg() {
		return cod_seg;
	}
	public void setCod_seg(Integer cod_seg) {
		this.cod_seg = cod_seg;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
