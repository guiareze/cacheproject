package br.com.guiareze.cacheproject.core.service;

import br.com.guiareze.cacheproject.controller.dto.EntradaPagamento;
import br.com.guiareze.cacheproject.controller.dto.RetornoPagamento;
import br.com.guiareze.cacheproject.core.ports.controller.GestaoPagamentoService;
import br.com.guiareze.cacheproject.core.ports.persistence.GestaoPagamentoRepository;
import br.com.guiareze.cacheproject.persistence.entities.FormaPagamentoEntity;
import br.com.guiareze.cacheproject.persistence.entities.PagamentoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GestaoPagamentoServiceImpl implements GestaoPagamentoService {

    @Autowired
    private GestaoPagamentoRepository gestaoPagamentoRepository;

    @Override
    public RetornoPagamento efetivaPagamento(EntradaPagamento entradaPagamento) {
        var entityGerada = geraEntityParaSalvar(entradaPagamento);
        var retornoSalvar = gestaoPagamentoRepository.efetivarPagamento(entityGerada);
        return RetornoPagamento.builder()
                .idPagamento(retornoSalvar.getIdPagamento())
                .nomeVendedor(retornoSalvar.getNomeVendedor())
                .statusPagamento(retornoSalvar.getStatusPagamento())
                .dataHoraPagamento(retornoSalvar.getDataHoraPagamento())
                .build();
    }

    private PagamentoEntity geraEntityParaSalvar(EntradaPagamento entradaPagamento){
        return PagamentoEntity.builder()
                .nomeComprador(entradaPagamento.getNomeComprador())
                .nomeLoja(entradaPagamento.getNomeLoja())
                .valorCompra(entradaPagamento.getValorCompra())
                .cpfComprador(entradaPagamento.getCpfComprador())
                .statusPagamento("APROVADO")
                .nomeVendedor("SISTEMA")
                .dataHoraPagamento(LocalDateTime.now())
                .formaPagamentoEntity(FormaPagamentoEntity.builder()
                        .nomeFormaPgto(entradaPagamento.getDescFormaPagamento())
                        .build())
                .build();
    }

}
