package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

@RestController
public class Controller {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/hola/{nombre}")
	public String hola(@PathVariable String nombre) {
		return "hola " + nombre;

	}
	
	@PostMapping("/altaPersona")
	public void altaPersona(@RequestBody Persona persona) {
		service.addPersona(persona);

	}
	
	@DeleteMapping ("/delPersona/{id}")
	public void delPersona(@PathVariable Long id) {
		service.delPersona(id);

	}
	
	
	
}
