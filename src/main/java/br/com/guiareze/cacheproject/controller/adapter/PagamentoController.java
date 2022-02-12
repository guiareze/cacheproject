package br.com.guiareze.cacheproject.controller.adapter;

import br.com.guiareze.cacheproject.controller.dto.EntradaPagamento;
import br.com.guiareze.cacheproject.controller.dto.RetornoPagamento;
import br.com.guiareze.cacheproject.core.ports.controller.GestaoPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos/v1")
public class PagamentoController {

    @Autowired
    private GestaoPagamentoService gestaoPagamentoService;

    @PostMapping
    public ResponseEntity<RetornoPagamento> efetuarPagamento(@RequestBody EntradaPagamento entradaPagamento){
        var retornoService = gestaoPagamentoService.efetivaPagamento(entradaPagamento);
        return new ResponseEntity<>(retornoService,HttpStatus.OK);
    }

}
