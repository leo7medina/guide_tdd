package ec.com.tio.leo.dev.mockito.services;

import ec.com.tio.leo.dev.mockito.model.Examen;

import java.util.Optional;

public interface ExamenService {

    Optional<Examen> findExamenPorNombre(String nombre);

    Examen findExamenPorNombreConPreguntas(String nombre);

    Examen guardar(Examen examen);
}
