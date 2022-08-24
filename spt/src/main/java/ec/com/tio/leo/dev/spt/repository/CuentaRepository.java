package ec.com.tio.leo.dev.spt.repository;

import ec.com.tio.leo.dev.spt.Datos;
import ec.com.tio.leo.dev.spt.models.Cuenta;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CuentaRepository implements ICuentaRepository{

    private List<Cuenta> listCuentas = Arrays.asList(Datos.crearCuenta001(),Datos.crearCuenta002());
    @Override
    public List<Cuenta> findAll() {
        return listCuentas;
    }

    @Override
    public Cuenta findById(Long id) {
        Cuenta cuentaFound = listCuentas.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return cuentaFound;
    }

    @Override
    public void update(Cuenta cuenta) {
        Cuenta cuenta1 = listCuentas.stream().filter(x -> x.getId().equals(cuenta.getId())).findFirst().orElse(null);
        cuenta1 = cuenta;
    }
}
