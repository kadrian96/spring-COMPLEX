package com.pizzeria.servico;

import com.pizzeria.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public List<Producto> listarProductos();
    public void crearProducto(Producto producto);
    public void actualizarProducto(Producto producto);
    public Optional<Producto> listarProducto(int id);
    public void borrarProducto(int id);

}
