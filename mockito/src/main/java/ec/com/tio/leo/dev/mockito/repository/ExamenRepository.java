package ec.com.tio.leo.dev.mockito.repository;

import ec.com.tio.leo.dev.mockito.model.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();

    Examen guardar(Examen examen);
}
