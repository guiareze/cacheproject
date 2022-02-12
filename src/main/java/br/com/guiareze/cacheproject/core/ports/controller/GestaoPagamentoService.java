package br.com.guiareze.cacheproject.core.ports.controller;

import br.com.guiareze.cacheproject.controller.dto.EntradaPagamento;
import br.com.guiareze.cacheproject.controller.dto.RetornoPagamento;

public interface GestaoPagamentoService {

    RetornoPagamento efetivaPagamento(EntradaPagamento entradaPagamento);

}
