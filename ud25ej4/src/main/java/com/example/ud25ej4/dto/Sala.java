package com.example.ud25ej4.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="salas")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name = "id_pelicula")
    Pelicula id_pelicula;
	
	
	public Sala() {
		super();
		
	}
	

	public Sala(int id, String nombre, Pelicula id_pelicula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.id_pelicula = id_pelicula;
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


	public Pelicula getPeliculaa() {
		return id_pelicula;
	}


	public void setPeliculaa(Pelicula pelicula) {
		this.id_pelicula = pelicula;
	}


	@Override
	public String toString() {
		return "Sala [id=" + id + ", nombre=" + nombre + ", pelicula=" + id_pelicula + "]";
	}
	
	
	
	

}
