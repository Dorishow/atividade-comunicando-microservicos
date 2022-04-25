package br.com.letscode.cliente.model.deposit.dto;

import br.com.letscode.cliente.model.conta.dto.ContaResponse;
import br.com.letscode.cliente.model.deposit.Deposit;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor
@Getter
@Setter
public class DepositResponse {
    @JsonProperty("nome-do-remetente")
    private String nome;
    @JsonProperty("numero-da-conta")
    private Integer numeroConta;
    private Integer agencia;
    private BigDecimal valor;
    @JsonProperty("data-e-hora-do-deposito")
    private String dataHoraDeposito;

    public DepositResponse(ContaResponse contaResponse, Deposit deposit){
        this.setNome(contaResponse.getNome());
        this.setNumeroConta(contaResponse.getNumeroConta());
        this.setAgencia(contaResponse.getAgencia());
        this.setValor(deposit.getValor());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.setDataHoraDeposito(LocalDateTime.now().format(formatter));
    }
}
