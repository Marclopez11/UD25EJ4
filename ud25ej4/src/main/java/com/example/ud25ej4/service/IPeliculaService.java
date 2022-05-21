package com.example.ud25ej4.service;

import java.util.List;

import com.example.ud25ej4.dto.Pelicula;

public interface IPeliculaService {
	
	
	
public List<Pelicula> listarPelicula(); 
	
	public Pelicula guardarPelicula(Pelicula pelicula);	
	
	public Pelicula peliculaXID(int id); 
	
	public Pelicula actualizarPelicula(Pelicula pelicula); 
	
	public void eliminarPelicula(int id);

}
