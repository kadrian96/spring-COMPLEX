package com.pizzeria.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @ManyToOne
    @JoinColumn(name="idProducto")
    private Producto idProducto;
    @ManyToOne
    @JoinColumn(name="idCLiente")
    private Cliente idCliente;
    private int cantidad;




}
