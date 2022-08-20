package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService2 {

	public List<Persona> verPersonas();
	public void crearPersona(Persona pers);
	public void borrarPersona(Long id);
	public Persona buscarPersona(Long id);
}

