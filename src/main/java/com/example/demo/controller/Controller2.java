package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService2;

//@RestController
public class Controller2 {
	
	@Autowired
	private IPersonaService2 persoServ;
	
	List<Persona> listPersonas = new ArrayList<Persona>();
	
	@GetMapping ("/hola/{nombre}")
	public String hola(@PathVariable String nombre ) {
		return "Hola mundo: " + nombre;
	}
	
	@GetMapping ("/chau")
	public String chau(@RequestParam String nombre) {
		return "Chau: " + nombre;

	}
	
	@PostMapping ("/addPersona")
	public void addPersona(@RequestBody Persona persona) {
//		listPersonas.add(persona);
		persoServ.crearPersona(persona);

	}
	
	@GetMapping ("/listarPersonas")
	@ResponseBody
	public  List<Persona> listPersonas() {
//		return listPersonas;
		return persoServ.verPersonas();

	}
	
	@DeleteMapping("/delete/{id}")
	public void borrarPersona(@PathVariable Long id) {
		persoServ.borrarPersona(id);

	}
}
