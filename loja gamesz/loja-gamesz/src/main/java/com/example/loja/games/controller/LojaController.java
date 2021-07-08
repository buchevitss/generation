package com.example.loja.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loja.games.model.Categoria;
import com.example.loja.games.repository.LojaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")

public class LojaController {

	@Autowired
	private LojaRepository repository;

	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll() {
		return ResponseEntity.status(200).body(repository.findAll());

	}

	//@GetMapping("/console/{console}")
	//public ResponseEntity<List<Categoria>> GetByConsole(@PathVariable String console) {
		//return ResponseEntity.ok(repository.findAllByConsoleContainingIgnoreCase(console));

	//}

	//@GetMapping("/{console}")
	//public ResponseEntity<Categoria> GetBy(@PathVariable String console) {  
	//	return repository.findByConsole(console).map(resp -> ResponseEntity.ok(resp))           
		//	.orElse(ResponseEntity.notFound().build());
	//}

	@GetMapping("/{id}")        
	public ResponseEntity<Categoria> GetBy(@PathVariable long id) {            
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))                     
			.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
}
