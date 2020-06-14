package com.andrealves.myexpenses.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.myexpenses.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
