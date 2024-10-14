package com.pizzeria.servico;

import com.pizzeria.modelo.Empleado;
import com.pizzeria.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleado();
    public void crearEmpleado(Empleado empleado);
    public void actualizarEmpleado(Empleado empleado);
    public Optional<Empleado> listarEmpleado(int id);
    public void borrarEmpleado(int id);

}
