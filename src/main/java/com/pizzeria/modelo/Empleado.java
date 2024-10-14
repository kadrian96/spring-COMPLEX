package com.pizzeria.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private Double salario;


}
