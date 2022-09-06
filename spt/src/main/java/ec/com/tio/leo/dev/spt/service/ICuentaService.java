package ec.com.tio.leo.dev.spt.service;

import ec.com.tio.leo.dev.spt.models.Cuenta;

import java.math.BigDecimal;
import java.util.List;

public interface ICuentaService {

    List<Cuenta> findAll();
    Cuenta findById(Long id);

    Cuenta save(Cuenta cuenta);

    int revisarTotalTransferencias(Long bancoId);

    BigDecimal revisarSaldo(Long cuentaId);

    void transferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto,
                    Long bancoId);
}
