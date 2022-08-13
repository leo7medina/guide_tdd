package ec.com.tio.leo.dev.junit.model;

import ec.com.tio.leo.dev.junit.exception.DineroInsuficienteException;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Cuenta {
    @NonNull
    private String persona;
    @NonNull
    private BigDecimal saldo;
    private Banco banco;

    public void debito(BigDecimal monto) {
        BigDecimal newSaldo = this.saldo.subtract(monto);
        if (newSaldo.compareTo(BigDecimal.ZERO) < 0) {
            throw new DineroInsuficienteException("Dienero Insuficiente");
        }
        this.saldo = newSaldo;
    }

    public void credito(BigDecimal monto) {
        this.saldo = this.saldo.add(monto);
    }
}
