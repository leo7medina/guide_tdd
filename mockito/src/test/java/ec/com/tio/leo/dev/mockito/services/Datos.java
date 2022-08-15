package ec.com.tio.leo.dev.mockito.services;

import ec.com.tio.leo.dev.mockito.model.Examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Datos {
    public final static List<Examen> EXAMENES = Arrays.asList(new Examen(5L, "Matemáticas", new ArrayList<>()),
            new Examen(6L, "Lenguaje", new ArrayList<>()),
            new Examen(7L, "Historia", new ArrayList<>()));

    public final static List<Examen> EXAMENES_ID_NULL = Arrays.asList(new Examen(null, "Matemáticas", null),
            new Examen(null, "Lenguaje", null),
            new Examen(null, "Historia", null));

    public final static List<Examen> EXAMENES_ID_NEGATIVOS = Arrays.asList(new Examen(-5L, "Matemáticas", null),
            new Examen(-6L, "Lenguaje", null),
            new Examen(null, "Historia", null));
    public final static List<String> PREGUNTAS = Arrays.asList("aritmética","integrales",
            "derivadas", "trigonometría", "geometría");
    public final static Examen EXAMEN = new Examen(null, "Física", new ArrayList<>());
}
