package io.gituhb.BlackWidow29.repository;

import io.gituhb.BlackWidow29.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClientesRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);
}
