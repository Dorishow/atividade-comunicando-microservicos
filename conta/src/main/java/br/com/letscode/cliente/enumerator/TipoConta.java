package br.com.letscode.cliente.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoConta {
    PF("Pessoa Física"), PJ("Pessoa jurídica"), POUPANCA("Poupança");

    private String label;
}
