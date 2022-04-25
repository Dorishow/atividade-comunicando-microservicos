package br.com.letscode.cliente.model.deposit;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Deposit {
    private Integer numeroConta;
    private Integer agencia;
    private BigDecimal valor;
}
