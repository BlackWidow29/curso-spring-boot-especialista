package io.gituhb.BlackWidow29.repository;

import io.gituhb.BlackWidow29.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Integer> {
}
