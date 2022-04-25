package br.com.letscode.cliente.controller;

import br.com.letscode.cliente.model.deposit.Deposit;
import br.com.letscode.cliente.model.deposit.dto.DepositResponse;
import br.com.letscode.cliente.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposito")
public class DepositController {

    @Autowired
    private DepositService depositService;

    @PutMapping
    public DepositResponse depositar(@RequestBody Deposit deposit){
        return depositService.depositar(deposit);
    }
}
