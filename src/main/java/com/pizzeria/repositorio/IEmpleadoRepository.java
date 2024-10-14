package com.pizzeria.repositorio;

import com.pizzeria.modelo.Cliente;
import com.pizzeria.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository  extends JpaRepository<Empleado, Integer> {
}
