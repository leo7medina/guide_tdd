package ec.com.tio.leo.dev.spt.repository;

import ec.com.tio.leo.dev.spt.models.Banco;

import java.util.List;

public interface IBancoRepository {

    List<Banco> findAll();

    Banco findById(Long id);

    void update(Banco banco);
}
