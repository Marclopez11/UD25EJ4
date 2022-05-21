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

import com.example.ud25ej4.dto.Sala;
import com.example.ud25ej4.service.SalaServiceImpl;



@RestController
@RequestMapping("/api")
public class SalaController {
	
	
	
	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSala(){
		return salaServiceImpl.listarSala();
	}
	
	
	@PostMapping("/sala")
	public Sala salvarSala(@RequestBody Sala sala) {
		
		return salaServiceImpl.guardarSala(sala);
	}
	
	
	@GetMapping("/salas/{id}")
	public Sala salaXID(@PathVariable(name="id") int id) {
		
		Sala Sala_xid= new Sala();
		
		Sala_xid=salaServiceImpl.salaXID(id);
		
		
		return Sala_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name="id")int id,@RequestBody Sala sala) {
		
		Sala Sala_seleccionado= new Sala();
		Sala Sala_actualizado= new Sala();
		
		Sala_seleccionado= salaServiceImpl.salaXID(id);
		
		Sala_seleccionado.setNombre(sala.getNombre());
		Sala_seleccionado.setPelicula(sala.getPelicula());

		
		Sala_actualizado = salaServiceImpl.actualizarSala(Sala_seleccionado);
		
		
		return Sala_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eleiminarSala(@PathVariable(name="id")int id) {
		salaServiceImpl.eliminarSala(id);
	}

}
