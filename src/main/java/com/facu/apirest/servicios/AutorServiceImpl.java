package com.facu.apirest.servicios;

import com.facu.apirest.entidades.Autor;
import com.facu.apirest.repositorios.AutorRepository;
import com.facu.apirest.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> searchAutor(String filtro) throws Exception{
        try{
            List<Autor> autores = autorRepository.searchAutor(filtro);
            return autores;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }



    //paginacion:

    @Override
    public Page<Autor> searchAutorPaged(String filtro, Pageable pageable) throws Exception {
        try {
            //metodo query
            //Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //jpql
            Page<Autor> autores = autorRepository.searchAutorPaged(filtro, pageable);
            return autores;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


}