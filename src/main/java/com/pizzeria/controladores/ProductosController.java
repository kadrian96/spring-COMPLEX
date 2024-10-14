package com.pizzeria.controladores;

import com.pizzeria.modelo.Producto;
import com.pizzeria.servico.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductosController {
    @Autowired
    private IProductoService productoService;
    @GetMapping("/productos")
    public String listarProductos(Model model){
        List<Producto> productos=productoService.listarProductos();
        model.addAttribute("productos",productos);
        return "/Producto/listadoProducto";
    }

    @GetMapping("nuevoProducto")
    public String nuevoProducto(Model model){
        model.addAttribute("nuevoProducto", new Producto());
        return "/Producto/nuevoProducto";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(@ModelAttribute("nuevoProducto") Producto producto){
        productoService.crearProducto(producto);
        return "redirect:/productos";
    }

}
