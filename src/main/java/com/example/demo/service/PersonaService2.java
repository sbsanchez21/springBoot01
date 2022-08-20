package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository2;

@Service
public class PersonaService2 implements IPersonaService2 {

	@Autowired 	
	public PersonaRepository2 persoRepo;
	
	@Override
	public List<Persona> verPersonas() {
		return persoRepo.findAll();
	}

	@Override
	public void crearPersona(Persona pers) {
		persoRepo.save(pers);
		
	}

	@Override
	public void borrarPersona(Long id) {
		persoRepo.deleteById(id);
		
	}

	@Override
	public Persona buscarPersona(Long id) {
		return persoRepo.findById(id).orElse(null);
	}


}
