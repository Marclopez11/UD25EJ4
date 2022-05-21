package com.example.ud25ej4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ud25ej4.dto.Pelicula;
import com.example.ud25ej4.service.PeliculaServiceImpl;



@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	
	
	
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPelicula(){
		return peliculaServiceImpl.listarPelicula();
	}
	
	
	@PostMapping("/pelicula")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {
		
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	
	@GetMapping("/peliculas/{id}")
	public Pelicula peliculaXID(@PathVariable(name="id") int id) {
		
		Pelicula Pelicula_xid= new Pelicula();
		
		Pelicula_xid=peliculaServiceImpl.peliculaXID(id);
		
		System.out.println("Pelicula XID: "+Pelicula_xid);
		
		return Pelicula_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id")int id,@RequestBody Pelicula pelicula) {
		
		Pelicula Pelicula_seleccionado= new Pelicula();
		Pelicula Pelicula_actualizado= new Pelicula();
		
		Pelicula_seleccionado= peliculaServiceImpl.peliculaXID(id);
		
		Pelicula_seleccionado.setNombre(pelicula.getNombre());
		Pelicula_seleccionado.setCalificacionedad(pelicula.getCalificacionedad());

		
		Pelicula_actualizado = peliculaServiceImpl.actualizarPelicula(Pelicula_seleccionado);
		
		System.out.println("El Pelicula actualizado es: "+ Pelicula_actualizado);
		
		return Pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eleiminarPelicula(@PathVariable(name="id")int id) {
		peliculaServiceImpl.eliminarPelicula(id);
	}

}
