package com.tcustodia.domain;

// Generated 18/07/2015 03:56:01 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sector generated by hbm2java
 */
@Entity
@Table(name = "sector", schema = "public")
public class Sector implements java.io.Serializable {

	private long id;
	private Ciudad ciudad;
	private String descripcion;
	private Set<Cuerposeguridadsector> cuerposeguridadsectors = new HashSet<Cuerposeguridadsector>(
			0);
	private Set<Direccion> direccions = new HashSet<Direccion>(0);

	public Sector() {
	}

	public Sector(long id) {
		this.id = id;
	}

	public Sector(long id, Ciudad ciudad, String descripcion,
			Set<Cuerposeguridadsector> cuerposeguridadsectors,
			Set<Direccion> direccions) {
		this.id = id;
		this.ciudad = ciudad;
		this.descripcion = descripcion;
		this.cuerposeguridadsectors = cuerposeguridadsectors;
		this.direccions = direccions;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idciudad")
	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "descripcion", length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuerposeguridad")
	public Set<Cuerposeguridadsector> getCuerposeguridadsectors() {
		return this.cuerposeguridadsectors;
	}

	public void setCuerposeguridadsectors(
			Set<Cuerposeguridadsector> cuerposeguridadsectors) {
		this.cuerposeguridadsectors = cuerposeguridadsectors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sector")
	public Set<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(Set<Direccion> direccions) {
		this.direccions = direccions;
	}

}
