package br.com.letscode.cliente.model.conta;

import br.com.letscode.cliente.enumerator.TipoConta;
import br.com.letscode.cliente.model.conta.dto.ContaRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

@Entity
@Table(name = "conta")
@Getter @Setter
@NoArgsConstructor
public class Conta {
    @Id
    private String id = UUID.randomUUID().toString();

    private String cpf;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;

    private Integer numeroConta;

    private Integer agencia;

    private BigDecimal saldo;

    public Conta(ContaRequest contaRequest) {
        Random rand = new Random();
        int upperbound = 999999;
        int numero = rand.nextInt(upperbound);
        this.setNumeroConta(numero);
        this.setCpf(contaRequest.getCpf());
        this.setNome(contaRequest.getNome());
        this.setSaldo(contaRequest.getSaldo());
        this.setTipoConta(contaRequest.getTipoConta());
        this.setAgencia(contaRequest.getAgencia());
    }
}
