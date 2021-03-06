package br.com.fiap.challenger.dto;

import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import br.com.fiap.challenger.model.Produto;

public class ProdutoDto {
	private long id;
	private String nome;
	private String descricao;
	private double valor;  
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}