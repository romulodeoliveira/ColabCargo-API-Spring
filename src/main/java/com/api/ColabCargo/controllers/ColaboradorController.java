package com.api.ColabCargo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ColabCargo.models.Colaborador;

import com.api.ColabCargo.repositories.ColaboradorRepository;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository colaborador_repository;

    @GetMapping("/listar")
    public Iterable<Colaborador> listar() {
        return colaborador_repository.findAll();
    }

    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj) {
        return colaborador_repository.save(obj);
    }
}
