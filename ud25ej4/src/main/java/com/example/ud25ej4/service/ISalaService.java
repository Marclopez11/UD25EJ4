package com.example.ud25ej4.service;

import java.util.List;

import com.example.ud25ej4.dto.Sala;

public interface ISalaService {
	
public List<Sala> listarSala(); 
	
	public Sala guardarSala(Sala sala);	
	
	public Sala salaXID(int id); 
	
	public Sala actualizarSala(Sala sala); 
	
	public void eliminarSala(int id);

}
