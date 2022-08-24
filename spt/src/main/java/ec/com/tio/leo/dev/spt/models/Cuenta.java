package ec.com.tio.leo.dev.spt.models;

import ec.com.tio.leo.dev.spt.exceptions.SBException;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cuenta {
    private Long id;
    private String persona;
    private BigDecimal saldo;

    public void debito(BigDecimal monto) {
        BigDecimal nuevoSaldo = this.saldo.subtract(monto);
        if(nuevoSaldo.compareTo(BigDecimal.ZERO) < 0){
            throw new SBException("Dinero insuficiente en la cuenta.");
        }
        this.saldo = nuevoSaldo;
    }

    public void credito(BigDecimal monto) {
        this.saldo = saldo.add(monto);
    }
}
