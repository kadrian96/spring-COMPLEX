package com.pizzeria.repositorio;

import com.pizzeria.modelo.Cliente;
import com.pizzeria.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository  extends JpaRepository<Producto, Integer> {
}
