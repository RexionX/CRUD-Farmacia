package com.generation.farmacia.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 3,max = 50 ,message = "O nome deve ter no mínimo 3 e no máximo 50 caracteres")
	@NotBlank(message = "O nome é obrigatório")
	private String nomeProduto;
	
	@Size(min = 10,max = 100 ,message = "A descrição deve ter no mínimo 5 e no máximo 100 caracteres")
	@NotBlank(message = "A descrição é obrigatório")
	private String descricaoProduto;
	
	@NotNull(message = "O preço é obrigatório")
	private Double preco;
	
	@Size(min = 5,max = 100 ,message = "O fabricante deve ter no mínimo 10 e no máximo 100 caracteres")
	@NotBlank(message = "O fabricante é obrigatório")
	private String fabricante;
	
	@NotNull
	private String quantidade;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
