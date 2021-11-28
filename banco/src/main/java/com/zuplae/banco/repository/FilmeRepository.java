package com.zuplae.banco.repository;

import com.zuplae.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer> {

// interface - eu defino os métodos, não implemento
// classe - eu implemento, digo o que irá ser feito  
}
