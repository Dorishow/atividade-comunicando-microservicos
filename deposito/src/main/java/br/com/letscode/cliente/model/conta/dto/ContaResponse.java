package br.com.letscode.cliente.model.conta.dto;

import br.com.letscode.cliente.model.conta.Conta;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter @Setter
public class ContaResponse extends ContaRequest{
    private Integer numeroConta;

    public ContaResponse(Conta conta){
        this.setAgencia(conta.getAgencia());
        this.setCpf(conta.getCpf());
        this.setNome(conta.getNome());
        this.setTipoConta(conta.getTipoConta());
        this.setSaldo(conta.getSaldo());
    }

    public static List<ContaResponse> toResponse(List<Conta> contas){
        return contas.stream().map(ContaResponse::new).collect(Collectors.toList());
    }
}
