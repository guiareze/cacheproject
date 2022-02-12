package br.com.guiareze.cacheproject.core.ports.persistence;

import br.com.guiareze.cacheproject.persistence.entities.PagamentoEntity;

public interface GestaoPagamentoRepository {

    PagamentoEntity efetivarPagamento(PagamentoEntity pagamentoEntity);

}
