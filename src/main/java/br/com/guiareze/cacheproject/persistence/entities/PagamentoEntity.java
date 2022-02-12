package br.com.guiareze.cacheproject.persistence.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagamento")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_pagamento", columnDefinition = "BIGINT", nullable = false, unique = true, updatable = false)
    private Long idPagamento;

    @Column(name ="nome_comprador", columnDefinition = "VARCHAR", length = 100)
    private String nomeComprador;

    @Column(name ="nome_loja", columnDefinition = "VARCHAR", length = 100)
    private String nomeLoja;

    @Column(name ="valor_compra", columnDefinition = "DECIMAL", precision = 15, scale = 2)
    private BigDecimal valorCompra;

    @Column(name ="cpf_comprador", columnDefinition = "VARCHAR", length = 11)
    private String cpfComprador;

    @Column(name ="status_pagamento", columnDefinition = "VARCHAR", length = 20)
    private String statusPagamento;

    @Column(name ="nome_vendedor", columnDefinition = "VARCHAR", length = 100)
    private String nomeVendedor;

    @Column(name ="data_pagamento", columnDefinition = "DATETIME")
    private LocalDateTime dataHoraPagamento;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "id_forma_pagamento")
    private FormaPagamentoEntity formaPagamentoEntity;

}
