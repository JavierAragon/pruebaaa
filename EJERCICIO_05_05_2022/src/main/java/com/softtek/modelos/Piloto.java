package com.softtek.modelos;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="piloto")
public class Piloto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_piloto")
	private Integer idPiloto;
	
	@Column(name = "nombre", length = 150)
	private String nombre;
	
	@Column(name = "edad")
	private String edad;
	
	@OneToOne
	@JoinColumn(name = "id_facturacion", nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_facturacion"))
	private Facturacion facturacion;
	
	@OneToOne
	@JoinColumn(name = "id_nif", nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_nif"))
	private Nif nif;
	
	@ManyToOne
	@JoinColumn(name = "id_escuderia", nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_escuderia"))
	private Escuderia escuderia;
	
	@OneToMany
	@JoinColumn(name = "id_telefono", nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_telefono"))
	private Set<Telefono> telefonos;
	
	@ManyToMany
	@JoinColumn(name = "id_temporada", nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_temporada"))
	private Set<Temporada> temporadas;

	public Integer getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(Integer idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Facturacion getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(Facturacion facturacion) {
		this.facturacion = facturacion;
	}

	public Nif getNif() {
		return nif;
	}

	public void setNif(Nif nif) {
		this.nif = nif;
	}

	public Escuderia getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(Escuderia escuderia) {
		this.escuderia = escuderia;
	}

	public Set<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Set<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Set<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	public Piloto(Integer idPiloto, String nombre, String edad, Facturacion facturacion, Nif nif, Escuderia escuderia,
			Set<Telefono> telefonos, Set<Temporada> temporadas) {
		super();
		this.idPiloto = idPiloto;
		this.nombre = nombre;
		this.edad = edad;
		this.facturacion = facturacion;
		this.nif = nif;
		this.escuderia = escuderia;
		this.telefonos = telefonos;
		this.temporadas = temporadas;
	}

	public Piloto() {
		super();
	}

	
	
	
	
	
	
}
