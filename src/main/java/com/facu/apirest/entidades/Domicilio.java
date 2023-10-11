package com.facu.apirest.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "Domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Domicilio extends Base{
    @Column(name = "Calle")
    private String calle;
    @Column(name = "Número")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_localidad")
    private Localidad localidad;
}
