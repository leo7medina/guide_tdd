package ec.com.tio.leo.dev.spt.service;

import ec.com.tio.leo.dev.spt.models.Cuenta;

import java.math.BigDecimal;

public interface ICuentaService {
    Cuenta findById(Long id);

    int revisarTotalTransferencias(Long bancoId);

    BigDecimal revisarSaldo(Long cuentaId);

    void transferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto,
                    Long bancoId);
}
