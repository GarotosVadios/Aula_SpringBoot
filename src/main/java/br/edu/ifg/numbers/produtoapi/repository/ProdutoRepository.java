package br.edu.ifg.numbers.produtoapi.repository.ProdutoRepository.java;

import br.edu.ifg.numbers.produtoapi.model.Produto.java;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
