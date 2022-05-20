package com.softtek.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="telefono")
public class Telefono {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefono")
	private Integer idTelefono;
	
	@Column(name = "numero")
	private Integer numero;

	@Column(name = "piloto")
	private Piloto piloto;

	public Integer getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Integer idTelefono) {
		this.idTelefono = idTelefono;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Telefono(Integer idTelefono, Integer numero, Piloto piloto) {
		super();
		this.idTelefono = idTelefono;
		this.numero = numero;
		this.piloto = piloto;
	}

	public Telefono() {
		super();
	}
	
}
