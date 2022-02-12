package br.com.guiareze.cacheproject.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class RetornoPagamento {

    @JsonProperty("status_pagamento")
    private String statusPagamento;

    @JsonProperty("nome_vendedor")
    private String nomeVendedor;

    @JsonProperty("data_hora_pagamento")
    private LocalDateTime dataHoraPagamento;

}
