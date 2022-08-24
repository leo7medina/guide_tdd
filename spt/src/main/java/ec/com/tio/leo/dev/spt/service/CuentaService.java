package ec.com.tio.leo.dev.spt.service;

import ec.com.tio.leo.dev.spt.models.Banco;
import ec.com.tio.leo.dev.spt.models.Cuenta;
import ec.com.tio.leo.dev.spt.repository.IBancoRepository;
import ec.com.tio.leo.dev.spt.repository.ICuentaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CuentaService implements ICuentaService {

    private ICuentaRepository cuentaRepository;
    private IBancoRepository bancoRepository;

    public CuentaService() {}

    public CuentaService(ICuentaRepository cuentaRepository, IBancoRepository bancoRepository) {
        this.cuentaRepository = cuentaRepository;
        this.bancoRepository = bancoRepository;
    }

    @Override
    public Cuenta findById(Long id) {
        return cuentaRepository.findById(id);
    }

    @Override
    public int revisarTotalTransferencias(Long bancoId) {
        Banco banco = bancoRepository.findById(bancoId);
        return banco.getTotalTransferencias();
    }

    @Override
    public BigDecimal revisarSaldo(Long cuentaId) {
        Cuenta cuenta = cuentaRepository.findById(cuentaId);
        return cuenta.getSaldo();
    }

    @Override
    public void transferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto, Long bancoId) {
        Cuenta cuentaOrigen = cuentaRepository.findById(numCuentaOrigen);
        cuentaOrigen.debito(monto);
        cuentaRepository.update(cuentaOrigen);

        Cuenta cuentaDestino = cuentaRepository.findById(numCuentaDestino);
        cuentaDestino.credito(monto);
        cuentaRepository.update(cuentaDestino);

        Banco banco = bancoRepository.findById(bancoId);
        int totalTransferencias = banco.getTotalTransferencias();
        banco.setTotalTransferencias(++totalTransferencias);
        bancoRepository.update(banco);
    }
}
