package com.softtek.modelos;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="temporada")
public class Temporada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_temporada")
	private Integer idTemporada;
	
	@Column(name = "inicio")
	private Integer inicio;

	
	@Column(name = "fin")
	private Integer fin;
	
	@Column(name = "pilotos")
	private Set<Piloto> pilotos;

	public Integer getIdTemporada() {
		return idTemporada;
	}

	public void setIdTemporada(Integer idTemporada) {
		this.idTemporada = idTemporada;
	}

	public Integer getInicio() {
		return inicio;
	}

	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}

	public Integer getFin() {
		return fin;
	}

	public void setFin(Integer fin) {
		this.fin = fin;
	}

	public Set<Piloto> getPilotos() {
		return pilotos;
	}

	public void setPilotos(Set<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	public Temporada(Integer idTemporada, Integer inicio, Integer fin, Set<Piloto> pilotos) {
		super();
		this.idTemporada = idTemporada;
		this.inicio = inicio;
		this.fin = fin;
		this.pilotos = pilotos;
	}

	public Temporada() {
		super();
	}
	
	
	
}
