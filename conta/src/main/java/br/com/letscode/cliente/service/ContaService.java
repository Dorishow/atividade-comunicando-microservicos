package br.com.letscode.cliente.service;

import br.com.letscode.cliente.model.conta.dto.ContaRequest;
import br.com.letscode.cliente.model.conta.dto.ContaResponse;
import br.com.letscode.cliente.model.deposit.Deposit;

import java.util.List;

public interface ContaService {
    ContaResponse create(ContaRequest contaRequest);
    List<ContaResponse> listAll();
    ContaResponse updateBalance(Deposit deposit);
}
