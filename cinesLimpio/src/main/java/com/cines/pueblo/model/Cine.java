package com.cines.pueblo.model;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Cine")
public class Cine {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CINE_SEQ")
    //SequenceGenerator(sequenceName = "cine_seq", allocationSize = 1, name = "CINE_SEQ")
	private long id_cine;
	
	@Column(nullable=false, length = 50)
	private String ci_nombre;
	
	@Column(nullable=true, length = 100)
	private String ci_calle;
	
	@Column(nullable=true, length = 100)
	private String ci_barrio;
	
	@Column(nullable=false)
	private int ci_capacidad;
	
	@Column
	@OneToMany(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entrada> ci_lista;
	
	public Cine() {
		super();
	}
	public Cine(long id_cine, String ci_nombre, int ci_capacidad, List<Entrada> ci_lista) {
		super();
		this.id_cine = id_cine;
		this.ci_nombre = ci_nombre;
		this.ci_capacidad = ci_capacidad;
		this.ci_lista = ci_lista;
	}
	public long getId_cine() {
		return id_cine;
	}
	public void setId_cine(long id_cine) {
		this.id_cine = id_cine;
	}
	public String getCi_nombre() {
		return ci_nombre;
	}
	public void setCi_nombre(String ci_nombre) {
		this.ci_nombre = ci_nombre;
	}
	public int getCi_capacidad() {
		return ci_capacidad;
	}
	public void setCi_capacidad(int ci_capacidad) {
		this.ci_capacidad = ci_capacidad;
	}
	@Override
	public String toString() {
		return "Cine [id_cine=" + id_cine + ", ci_nombre=" + ci_nombre + ", ci_capacidad=" + ci_capacidad + "]";
	}
	public String getCi_calle() {
		return ci_calle;
	}
	public void setCi_calle(String ci_calle) {
		this.ci_calle = ci_calle;
	}
	public String getCi_barrio() {
		return ci_barrio;
	}
	public void setCi_barrio(String ci_barrio) {
		this.ci_barrio = ci_barrio;
	}
	public List<Entrada> getCi_lista() {
		return ci_lista;
	}
	public void setCi_lista(List<Entrada> ci_lista) {
		this.ci_lista = ci_lista;
	}
	
}
