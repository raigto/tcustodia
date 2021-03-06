package com.tcustodia.domain;

// Generated 18/07/2015 03:56:01 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cuerposeguridad generated by hbm2java
 */
@Entity
@Table(name = "cuerposeguridad", schema = "public")
public class Cuerposeguridad implements java.io.Serializable {

	private long id;
	private String nombre;
	private Set<Cuerposeguridadsector> cuerposeguridadsectors = new HashSet<Cuerposeguridadsector>(
			0);
	private Set<Evento> eventos = new HashSet<Evento>(0);

	public Cuerposeguridad() {
	}

	public Cuerposeguridad(long id) {
		this.id = id;
	}

	public Cuerposeguridad(long id, String nombre,
			Set<Cuerposeguridadsector> cuerposeguridadsectors,
			Set<Evento> eventos) {
		this.id = id;
		this.nombre = nombre;
		this.cuerposeguridadsectors = cuerposeguridadsectors;
		this.eventos = eventos;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "nombre", length = 10)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuerposeguridad")
	public Set<Cuerposeguridadsector> getCuerposeguridadsectors() {
		return this.cuerposeguridadsectors;
	}

	public void setCuerposeguridadsectors(
			Set<Cuerposeguridadsector> cuerposeguridadsectors) {
		this.cuerposeguridadsectors = cuerposeguridadsectors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuerposeguridad")
	public Set<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

}
