package org.generation.blog.pessoal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.generation.blog.pessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List <Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
