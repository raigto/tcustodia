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
 * Zona generated by hbm2java
 */
@Entity
@Table(name = "zona", schema = "public")
public class Zona implements java.io.Serializable {

	private long id;
	private Particion particion;
	private String numero;
	private String foto;
	private String camara;
	private Set<Zonaevento> zonaeventos = new HashSet<Zonaevento>(0);
	private Set<Senal> senals = new HashSet<Senal>(0);
	private Set<Equipozona> equipozonas = new HashSet<Equipozona>(0);
	private Set<Contactozona> contactozonas = new HashSet<Contactozona>(0);

	public Zona() {
	}

	public Zona(long id) {
		this.id = id;
	}

	public Zona(long id, Particion particion, String numero, String foto,
			String camara, Set<Zonaevento> zonaeventos, Set<Senal> senals,
			Set<Equipozona> equipozonas, Set<Contactozona> contactozonas) {
		this.id = id;
		this.particion = particion;
		this.numero = numero;
		this.foto = foto;
		this.camara = camara;
		this.zonaeventos = zonaeventos;
		this.senals = senals;
		this.equipozonas = equipozonas;
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
	@JoinColumn(name = "idparticion")
	public Particion getParticion() {
		return this.particion;
	}

	public void setParticion(Particion particion) {
		this.particion = particion;
	}

	@Column(name = "numero", length = 4)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(name = "foto", length = 100)
	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Column(name = "camara", length = 100)
	public String getCamara() {
		return this.camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zona")
	public Set<Zonaevento> getZonaeventos() {
		return this.zonaeventos;
	}

	public void setZonaeventos(Set<Zonaevento> zonaeventos) {
		this.zonaeventos = zonaeventos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zona")
	public Set<Senal> getSenals() {
		return this.senals;
	}

	public void setSenals(Set<Senal> senals) {
		this.senals = senals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zona")
	public Set<Equipozona> getEquipozonas() {
		return this.equipozonas;
	}

	public void setEquipozonas(Set<Equipozona> equipozonas) {
		this.equipozonas = equipozonas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zona")
	public Set<Contactozona> getContactozonas() {
		return this.contactozonas;
	}

	public void setContactozonas(Set<Contactozona> contactozonas) {
		this.contactozonas = contactozonas;
	}

}
