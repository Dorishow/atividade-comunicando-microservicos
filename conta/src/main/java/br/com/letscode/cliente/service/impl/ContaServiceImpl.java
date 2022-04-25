package br.com.letscode.cliente.service.impl;

import br.com.letscode.cliente.model.conta.Conta;
import br.com.letscode.cliente.model.conta.dto.ContaRequest;
import br.com.letscode.cliente.model.conta.dto.ContaResponse;
import br.com.letscode.cliente.model.deposit.Deposit;
import br.com.letscode.cliente.repository.ContaRepository;
import br.com.letscode.cliente.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Override
    public ContaResponse create(ContaRequest contaRequest) {
        Conta conta = new Conta(contaRequest);
        ContaResponse contaResponse = new ContaResponse(contaRepository.save(conta));
        return contaResponse;
    }

    @Override
    public List<ContaResponse> listAll() {
        List<ContaResponse> contas = ContaResponse.toResponse(contaRepository.findAll());
        return contas;
    }

    @Override
    public ContaResponse updateBalance(Deposit deposit) {
        Conta conta = contaRepository.findByNumeroContaAndAgencia(deposit.getNumeroConta(), deposit.getAgencia());
        conta.setSaldo(conta.getSaldo().add(deposit.getValor()));
        ContaResponse contaResponse = new ContaResponse(contaRepository.save(conta));
        return contaResponse;
    }
}
