package br.com.letscode.cliente.repository;

import br.com.letscode.cliente.model.conta.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, String> {
    Conta findByNumeroContaAndAgencia(Integer numeroConta, Integer agencia);
}
