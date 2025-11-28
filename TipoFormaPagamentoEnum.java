package br.com.etechas.Pagamento.enums;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public enum TipoFormaPagamentoEnum {
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    VALE_REFEICAO
}
