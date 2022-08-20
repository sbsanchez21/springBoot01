package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {
	
	@Autowired
	public PersonaRepository repo;	

	@Override
	public List<Persona> listarPersonas() {
		return repo.findAll();
	}

	@Override
	public void addPersona(Persona pers) {
		repo.save(pers);
		
	}

	@Override
	public void delPersona(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Persona getPersona(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public Persona updPersona(Persona pers) {
		
		return repo.save(pers);
	}

}
