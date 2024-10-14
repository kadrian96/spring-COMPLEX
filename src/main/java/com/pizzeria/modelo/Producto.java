package com.pizzeria.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String nombre;
    private double precio;
    private int stock;
    @OneToMany(mappedBy = "idProducto", cascade = CascadeType.ALL)
    private List<Pedido> pedidos= new ArrayList<>();



}
