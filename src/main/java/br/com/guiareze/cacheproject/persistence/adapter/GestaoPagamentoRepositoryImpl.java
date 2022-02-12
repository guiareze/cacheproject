package br.com.guiareze.cacheproject.persistence.adapter;

import br.com.guiareze.cacheproject.core.ports.persistence.GestaoPagamentoRepository;
import br.com.guiareze.cacheproject.persistence.entities.FormaPagamentoEntity;
import br.com.guiareze.cacheproject.persistence.entities.PagamentoEntity;
import br.com.guiareze.cacheproject.persistence.exception.FormaPagamentoInexistenteException;
import br.com.guiareze.cacheproject.persistence.repository.FormaPagamentoRepository;
import br.com.guiareze.cacheproject.persistence.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GestaoPagamentoRepositoryImpl implements GestaoPagamentoRepository {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    @Override
    public PagamentoEntity efetivarPagamento(PagamentoEntity pagamentoEntity) {
        var formaPagamento = buscarFormaPagamento(pagamentoEntity.getFormaPagamentoEntity().getNomeFormaPgto());
        pagamentoEntity.setFormaPagamentoEntity(formaPagamento);
        return pagamentoRepository.save(pagamentoEntity);
    }

    private FormaPagamentoEntity buscarFormaPagamento(String nomeFormaPgto){
        return formaPagamentoRepository.findByNomeFormaPgto(nomeFormaPgto).orElseThrow(FormaPagamentoInexistenteException::new);
    }

}
