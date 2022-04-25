package br.com.letscode.cliente.model.conta.dto;

import br.com.letscode.cliente.enumerator.TipoConta;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ContaRequest {
    private String cpf;
    private String nome;
    private BigDecimal saldo;
    private TipoConta tipoConta;
    private Integer agencia;
}
