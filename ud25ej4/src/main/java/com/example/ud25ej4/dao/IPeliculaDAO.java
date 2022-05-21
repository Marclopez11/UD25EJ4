package com.example.ud25ej4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ud25ej4.dto.Pelicula;


public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer> {

}
