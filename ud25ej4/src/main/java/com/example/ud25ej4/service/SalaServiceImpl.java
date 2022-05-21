package com.example.ud25ej4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud25ej4.dao.ISalaDAO;
import com.example.ud25ej4.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{
	
	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSala() {
		// TODO Auto-generated method stub
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(int id) {
		// TODO Auto-generated method stub
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(int id) {
		iSalaDAO.deleteById(id);
		
	}

}
