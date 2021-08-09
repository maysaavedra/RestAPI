package com.ApiProject.ApiProject.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;



	
	
}
