package com.api.ColabCargo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ColabCargo.models.Cargo;
import com.api.ColabCargo.repositories.CargoRepository;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoRepository cargo_Repository;

    // Método de listagem
    @GetMapping("/listar")
    public Iterable<Cargo> listar() {
        return cargo_Repository.findAll();
    }

    // Método de cadastramento
    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo obj) {
        return cargo_Repository.save(obj);
    }
}
