package ec.com.tio.leo.dev.mockito.repository;

import ec.com.tio.leo.dev.mockito.Datos;
import ec.com.tio.leo.dev.mockito.model.Examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositoryImpl implements ExamenRepository {

    @Override
    public List<Examen> findAll() {
        System.out.println("ExamenRepositoryImpl.findAll");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Datos.EXAMENES;
    }

    public Examen guardar(Examen examen) {
        System.out.println("ExamenRepositoryImpl.guardar");
        return Datos.EXAMEN;
    }
}
