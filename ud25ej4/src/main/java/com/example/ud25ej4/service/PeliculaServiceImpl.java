package com.example.ud25ej4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud25ej4.dao.IPeliculaDAO;
import com.example.ud25ej4.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {
	
	
	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Pelicula> listarPelicula() {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(int id) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int id) {
		iPeliculaDAO.deleteById(id);
		
	}

	
	
	
}
