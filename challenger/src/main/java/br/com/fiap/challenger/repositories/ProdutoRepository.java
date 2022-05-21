package br.com.fiap.challenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.challenger.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
}
