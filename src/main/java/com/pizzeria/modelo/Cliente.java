package com.pizzeria.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String nombreCliente;
    private String apellidoCliente;
    @OneToMany(mappedBy = "idCliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos= new ArrayList<>();
}
