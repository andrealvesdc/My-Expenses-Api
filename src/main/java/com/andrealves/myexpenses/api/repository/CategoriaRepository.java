package com.andrealves.myexpenses.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.myexpenses.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
