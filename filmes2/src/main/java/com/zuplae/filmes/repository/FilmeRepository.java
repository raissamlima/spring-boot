package com.zuplae.filmes.repository;

import com.zuplae.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer> {

// interface - eu defino os métodos, não implemento
// classe - eu implemento, digo o que irá ser feito  
}
    
