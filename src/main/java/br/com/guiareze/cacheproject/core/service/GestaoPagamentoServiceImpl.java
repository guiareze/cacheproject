package br.com.guiareze.cacheproject.core.service;

import br.com.guiareze.cacheproject.controller.dto.EntradaPagamento;
import br.com.guiareze.cacheproject.controller.dto.RetornoPagamento;
import br.com.guiareze.cacheproject.core.ports.controller.GestaoPagamentoService;
import org.springframework.stereotype.Service;

@Service
public class GestaoPagamentoServiceImpl implements GestaoPagamentoService {

    @Override
    public RetornoPagamento efetivaPagamento(EntradaPagamento entradaPagamento) {
        return null;
    }

}
