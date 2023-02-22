package com.api.ColabCargo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.ColabCargo.models.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Long> {

}
