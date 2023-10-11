package com.facu.apirest.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "Autor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Autor extends Base{
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Biografía",length = 1600)
    private String biografia;
}
