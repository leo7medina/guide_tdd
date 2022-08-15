package ec.com.tio.leo.dev.mockito.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Examen {
    private Long id;
    private String nombre;
    private List<String> preguntas;
}
