package com.example.loja.games.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loja.games.model.Categoria;

@Repository
public interface LojaRepository extends JpaRepository<Categoria, Long> {
	public List <Categoria> findAllByConsoleContainingIgnoreCase(String Console);

	//public Object findAllByPrecoContainingIgnoreCase(int preco);

	//public Object findByConsoleContainingIgnoreCase(String console);

	//public Object findByConsole(String console);

	//public List <Categoria> findByIdContainingIgnoreCase(long id);





}
