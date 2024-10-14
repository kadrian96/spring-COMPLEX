package com.pizzeria.servico.impl;

import com.pizzeria.modelo.Producto;
import com.pizzeria.repositorio.IProductoRepository;
import com.pizzeria.servico.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    private IProductoRepository productoRepository;
    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void crearProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> listarProducto(int id) {
        return productoRepository.findById(id);
    }

    @Override
    public void borrarProducto(int id) {
        productoRepository.deleteById(id);
    }
}
