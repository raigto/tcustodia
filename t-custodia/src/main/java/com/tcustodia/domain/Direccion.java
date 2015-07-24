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
 * Direccion generated by hbm2java
 */
@Entity
@Table(name = "direccion", schema = "public")
public class Direccion implements java.io.Serializable {

	private long id;
	private Tipodireccion tipodireccion;
	private Sector sector;
	private long idpersona;
	private String codigopostal;
	private String calle;
	private String coordenadas;
	private Set<Estacioncentral> estacioncentrals = new HashSet<Estacioncentral>(
			0);
	private Set<Persona> personas = new HashSet<Persona>(0);

	public Direccion() {
	}

	public Direccion(long id, Tipodireccion tipodireccion, Sector sector,
			long idpersona) {
		this.id = id;
		this.tipodireccion = tipodireccion;
		this.sector = sector;
		this.idpersona = idpersona;
	}

	public Direccion(long id, Tipodireccion tipodireccion, Sector sector,
			long idpersona, String codigopostal, String calle,
			String coordenadas, Set<Estacioncentral> estacioncentrals,
			Set<Persona> personas) {
		this.id = id;
		this.tipodireccion = tipodireccion;
		this.sector = sector;
		this.idpersona = idpersona;
		this.codigopostal = codigopostal;
		this.calle = calle;
		this.coordenadas = coordenadas;
		this.estacioncentrals = estacioncentrals;
		this.personas = personas;
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
	@JoinColumn(name = "idtipodireccion", nullable = false)
	public Tipodireccion getTipodireccion() {
		return this.tipodireccion;
	}

	public void setTipodireccion(Tipodireccion tipodireccion) {
		this.tipodireccion = tipodireccion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idsector", nullable = false)
	public Sector getSector() {
		return this.sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	@Column(name = "idpersona", nullable = false)
	public long getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}

	@Column(name = "codigopostal", length = 10)
	public String getCodigopostal() {
		return this.codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	@Column(name = "calle", length = 300)
	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	@Column(name = "coordenadas", length = 50)
	public String getCoordenadas() {
		return this.coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "direccion")
	public Set<Estacioncentral> getEstacioncentrals() {
		return this.estacioncentrals;
	}

	public void setEstacioncentrals(Set<Estacioncentral> estacioncentrals) {
		this.estacioncentrals = estacioncentrals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "direccion")
	public Set<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

}