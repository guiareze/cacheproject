package br.com.guiareze.cacheproject.persistence.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "forma_pagamento")
@Getter
@Setter
@Builder
public class FormaPagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_forma_pagamento", columnDefinition = "BIGINT", nullable = false, unique = true, updatable = false)
    private Long idFormaPagamento;

    @Column(name ="nome_forma_pgto", columnDefinition = "VARCHAR", length = 30)
    private String nomeComprador;

}
