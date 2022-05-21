package br.com.fiap.challenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenger.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
}

