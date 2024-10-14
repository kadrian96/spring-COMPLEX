package com.pizzeria.servico.impl;

import com.pizzeria.modelo.Empleado;
import com.pizzeria.modelo.Producto;
import com.pizzeria.repositorio.IEmpleadoRepository;
import com.pizzeria.servico.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmpleadoServiceImpl implements IEmpleadoService {
    @Autowired
    private IEmpleadoRepository empleadoRepository;
    @Override
    public List<Empleado> listarEmpleado() {
        return empleadoRepository.findAll();
    }

    @Override
    public void crearEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    public Optional<Empleado> listarEmpleado(int id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public void borrarEmpleado(int id) {
        empleadoRepository.deleteById(id);

    }
}
