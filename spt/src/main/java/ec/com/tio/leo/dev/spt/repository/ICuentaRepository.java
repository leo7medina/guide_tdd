package ec.com.tio.leo.dev.spt.repository;

import ec.com.tio.leo.dev.spt.models.Cuenta;

import java.util.List;

public interface ICuentaRepository {
    List<Cuenta> findAll();

    Cuenta findById(Long id);

    void update(Cuenta cuenta);
}
