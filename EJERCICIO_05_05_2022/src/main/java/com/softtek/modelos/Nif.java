package com.softtek.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nif")
public class Nif {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nif")
	private Integer idNif;
	
	@Column(name = "letra")
	private Byte letra;
	
	@Column(name = "numero")
	private Integer numero;

	public Integer getIdNif() {
		return idNif;
	}

	public void setIdNif(Integer idNif) {
		this.idNif = idNif;
	}

	public Byte getLetra() {
		return letra;
	}

	public void setLetra(Byte letra) {
		this.letra = letra;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Nif(Integer idNif, Byte letra, Integer numero) {
		super();
		this.idNif = idNif;
		this.letra = letra;
		this.numero = numero;
	}

	public Nif() {
		super();
	}
	
	
	
}
