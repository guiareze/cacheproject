package br.com.guiareze.cacheproject.persistence.repository;

import br.com.guiareze.cacheproject.persistence.entities.PagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<PagamentoEntity,Long> {
}
