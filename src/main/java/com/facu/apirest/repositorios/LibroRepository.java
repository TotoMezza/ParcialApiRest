package com.facu.apirest.repositorios;

import com.facu.apirest.entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
