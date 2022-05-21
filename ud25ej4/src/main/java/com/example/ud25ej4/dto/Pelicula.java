package com.example.ud25ej4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="peliculas")
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@Column(name = "calificacionedad")//no hace falta si se llama igual
	private int calificacionedad;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Sala> sala;

	
	
	public Pelicula() {
		super();
	}


	


	public Pelicula(int id, String nombre, int calificacionedad, List<Sala> sala) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;
		this.sala = sala;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCalificacionedad() {
		return calificacionedad;
	}


	public void setCalificacionedad(int calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Salas")
	public List<Sala> getSala() {
		return sala;
	}


	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}


	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", calificacionedad=" + calificacionedad + ", sala=" + sala
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
