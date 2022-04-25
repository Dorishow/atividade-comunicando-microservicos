package br.com.letscode.cliente.controller;

import br.com.letscode.cliente.model.conta.dto.ContaRequest;
import br.com.letscode.cliente.model.conta.dto.ContaResponse;
import br.com.letscode.cliente.model.deposit.Deposit;
import br.com.letscode.cliente.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PostMapping
    public ContaResponse create(@RequestBody ContaRequest contaRequest){
        return contaService.create(contaRequest);
    }

    @GetMapping
    public List<ContaResponse> listAll(){
        return contaService.listAll();
    }

    @PutMapping
    public ContaResponse updateBalance(@RequestBody Deposit deposit){
        return contaService.updateBalance(deposit);
    }
}
