package com.facu.apirest.servicios;

import com.facu.apirest.entidades.Localidad;
import com.facu.apirest.repositorios.BaseRepository;
import com.facu.apirest.repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Localidad> searchLocalidad(String filtro) throws Exception {
        try {
            List<Localidad> localidades = localidadRepository.searchLocalidad(filtro);
            return localidades;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    //PAGINACION:
    @Override
    public Page<Localidad> searchLocalidadPaged(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Localidad> localidades = localidadRepository.searchLocalidadPaged(filtro, pageable);
            return localidades;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}