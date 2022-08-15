package ec.com.tio.leo.dev.mockito.repository;

import java.util.List;

public interface PreguntaRepository {

    List<String> findPreguntasPorExamenId(Long id);

    void guardarVarias(List<String> preguntas);
}
