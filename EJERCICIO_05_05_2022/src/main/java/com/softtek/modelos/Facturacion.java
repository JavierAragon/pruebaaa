package com.softtek.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facturacion")
public class Facturacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_facturacion")
	private Integer idFacturacion;
	
	
	@Column(name = "sueldo")
	private Integer sueldo;
	
	
	@Column(name = "publicidad")
	private Integer publicidad;
	
	
	@Column(name = "piloto")
	private Piloto piloto;


	public Integer getIdFacturacion() {
		return idFacturacion;
	}


	public void setIdFacturacion(Integer idFacturacion) {
		this.idFacturacion = idFacturacion;
	}


	public Integer getSueldo() {
		return sueldo;
	}


	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}


	public Integer getPublicidad() {
		return publicidad;
	}


	public void setPublicidad(Integer publicidad) {
		this.publicidad = publicidad;
	}


	public Piloto getPiloto() {
		return piloto;
	}


	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}


	public Facturacion(Integer idFacturacion, Integer sueldo, Integer publicidad, Piloto piloto) {
		super();
		this.idFacturacion = idFacturacion;
		this.sueldo = sueldo;
		this.publicidad = publicidad;
		this.piloto = piloto;
	}


	public Facturacion() {
		super();
	}
	
	
	
}
