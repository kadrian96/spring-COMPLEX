package com.pizzeria.repositorio;

import com.pizzeria.modelo.Cliente;
import com.pizzeria.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepository  extends JpaRepository<Pedido, Integer> {
}
