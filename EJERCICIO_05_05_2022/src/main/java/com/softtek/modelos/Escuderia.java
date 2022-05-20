package com.softtek.modelos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="escuderia")
public class Escuderia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_escuderia")
	private Integer idEscuderia;
	
	@Column(name = "nombre", length = 150)
	private String nombre;
	
	@Column(name = "pais", length = 150)
	private String pais;
	
	@Column(name = "pilotos")
	private Set<Piloto> pilotos = new HashSet<Piloto>();

	public Integer getIdEscuderia() {
		return idEscuderia;
	}

	public void setIdEscuderia(Integer idEscuderia) {
		this.idEscuderia = idEscuderia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Set<Piloto> getPilotos() {
		return pilotos;
	}

	public void setPilotos(Set<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	
	public void addPiloto(Piloto p) {
		pilotos.add(p);
		p.setEscuderia(this);
	}

	public Escuderia(Integer idEscuderia, String nombre, String pais, Set<Piloto> pilotos) {
		super();
		this.idEscuderia = idEscuderia;
		this.nombre = nombre;
		this.pais = pais;
		this.pilotos = pilotos;
	}

	public Escuderia() {
		super();
	}
	
	
	
}
