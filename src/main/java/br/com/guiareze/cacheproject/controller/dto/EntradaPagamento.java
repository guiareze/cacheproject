package br.com.guiareze.cacheproject.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class EntradaPagamento {

    @JsonProperty("nome_comprador")
    private String nomeComprador;

    @JsonProperty("nome_loja")
    private String nomeLoja;

    @JsonProperty("valor_compra")
    private BigDecimal valorCompra;

    @JsonProperty("cpf_comprador")
    private String cpfComprador;

    @JsonProperty("desc_forma_pagamento")
    private String descFormaPagamento;

}
