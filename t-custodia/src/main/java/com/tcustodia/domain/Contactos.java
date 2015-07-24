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
 * Contactos generated by hbm2java
 */
@Entity
@Table(name = "contactos", schema = "public")
public class Contactos implements java.io.Serializable {

	private long id;
	private Parentesco parentesco;
	private Persona persona;
	private Estacioncentral estacioncentral;
	private String nrousuario;
	private Boolean esabonado;
	private Boolean orden;
	private Set<Contactozona> contactozonas = new HashSet<Contactozona>(0);

	public Contactos() {
	}

	public Contactos(long id) {
		this.id = id;
	}

	public Contactos(long id, Parentesco parentesco, Persona persona,
			Estacioncentral estacioncentral, String nrousuario,
			Boolean esabonado, Boolean orden, Set<Contactozona> contactozonas) {
		this.id = id;
		this.parentesco = parentesco;
		this.persona = persona;
		this.estacioncentral = estacioncentral;
		this.nrousuario = nrousuario;
		this.esabonado = esabonado;
		this.orden = orden;
		this.contactozonas = contactozonas;
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
	@JoinColumn(name = "idparentesco")
	public Parentesco getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpersona")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idestacioncentral")
	public Estacioncentral getEstacioncentral() {
		return this.estacioncentral;
	}

	public void setEstacioncentral(Estacioncentral estacioncentral) {
		this.estacioncentral = estacioncentral;
	}

	@Column(name = "nrousuario", length = 4)
	public String getNrousuario() {
		return this.nrousuario;
	}

	public void setNrousuario(String nrousuario) {
		this.nrousuario = nrousuario;
	}

	@Column(name = "esabonado")
	public Boolean getEsabonado() {
		return this.esabonado;
	}

	public void setEsabonado(Boolean esabonado) {
		this.esabonado = esabonado;
	}

	@Column(name = "orden")
	public Boolean getOrden() {
		return this.orden;
	}

	public void setOrden(Boolean orden) {
		this.orden = orden;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contactos")
	public Set<Contactozona> getContactozonas() {
		return this.contactozonas;
	}

	public void setContactozonas(Set<Contactozona> contactozonas) {
		this.contactozonas = contactozonas;
	}

}
