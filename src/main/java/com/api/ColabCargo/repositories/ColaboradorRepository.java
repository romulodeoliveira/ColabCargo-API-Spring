package com.api.ColabCargo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.ColabCargo.models.Colaborador;

@Repository
public interface ColaboradorRepository extends CrudRepository<Colaborador, Long> {

}
