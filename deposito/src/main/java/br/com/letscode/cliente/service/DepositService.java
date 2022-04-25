package br.com.letscode.cliente.service;

import br.com.letscode.cliente.model.deposit.Deposit;
import br.com.letscode.cliente.model.deposit.dto.DepositResponse;

public interface DepositService {
    DepositResponse depositar(Deposit deposit);
}
