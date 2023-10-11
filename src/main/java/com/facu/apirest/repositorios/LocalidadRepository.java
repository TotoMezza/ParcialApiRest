package com.facu.apirest.repositorios;

import com.facu.apirest.entidades.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {

    @Query(
            value = "SELECT * FROM Localidad WHERE Localidad.denominacion LIKE %:filtro% ",
            nativeQuery = true
    )
    List<Localidad> searchLocalidad(@Param("filtro") String filtro);




    //PAGINACION:
    @Query(value = "SELECT l FROM Localidad l WHERE l.denominacion LIKE %:filtro% ")
    Page<Localidad> searchLocalidadPaged(@Param("filtro") String filtro, Pageable pageable);
}
