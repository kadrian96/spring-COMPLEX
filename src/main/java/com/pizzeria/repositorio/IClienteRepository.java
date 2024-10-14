package com.pizzeria.repositorio;

import com.pizzeria.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
}
