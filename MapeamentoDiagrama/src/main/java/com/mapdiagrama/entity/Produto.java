package com.mapdiagrama.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "produto")
public class Produto {

	@Id
	@GeneratedValue (strategy = GenerationType. IDENTITY)
	private Long id;

	@Column (name = "descricao", nullable = false, length = 255)
	private String descricao;
	
	@Column (name = "nome", nullable = false, length = 255)
	private String nome;

	@Column (name = "preco", nullable = false)
	private Double preco;
}