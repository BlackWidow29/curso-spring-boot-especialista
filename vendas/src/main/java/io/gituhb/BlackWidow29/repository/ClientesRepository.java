package io.gituhb.BlackWidow29.repository;

import io.gituhb.BlackWidow29.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ClientesRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);

    @Query(" delete from Cliente c where c.nome =:nome ")
    @Modifying
    void deleteByNome(String nome);

    @Query("select c from Cliente c left join fetch c.pedidos p  where c.id = :id")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);
}
