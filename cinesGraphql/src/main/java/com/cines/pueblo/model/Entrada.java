package com.cines.pueblo.model;

import java.time.LocalDate;

import com.cines.pueblo.service.util.Constantes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;


@Entity
public class Entrada {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id_entrada;
	
	@Column(nullable=false,columnDefinition = "DATE")
	private LocalDate ent_fecha;
	
	@Transient
	private String ent_fecha_str;
	
	@ManyToOne()
	@JoinColumn(name="id_cine")
	private Cine ent_cine;
	
	@Column(nullable=false)
	private int ent_numero;
	
	@Column(nullable=false)
	private String idCliente;
	
	
	public Entrada() {
		super();
	}
	public Entrada(long id_entrada, LocalDate ent_fecha, Cine cine, int ent_numero) {
		super();
		this.id_entrada = id_entrada;
		this.ent_fecha = ent_fecha;
		this.ent_cine = cine;
		this.ent_numero = ent_numero;
	}
	
	public Entrada(long id_entrada, String ent_fecha_str, Cine cine, int ent_numero) {
		super();
		setId_entrada(id_entrada);
		setEnt_fecha_str(ent_fecha_str);
		setEnt_cine(cine);
		setEnt_numero(ent_numero);
	}
	
	public long getId_entrada() {
		return id_entrada;
	}
	public void setId_entrada(long id_entrada) {
		this.id_entrada = id_entrada;
	}
	public LocalDate getEnt_fecha() {
		return ent_fecha;
	}
	public void setEnt_fecha(LocalDate ent_fecha) {
		this.ent_fecha = ent_fecha;
	}
	public Cine getEnt_cine() {
		return ent_cine;
	}
	public void setEnt_cine(Cine cine) {
		this.ent_cine = cine;
	}
	public int getEnt_numero() {
		return ent_numero;
	}
	public void setEnt_numero(int ent_numero) {
		this.ent_numero = ent_numero;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public void setEnt_fecha_str(String ent_fecha_str) {		
		setEnt_fecha(LocalDate.parse(ent_fecha_str,Constantes.FORMATO_FECHA_EU));	
	}
	@Override
	public String toString() {
		return "Entrada [id_entrada=" + id_entrada + ", ent_fecha=" + ent_fecha + ", cine=" + ent_cine + ", ent_numero="
				+ ent_numero + ", idCliente=" + idCliente + "]";
	}
	
	
}
