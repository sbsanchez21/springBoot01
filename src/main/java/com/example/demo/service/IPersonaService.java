package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService {
	
	public List<Persona> listarPersonas();
	public void addPersona(Persona pers);
	public void delPersona(Long id);
	public Persona getPersona(Long id);
	public Persona updPersona(Persona pers);

}
