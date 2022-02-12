package br.com.guiareze.cacheproject.persistence.repository;

import br.com.guiareze.cacheproject.persistence.entities.FormaPagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamentoEntity,Long> {

    Optional<FormaPagamentoEntity> findByNomeFormaPgto(String nomeFormaPgto);

}
