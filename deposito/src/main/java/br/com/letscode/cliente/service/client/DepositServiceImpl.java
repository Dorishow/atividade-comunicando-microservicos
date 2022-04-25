package br.com.letscode.cliente.service.client;

import br.com.letscode.cliente.model.conta.dto.ContaResponse;
import br.com.letscode.cliente.model.deposit.Deposit;
import br.com.letscode.cliente.model.deposit.dto.DepositResponse;
import br.com.letscode.cliente.service.DepositService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepositServiceImpl implements DepositService {

    @Value("${cliente.deposito.url}")
    private String url;

    public DepositResponse depositar(Deposit deposit) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(deposit, headers);
        ResponseEntity<ContaResponse> contaResponseEntity =
                restTemplate.exchange(
                        url,
                        HttpMethod.PUT,
                        entity,
                        ContaResponse.class
                );
        ContaResponse contaResponse  = contaResponseEntity.getBody();
        DepositResponse depositResponse = new DepositResponse(contaResponse, deposit);
        return depositResponse;

    }
}
